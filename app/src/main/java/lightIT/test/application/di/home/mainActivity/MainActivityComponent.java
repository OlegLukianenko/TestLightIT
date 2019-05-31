package lightIT.test.application.di.home.mainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import lightIT.test.application.app.home.MainActivity;
import lightIT.test.application.di.MainFragmentBuilder;

@Subcomponent(modules = {
        MainFragmentBuilder.class,
        MainActivityModule.class})

public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> { }
}

