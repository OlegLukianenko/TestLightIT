package lightIT.test.application.di.home.login;


import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import lightIT.test.application.app.home.LoginFragment;
import lightIT.test.application.viewmodel.LoginFragmentViewModel;

@Module
public class LoginFragmentModule {

    @Provides
    LoginFragmentViewModel provideViewModel(LoginFragment fragment, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(fragment, factory).get(LoginFragmentViewModel.class);
    }

}