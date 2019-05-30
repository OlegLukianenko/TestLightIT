// Generated by Dagger (https://google.github.io/dagger).
package lightIT.test.application.di.app;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import lightIT.test.application.data.retrofit.ServerApi;
import retrofit2.Retrofit;

public final class DataModule_GetServerApiFactory implements Factory<ServerApi> {
  private final DataModule module;

  private final Provider<Retrofit> retrofitProvider;

  public DataModule_GetServerApiFactory(DataModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ServerApi get() {
    return provideInstance(module, retrofitProvider);
  }

  public static ServerApi provideInstance(DataModule module, Provider<Retrofit> retrofitProvider) {
    return proxyGetServerApi(module, retrofitProvider.get());
  }

  public static DataModule_GetServerApiFactory create(
      DataModule module, Provider<Retrofit> retrofitProvider) {
    return new DataModule_GetServerApiFactory(module, retrofitProvider);
  }

  public static ServerApi proxyGetServerApi(DataModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(
        instance.getServerApi(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
