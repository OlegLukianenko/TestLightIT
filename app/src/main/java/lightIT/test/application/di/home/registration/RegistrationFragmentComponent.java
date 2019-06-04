package lightIT.test.application.di.home.registration;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import lightIT.test.application.app.home.RegistrationFragment;

@Subcomponent(modules = RegistrationFragmentModule.class)
public interface RegistrationFragmentComponent extends AndroidInjector<RegistrationFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<RegistrationFragment> {
    }
}