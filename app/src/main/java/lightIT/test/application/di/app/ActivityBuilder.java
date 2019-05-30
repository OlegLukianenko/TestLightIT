package lightIT.test.application.di.app;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import lightIT.test.application.app.home.MainActivity;
import lightIT.test.application.app.splash.SplashActivity;
import lightIT.test.application.di.home.mainActivity.MainActivityComponent;
import lightIT.test.application.di.splash.SplashActivityComponent;

@Module
public abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(SplashActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindSplashActivity(SplashActivityComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);

}