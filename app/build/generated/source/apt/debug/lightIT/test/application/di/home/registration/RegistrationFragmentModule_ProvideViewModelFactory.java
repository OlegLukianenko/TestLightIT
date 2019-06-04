// Generated by Dagger (https://google.github.io/dagger).
package lightIT.test.application.di.home.registration;

import android.arch.lifecycle.ViewModelProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import lightIT.test.application.app.home.RegistrationFragment;
import lightIT.test.application.viewmodel.RegistrationFragmentViewModel;

public final class RegistrationFragmentModule_ProvideViewModelFactory
    implements Factory<RegistrationFragmentViewModel> {
  private final RegistrationFragmentModule module;

  private final Provider<RegistrationFragment> fragmentProvider;

  private final Provider<ViewModelProvider.Factory> factoryProvider;

  public RegistrationFragmentModule_ProvideViewModelFactory(
      RegistrationFragmentModule module,
      Provider<RegistrationFragment> fragmentProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    this.module = module;
    this.fragmentProvider = fragmentProvider;
    this.factoryProvider = factoryProvider;
  }

  @Override
  public RegistrationFragmentViewModel get() {
    return provideInstance(module, fragmentProvider, factoryProvider);
  }

  public static RegistrationFragmentViewModel provideInstance(
      RegistrationFragmentModule module,
      Provider<RegistrationFragment> fragmentProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    return proxyProvideViewModel(module, fragmentProvider.get(), factoryProvider.get());
  }

  public static RegistrationFragmentModule_ProvideViewModelFactory create(
      RegistrationFragmentModule module,
      Provider<RegistrationFragment> fragmentProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    return new RegistrationFragmentModule_ProvideViewModelFactory(
        module, fragmentProvider, factoryProvider);
  }

  public static RegistrationFragmentViewModel proxyProvideViewModel(
      RegistrationFragmentModule instance,
      RegistrationFragment fragment,
      ViewModelProvider.Factory factory) {
    return Preconditions.checkNotNull(
        instance.provideViewModel(fragment, factory),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
