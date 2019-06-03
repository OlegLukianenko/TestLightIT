package lightIT.test.application.app.home;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import lightIT.test.application.R;
import lightIT.test.application.base.BaseFragment;
import lightIT.test.application.data.retrofit.ResponseWrap;
import lightIT.test.application.data.retrofit.response.LoginResponse;
import lightIT.test.application.databinding.FragmentLoginBinding;
import lightIT.test.application.di.viewmodel.Injectable;
import lightIT.test.application.utils.NetworkHelper;
import lightIT.test.application.viewmodel.LoginFragmentViewModel;

import static lightIT.test.application.data.repository.RepositoryImpl.TIMEOUT_CODE;

public class LoginFragment extends BaseFragment<FragmentLoginBinding> implements
        Injectable {

    private static final String TAG = LoginFragment.class.getSimpleName();

    @Inject
    protected LoginFragmentViewModel viewModel;

    @Inject
    protected NetworkHelper networkHelper;

    @Inject
    protected SharedPreferences sharedPreferences;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        initSubscribers();
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_login;
    }

    private void initSubscribers() {
        viewModel.observeInvalidEmailAddress().observe(this, Void ->
                showToast(getString(R.string.invalid_email_address), Toast.LENGTH_SHORT));

        viewModel.getLoginResponse().observe(this, this::handleLoginResponse);

        viewModel.observeEmptyUsernameFieldError().observe(this, mVoid ->
                showToast(getString(R.string.empty_username_string), Toast.LENGTH_SHORT));

        viewModel.observeEmptyPasswordFieldError().observe(this, mVoid ->
                showToast(getString(R.string.empty_password_string), Toast.LENGTH_SHORT));

        viewModel.observeEmptyLoginFieldsError().observe(this, mVoid ->
                showToast(getString(R.string.empty_login_fields_string), Toast.LENGTH_SHORT));

        viewModel.observeInternetConnectionError().observe(this, mVoid ->
                showToast(getString(R.string.check_internet_connection_string), Toast.LENGTH_SHORT));

    }

    private void handleLoginResponse(ResponseWrap<LoginResponse> response) {
        if (response.status) {
            sharedPreferences.edit().putString(getString(R.string.token), response.data.token).apply();
//            Intent intent = new Intent(mContext, MainActivity.class);
//            startActivity(intent);
//            getActivity().finish();
        } else {
            if (response.statusCode == TIMEOUT_CODE) {
                if (networkHelper.isNetworkAvailable()) {
                    showToast(getString(R.string.poor_internet_connection), Toast.LENGTH_LONG);
                }
            }
            else {
                showToast(response.message, Toast.LENGTH_SHORT);
            }

            viewModel.setLoginButtonClickable();
        }
    }

    private void showLoginFields() {
        binding.loginViewsWrap.setAlpha(0f);
        binding.loginViewsWrap.setVisibility(View.VISIBLE);
        binding.loginViewsWrap.animate().alpha(1f).setDuration(500).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                binding.loginViewsWrap.setVisibility(View.VISIBLE);
            }
        });
    }


    @Override
    public void onResume() {
        super.onResume();
        showLoginFields();
    }
}