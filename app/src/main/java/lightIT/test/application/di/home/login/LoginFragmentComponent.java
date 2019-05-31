package lightIT.test.application.di.home.login;


import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import lightIT.test.application.app.home.LoginFragment;

@Subcomponent(modules = LoginFragmentModule.class)
public interface LoginFragmentComponent extends AndroidInjector<LoginFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginFragment> {}
}