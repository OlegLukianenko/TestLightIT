package lightIT.test.application.app.home;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import javax.inject.Inject;

import lightIT.test.application.R;
import lightIT.test.application.base.BaseFragment;
import lightIT.test.application.databinding.FragmentLoginBinding;
import lightIT.test.application.di.viewmodel.Injectable;
import lightIT.test.application.utils.NetworkHelper;
import lightIT.test.application.viewmodel.LoginFragmentViewModel;

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