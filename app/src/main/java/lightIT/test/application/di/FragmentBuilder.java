package lightIT.test.application.di;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import lightIT.test.application.app.home.FirstFragment;
import lightIT.test.application.di.home.first.FirstFragmentComponent;

@Module
public abstract class FragmentBuilder {

    @Binds
    @IntoMap
    @FragmentKey(FirstFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindUserFragment(FirstFragmentComponent.Builder builder);
}


