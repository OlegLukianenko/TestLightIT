package lightIT.test.application.di.home.registration;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import lightIT.test.application.app.home.RegistrationFragment;
import lightIT.test.application.viewmodel.RegistrationFragmentViewModel;


@Module
public class RegistrationFragmentModule {

    @Provides
    RegistrationFragmentViewModel provideViewModel(RegistrationFragment fragment, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(fragment, factory).get(RegistrationFragmentViewModel.class);
    }

}