// Generated by Dagger (https://google.github.io/dagger).
package lightIT.test.application.app.home;

import dagger.MembersInjector;
import javax.inject.Provider;
import lightIT.test.application.viewmodel.ProductFragmentViewModel;

public final class FirstFragment_MembersInjector implements MembersInjector<ProductFragment> {
  private final Provider<ProductFragmentViewModel> viewModelProvider;

  public FirstFragment_MembersInjector(Provider<ProductFragmentViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<ProductFragment> create(
      Provider<ProductFragmentViewModel> viewModelProvider) {
    return new FirstFragment_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(ProductFragment instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  public static void injectViewModel(ProductFragment instance, ProductFragmentViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
