package lightIT.test.application.app.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import lightIT.test.application.R;
import lightIT.test.application.app.home.adapter.ReviewRecyclerAdapter;
import lightIT.test.application.base.BaseFragment;
import lightIT.test.application.data.retrofit.response.Product;
import lightIT.test.application.databinding.FragmentDescriptionBinding;
import lightIT.test.application.di.viewmodel.Injectable;
import lightIT.test.application.utils.NetworkHelper;
import lightIT.test.application.viewmodel.DescriptionFragmentViewModel;

import static lightIT.test.application.data.repository.RepositoryImpl.TIMEOUT_CODE;

public class DescriptionFragment extends BaseFragment<FragmentDescriptionBinding> implements
        Injectable {

    @Inject
    DescriptionFragmentViewModel viewModel;

    @Inject
    protected NetworkHelper networkHelper;

    @Inject
    ReviewRecyclerAdapter reviewRecyclerAdapter;

    @Override
    protected int getLayout() {
        return R.layout.fragment_description;
    }

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
            viewModel.sendReviewRequest(product.id);
        }
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
                viewModel.getProgressBarEvent().postValue(false);
            } else {
                if (reviewListResponseWrap.statusCode == TIMEOUT_CODE) {
                    if (networkHelper.isNetworkAvailable()) {
                        showToast(getString(R.string.poor_internet_connection), Toast.LENGTH_LONG);
                    }
                } else {
                    showToast(reviewListResponseWrap.message, Toast.LENGTH_LONG);
                }
                viewModel.getProgressBarEvent().postValue(false);
            }
        });


        viewModel.getPostReviewResponse().observe(this, postReviewResponseWrap ->
        {
            if (postReviewResponseWrap.status) {
                viewModel.getPostButtonClickable().setValue(true);
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

    }

    public void clickBackButton() {
        getActivity().onBackPressed();
    }

}
