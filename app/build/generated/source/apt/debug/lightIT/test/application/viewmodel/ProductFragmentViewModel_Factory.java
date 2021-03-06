// Generated by Dagger (https://google.github.io/dagger).
package lightIT.test.application.viewmodel;

import dagger.internal.Factory;
import javax.inject.Provider;
import lightIT.test.application.data.repository.RepositoryApi;

public final class ProductFragmentViewModel_Factory implements Factory<ProductFragmentViewModel> {
  private final Provider<RepositoryApi> repositoryApiProvider;

  public ProductFragmentViewModel_Factory(Provider<RepositoryApi> repositoryApiProvider) {
    this.repositoryApiProvider = repositoryApiProvider;
  }

  @Override
  public ProductFragmentViewModel get() {
    return provideInstance(repositoryApiProvider);
  }

  public static ProductFragmentViewModel provideInstance(
      Provider<RepositoryApi> repositoryApiProvider) {
    ProductFragmentViewModel instance = new ProductFragmentViewModel();
    ProductFragmentViewModel_MembersInjector.injectRepositoryApi(
        instance, repositoryApiProvider.get());
    return instance;
  }

  public static ProductFragmentViewModel_Factory create(
      Provider<RepositoryApi> repositoryApiProvider) {
    return new ProductFragmentViewModel_Factory(repositoryApiProvider);
  }

  public static ProductFragmentViewModel newProductFragmentViewModel() {
    return new ProductFragmentViewModel();
  }
}
