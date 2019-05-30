package lightIT.test.application.di.splash;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import lightIT.test.application.app.splash.SplashActivity;
import lightIT.test.application.viewmodel.SplashActivityViewModel;

@Module
public class SplashModule {

    @Provides
    SplashActivityViewModel provideSplashViewModel(SplashActivity activity, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(activity, factory).get(SplashActivityViewModel.class);
    }

}
