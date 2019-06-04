package lightIT.test.application.app.home;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import lightIT.test.application.R;
import lightIT.test.application.app.home.adapter.ReviewRecyclerAdapter;
import lightIT.test.application.base.BaseFragment;
import lightIT.test.application.data.retrofit.response.Product;
import lightIT.test.application.databinding.FragmentDescriptionBinding;
import lightIT.test.application.di.viewmodel.Injectable;
import lightIT.test.application.utils.KeyboardStateManager;
import lightIT.test.application.utils.NetworkHelper;
import lightIT.test.application.viewmodel.DescriptionFragmentViewModel;

import static lightIT.test.application.app.home.MainActivity.USER_TOKEN_SP;
import static lightIT.test.application.data.repository.RepositoryImpl.TIMEOUT_CODE;

public class DescriptionFragment extends BaseFragment<FragmentDescriptionBinding> implements
        Injectable {

    @Inject
    DescriptionFragmentViewModel viewModel;

    @Inject
    protected NetworkHelper networkHelper;

    @Inject
    protected SharedPreferences sharedPreferences;

    @Inject
    ReviewRecyclerAdapter reviewRecyclerAdapter;

    @Override
    protected int getLayout() {
        return R.layout.fragment_description;
    }

    int productId;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.setViewModel(viewModel);
        binding.setHandler(this);
        binding.setLifecycleOwner(this);

        viewModel.getProgressBarEvent().postValue(true);

        initUserAdapter();
        initSubscribers();

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            Product product = bundle.getParcelable("product");
            viewModel.getDescriptionFromApi().postValue(product);
            productId = product.id;
            viewModel.sendReviewRequest(productId);
        }

        if (sharedPreferences.getString(USER_TOKEN_SP, "").isEmpty())
            viewModel.getIsAuthorizationEvent().postValue(false);
        else
            viewModel.getIsAuthorizationEvent().postValue(true);
    }

    private void initUserAdapter() {
        binding.recycleView.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recycleView.setAdapter(reviewRecyclerAdapter);
    }

    private void initSubscribers() {
        viewModel.getReviewtListResponseMutable().observe(this, reviewListResponseWrap ->
        {
            if (reviewListResponseWrap.status) {
                reviewRecyclerAdapter.setItems(reviewListResponseWrap.data);
            } else {
                if (reviewListResponseWrap.statusCode == TIMEOUT_CODE) {
                    if (networkHelper.isNetworkAvailable()) {
                        showToast(getString(R.string.poor_internet_connection), Toast.LENGTH_LONG);
                    }
                } else {
                    showToast(reviewListResponseWrap.message, Toast.LENGTH_LONG);
                }
            }
            viewModel.getProgressBarEvent().postValue(false);
        });


        viewModel.getPostReviewResponse().observe(this, postReviewResponseWrap ->
        {
            if (postReviewResponseWrap.status) {
                viewModel.getPostButtonClickable().setValue(true);
                viewModel.sendReviewRequest(productId);

            } else {
                if (postReviewResponseWrap.statusCode == TIMEOUT_CODE) {
                    if (networkHelper.isNetworkAvailable()) {
                        showToast(getString(R.string.poor_internet_connection), Toast.LENGTH_LONG);
                    }
                } else {
                    Toast.makeText(getContext(), postReviewResponseWrap.message, Toast.LENGTH_LONG).show();
                }
                viewModel.getPostButtonClickable().setValue(true);
            }
        });

        viewModel.observeEmptyFieldsError().observe(this, mVoid ->
                showToast(getString(R.string.empty_login_fields_string), Toast.LENGTH_SHORT));

        viewModel.observeInternetConnectionError().observe(this, mVoid ->
                showToast(getString(R.string.check_internet_connection_string), Toast.LENGTH_SHORT));


        viewModel.observeAuthorizationEvent().observe(this, mVoid -> {
            KeyboardStateManager.hideSoftKeyboard(getActivity());
            ((MainActivity) getActivity()).showFragment(new LoginFragment());
        });

        viewModel.observeShouldSignEvent().observe(this, mVoid ->
                showToast(getString(R.string.you_should_sign), Toast.LENGTH_SHORT));

        viewModel.observeLogoutClickEvent().observe(this, mVoid -> {
            KeyboardStateManager.hideSoftKeyboard(getActivity());
            sharedPreferences.edit().putString(USER_TOKEN_SP, "").apply();
            redrawFragment();
        });
    }

    private void redrawFragment() {
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .detach(this)
                .commitNowAllowingStateLoss();
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .attach(this)
                .commitAllowingStateLoss();
    }

    public void clickBackButton() {
        getActivity().onBackPressed();
    }

}
