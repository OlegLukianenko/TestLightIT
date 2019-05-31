// Generated by Dagger (https://google.github.io/dagger).
package lightIT.test.application.di.home.product;

import android.arch.lifecycle.ViewModelProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import lightIT.test.application.app.home.ProductFragment;
import lightIT.test.application.viewmodel.ProductFragmentViewModel;

public final class ProductFragmentModule_ProvideViewModelFactory
    implements Factory<ProductFragmentViewModel> {
  private final ProductFragmentModule module;

  private final Provider<ProductFragment> fragmentProvider;

  private final Provider<ViewModelProvider.Factory> factoryProvider;

  public ProductFragmentModule_ProvideViewModelFactory(
      ProductFragmentModule module,
      Provider<ProductFragment> fragmentProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    this.module = module;
    this.fragmentProvider = fragmentProvider;
    this.factoryProvider = factoryProvider;
  }

  @Override
  public ProductFragmentViewModel get() {
    return provideInstance(module, fragmentProvider, factoryProvider);
  }

  public static ProductFragmentViewModel provideInstance(
      ProductFragmentModule module,
      Provider<ProductFragment> fragmentProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    return proxyProvideViewModel(module, fragmentProvider.get(), factoryProvider.get());
  }

  public static ProductFragmentModule_ProvideViewModelFactory create(
      ProductFragmentModule module,
      Provider<ProductFragment> fragmentProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    return new ProductFragmentModule_ProvideViewModelFactory(
        module, fragmentProvider, factoryProvider);
  }

  public static ProductFragmentViewModel proxyProvideViewModel(
      ProductFragmentModule instance, ProductFragment fragment, ViewModelProvider.Factory factory) {
    return Preconditions.checkNotNull(
        instance.provideViewModel(fragment, factory),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}