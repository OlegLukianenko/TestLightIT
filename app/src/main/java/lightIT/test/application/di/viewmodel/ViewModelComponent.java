package lightIT.test.application.di.viewmodel;

import dagger.Subcomponent;
import lightIT.test.application.viewmodel.DescriptionFragmentViewModel;
import lightIT.test.application.viewmodel.ProductFragmentViewModel;
import lightIT.test.application.viewmodel.LoginFragmentViewModel;
import lightIT.test.application.viewmodel.RegistrationFragmentViewModel;
import lightIT.test.application.viewmodel.SplashActivityViewModel;

@Subcomponent
public interface ViewModelComponent {

    @Subcomponent.Builder
    interface Builder {
        ViewModelComponent build();
    }

    SplashActivityViewModel splashActivityViewModel();

    ProductFragmentViewModel productFragmentViewModel();

    LoginFragmentViewModel loginFragmentViewModel();

    DescriptionFragmentViewModel descriptionFragmentViewModel();

    RegistrationFragmentViewModel registrationFragmentViewModel();
}
