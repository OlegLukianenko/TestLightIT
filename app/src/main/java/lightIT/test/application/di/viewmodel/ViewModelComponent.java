package lightIT.test.application.di.viewmodel;

import dagger.Subcomponent;
import lightIT.test.application.viewmodel.FirstFragmentViewModel;
import lightIT.test.application.viewmodel.SplashActivityViewModel;

@Subcomponent
public interface ViewModelComponent {

    @Subcomponent.Builder
    interface Builder {
        ViewModelComponent build();
    }

    SplashActivityViewModel splashActivityViewModel();

    FirstFragmentViewModel firstFragmentViewModel();
}
