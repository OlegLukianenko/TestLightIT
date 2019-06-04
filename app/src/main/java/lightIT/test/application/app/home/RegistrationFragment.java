package lightIT.test.application.app.home;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import lightIT.test.application.R;
import lightIT.test.application.base.BaseFragment;
import lightIT.test.application.data.retrofit.ResponseWrap;
import lightIT.test.application.data.retrofit.response.LoginResponse;
import lightIT.test.application.databinding.FragmentRegistrationBinding;
import lightIT.test.application.di.viewmodel.Injectable;
import lightIT.test.application.utils.NetworkHelper;
import lightIT.test.application.viewmodel.RegistrationFragmentViewModel;

import static lightIT.test.application.app.home.MainActivity.USER_TOKEN_SP;
import static lightIT.test.application.data.repository.RepositoryImpl.TIMEOUT_CODE;

public class RegistrationFragment extends BaseFragment<FragmentRegistrationBinding> implements
        Injectable {

    @Inject
    protected RegistrationFragmentViewModel viewModel;

    @Inject
    protected NetworkHelper networkHelper;

    @Inject
    protected SharedPreferences sharedPreferences;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
        binding.setHandler(this);

        initSubscribers();
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_registration;
    }

    private void initSubscribers() {
        viewModel.observeInvalidEmailAddress().observe(this, Void ->
                showToast(getString(R.string.invalid_email_address), Toast.LENGTH_SHORT));

        viewModel.getRegistrationResponse().observe(this, this::handleRegistrationResponse);

        viewModel.observeEmptyUsernameFieldError().observe(this, mVoid ->
                showToast(getString(R.string.empty_username_string), Toast.LENGTH_SHORT));

        viewModel.observeEmptyPasswordFieldError().observe(this, mVoid ->
                showToast(getString(R.string.empty_password_string), Toast.LENGTH_SHORT));

        viewModel.observeEmptyLoginFieldsError().observe(this, mVoid ->
                showToast(getString(R.string.empty_login_fields_string), Toast.LENGTH_SHORT));

        viewModel.observeInternetConnectionError().observe(this, mVoid ->
                showToast(getString(R.string.check_internet_connection_string), Toast.LENGTH_SHORT));
    }

    private void handleRegistrationResponse(ResponseWrap<LoginResponse> response) {
        if (response.data.success) {
            sharedPreferences.edit().putString(USER_TOKEN_SP, response.data.token).apply();
             getActivity().getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            ((MainActivity) getActivity()).showFragment(new ProductFragment());

        } else {
            if (response.statusCode == TIMEOUT_CODE) {
                if (networkHelper.isNetworkAvailable()) {
                    showToast(getString(R.string.poor_internet_connection), Toast.LENGTH_LONG);
                }
            } else {
                showToast(response.data.message, Toast.LENGTH_SHORT);
            }
        }
        viewModel.setRegistrationButtonClickable();
    }

    private void showLoginFields() {
        binding.registrationViewsWrap.setAlpha(0f);
        binding.registrationViewsWrap.setVisibility(View.VISIBLE);
        binding.registrationViewsWrap.animate().alpha(1f).setDuration(500).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                binding.registrationViewsWrap.setVisibility(View.VISIBLE);
            }
        });
    }

    public void clickBackButton() {
        getActivity().onBackPressed();
    }

    @Override
    public void onResume() {
        super.onResume();
        showLoginFields();
    }

}
