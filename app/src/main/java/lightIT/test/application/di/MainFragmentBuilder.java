package lightIT.test.application.di;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import lightIT.test.application.app.home.DescriptionFragment;
import lightIT.test.application.app.home.ProductFragment;
import lightIT.test.application.app.home.LoginFragment;
import lightIT.test.application.di.home.description.DescriptionFragmentComponent;
import lightIT.test.application.di.home.product.ProductFragmentComponent;
import lightIT.test.application.di.home.login.LoginFragmentComponent;

@Module
public abstract class MainFragmentBuilder {

    @Binds
    @IntoMap
    @FragmentKey(ProductFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindFirstFragment(ProductFragmentComponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(DescriptionFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindDescriptionFragment(DescriptionFragmentComponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(LoginFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindLoginFragment(LoginFragmentComponent.Builder builder);

}


