// Generated by Dagger (https://google.github.io/dagger).
package lightIT.test.application.app.splash;

import android.content.SharedPreferences;
import dagger.MembersInjector;
import javax.inject.Provider;
import lightIT.test.application.utils.NetworkHelper;
import lightIT.test.application.viewmodel.SplashActivityViewModel;

public final class SplashActivity_MembersInjector implements MembersInjector<SplashActivity> {
  private final Provider<SplashActivityViewModel> viewModelProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public SplashActivity_MembersInjector(
      Provider<SplashActivityViewModel> viewModelProvider,
      Provider<NetworkHelper> networkHelperProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.viewModelProvider = viewModelProvider;
    this.networkHelperProvider = networkHelperProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  public static MembersInjector<SplashActivity> create(
      Provider<SplashActivityViewModel> viewModelProvider,
      Provider<NetworkHelper> networkHelperProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new SplashActivity_MembersInjector(
        viewModelProvider, networkHelperProvider, sharedPreferencesProvider);
  }

  @Override
  public void injectMembers(SplashActivity instance) {
    injectViewModel(instance, viewModelProvider.get());
    injectNetworkHelper(instance, networkHelperProvider.get());
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
  }

  public static void injectViewModel(SplashActivity instance, SplashActivityViewModel viewModel) {
    instance.viewModel = viewModel;
  }

  public static void injectNetworkHelper(SplashActivity instance, NetworkHelper networkHelper) {
    instance.networkHelper = networkHelper;
  }

  public static void injectSharedPreferences(
      SplashActivity instance, SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }
}
