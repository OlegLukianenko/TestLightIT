package lightIT.test.application.di.app;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import lightIT.test.application.data.repository.RepositoryImpl;
import lightIT.test.application.data.repository.RepositoryApi;

@Module
public abstract class RepositoryModule {

    @Binds
    @Singleton
    public abstract RepositoryApi provideServerApi(RepositoryImpl repositoryImpl);
}
