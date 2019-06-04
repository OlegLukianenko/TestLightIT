package lightIT.test.application.di.home.mainActivity;

import dagger.Module;
import lightIT.test.application.di.home.description.DescriptionFragmentComponent;
import lightIT.test.application.di.home.product.ProductFragmentComponent;
import lightIT.test.application.di.home.login.LoginFragmentComponent;
import lightIT.test.application.di.home.registration.RegistrationFragmentComponent;

@Module (subcomponents = {
        ProductFragmentComponent.class,
        LoginFragmentComponent.class,
        DescriptionFragmentComponent.class,
        RegistrationFragmentComponent.class})
public class MainActivityModule {

}
