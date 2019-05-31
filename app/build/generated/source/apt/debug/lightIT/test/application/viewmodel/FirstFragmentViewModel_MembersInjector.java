// Generated by Dagger (https://google.github.io/dagger).
package lightIT.test.application.viewmodel;

import dagger.MembersInjector;
import javax.inject.Provider;
import lightIT.test.application.data.repository.RepositoryApi;

public final class FirstFragmentViewModel_MembersInjector
    implements MembersInjector<ProductFragmentViewModel> {
  private final Provider<RepositoryApi> repositoryApiProvider;

  public FirstFragmentViewModel_MembersInjector(Provider<RepositoryApi> repositoryApiProvider) {
    this.repositoryApiProvider = repositoryApiProvider;
  }

  public static MembersInjector<ProductFragmentViewModel> create(
      Provider<RepositoryApi> repositoryApiProvider) {
    return new FirstFragmentViewModel_MembersInjector(repositoryApiProvider);
  }

  @Override
  public void injectMembers(ProductFragmentViewModel instance) {
    injectRepositoryApi(instance, repositoryApiProvider.get());
  }

  public static void injectRepositoryApi(
          ProductFragmentViewModel instance, RepositoryApi repositoryApi) {
    instance.repositoryApi = repositoryApi;
  }
}
