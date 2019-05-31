package lightIT.test.application.di.home.description;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import lightIT.test.application.app.home.DescriptionFragment;

@Subcomponent(modules = DescriptionFragmentModule.class)
public interface DescriptionFragmentComponent extends AndroidInjector<DescriptionFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<DescriptionFragment> {}
}