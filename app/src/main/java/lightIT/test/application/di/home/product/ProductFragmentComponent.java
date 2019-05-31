package lightIT.test.application.di.home.product;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import lightIT.test.application.app.home.ProductFragment;

@Subcomponent(modules = ProductFragmentModule.class)
public interface ProductFragmentComponent extends AndroidInjector<ProductFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ProductFragment> {}
}

