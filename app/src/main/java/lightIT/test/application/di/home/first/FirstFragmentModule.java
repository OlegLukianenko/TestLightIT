package lightIT.test.application.di.home.first;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import lightIT.test.application.app.home.FirstFragment;
import lightIT.test.application.viewmodel.FirstFragmentViewModel;

@Module
public class FirstFragmentModule {

    @Provides
    FirstFragmentViewModel provideViewModel(FirstFragment fragment, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(fragment, factory).get(FirstFragmentViewModel.class);
    }

}
