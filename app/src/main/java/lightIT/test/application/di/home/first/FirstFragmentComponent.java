package lightIT.test.application.di.home.first;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import lightIT.test.application.app.home.FirstFragment;

@Subcomponent(modules = FirstFragmentModule.class)
public interface FirstFragmentComponent extends AndroidInjector<FirstFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FirstFragment> {}
}

