package lightIT.test.application.di.home.mainActivity;

import dagger.Module;
import lightIT.test.application.di.home.product.ProductFragmentComponent;
import lightIT.test.application.di.home.login.LoginFragmentComponent;

@Module (subcomponents = {
        ProductFragmentComponent.class,
        LoginFragmentComponent.class})
public class MainActivityModule {

}
