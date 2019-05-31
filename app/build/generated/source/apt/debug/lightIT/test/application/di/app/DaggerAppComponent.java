// Generated by Dagger (https://google.github.io/dagger).
package lightIT.test.application.di.app;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProvider;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import lightIT.test.application.app.App;
import lightIT.test.application.app.App_MembersInjector;
import lightIT.test.application.app.home.DescriptionFragment;
import lightIT.test.application.app.home.DescriptionFragment_MembersInjector;
import lightIT.test.application.app.home.LoginFragment;
import lightIT.test.application.app.home.LoginFragment_MembersInjector;
import lightIT.test.application.app.home.MainActivity;
import lightIT.test.application.app.home.MainActivity_MembersInjector;
import lightIT.test.application.app.home.ProductFragment;
import lightIT.test.application.app.home.ProductFragment_MembersInjector;
import lightIT.test.application.app.home.adapter.ProductRecyclerAdapter;
import lightIT.test.application.app.splash.SplashActivity;
import lightIT.test.application.app.splash.SplashActivity_MembersInjector;
import lightIT.test.application.data.repository.RepositoryApi;
import lightIT.test.application.data.repository.RepositoryImpl_Factory;
import lightIT.test.application.data.retrofit.APIError;
import lightIT.test.application.data.retrofit.ServerApi;
import lightIT.test.application.di.home.description.DescriptionFragmentComponent;
import lightIT.test.application.di.home.description.DescriptionFragmentModule;
import lightIT.test.application.di.home.description.DescriptionFragmentModule_ProvideViewModelFactory;
import lightIT.test.application.di.home.login.LoginFragmentComponent;
import lightIT.test.application.di.home.login.LoginFragmentModule;
import lightIT.test.application.di.home.login.LoginFragmentModule_ProvideViewModelFactory;
import lightIT.test.application.di.home.mainActivity.MainActivityComponent;
import lightIT.test.application.di.home.product.ProductFragmentComponent;
import lightIT.test.application.di.home.product.ProductFragmentModule;
import lightIT.test.application.di.home.product.ProductFragmentModule_ProvideProductAdapterFactory;
import lightIT.test.application.di.home.product.ProductFragmentModule_ProvideProductListListenerFactory;
import lightIT.test.application.di.home.product.ProductFragmentModule_ProvideViewModelFactory;
import lightIT.test.application.di.splash.SplashActivityComponent;
import lightIT.test.application.di.splash.SplashModule;
import lightIT.test.application.di.splash.SplashModule_ProvideSplashViewModelFactory;
import lightIT.test.application.di.viewmodel.ViewModelComponent;
import lightIT.test.application.utils.NetworkHelper;
import lightIT.test.application.viewmodel.DescriptionFragmentViewModel;
import lightIT.test.application.viewmodel.DescriptionFragmentViewModel_Factory;
import lightIT.test.application.viewmodel.DescriptionFragmentViewModel_MembersInjector;
import lightIT.test.application.viewmodel.LoginFragmentViewModel;
import lightIT.test.application.viewmodel.LoginFragmentViewModel_Factory;
import lightIT.test.application.viewmodel.LoginFragmentViewModel_MembersInjector;
import lightIT.test.application.viewmodel.ProductFragmentViewModel;
import lightIT.test.application.viewmodel.ProductFragmentViewModel_Factory;
import lightIT.test.application.viewmodel.ProductFragmentViewModel_MembersInjector;
import lightIT.test.application.viewmodel.SplashActivityViewModel;
import lightIT.test.application.viewmodel.SplashActivityViewModel_Factory;
import lightIT.test.application.viewmodel.SplashActivityViewModel_MembersInjector;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

public final class DaggerAppComponent implements AppComponent {
  private Provider<SplashActivityComponent.Builder> splashActivityComponentBuilderProvider;

  private Provider<MainActivityComponent.Builder> mainActivityComponentBuilderProvider;

  private Provider<ViewModelComponent.Builder> viewModelComponentBuilderProvider;

  private Provider<ViewModelProvider.Factory> provideViewModelFactoryProvider;

  private Provider<App> applicationProvider;

  private Provider<NetworkHelper> provideNetworkHelperProvider;

  private Provider<SharedPreferences> provideSharedPreferencesProvider;

  private Provider<OkHttpClient> getOkHttpClientProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private Provider<ServerApi> getServerApiProvider;

  private Provider<Converter<ResponseBody, APIError>> provideRetrofitConverterProvider;

  private RepositoryImpl_Factory repositoryImplProvider;

  private Provider<RepositoryApi> provideServerApiProvider;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
      getMapOfClassOfAndProviderOfFactoryOf() {
    return MapBuilder
        .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
            newMapBuilder(2)
        .put(SplashActivity.class, (Provider) splashActivityComponentBuilderProvider)
        .put(MainActivity.class, (Provider) mainActivityComponentBuilderProvider)
        .build();
  }

  private DispatchingAndroidInjector<Activity> getDispatchingAndroidInjectorOfActivity() {
    return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
        getMapOfClassOfAndProviderOfFactoryOf());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.splashActivityComponentBuilderProvider =
        new Provider<SplashActivityComponent.Builder>() {
          @Override
          public SplashActivityComponent.Builder get() {
            return new SplashActivityComponentBuilder();
          }
        };
    this.mainActivityComponentBuilderProvider =
        new Provider<MainActivityComponent.Builder>() {
          @Override
          public MainActivityComponent.Builder get() {
            return new MainActivityComponentBuilder();
          }
        };
    this.viewModelComponentBuilderProvider =
        new Provider<ViewModelComponent.Builder>() {
          @Override
          public ViewModelComponent.Builder get() {
            return new ViewModelComponentBuilder();
          }
        };
    this.provideViewModelFactoryProvider =
        DoubleCheck.provider(
            AppModule_ProvideViewModelFactoryFactory.create(
                builder.appModule, viewModelComponentBuilderProvider));
    this.applicationProvider = InstanceFactory.create(builder.application);
    this.provideNetworkHelperProvider =
        DoubleCheck.provider(
            AppModule_ProvideNetworkHelperFactory.create(builder.appModule, applicationProvider));
    this.provideSharedPreferencesProvider =
        DoubleCheck.provider(
            AppModule_ProvideSharedPreferencesFactory.create(
                builder.appModule, applicationProvider));
    this.getOkHttpClientProvider =
        DoubleCheck.provider(DataModule_GetOkHttpClientFactory.create(builder.dataModule));
    this.provideRetrofitProvider =
        DoubleCheck.provider(
            DataModule_ProvideRetrofitFactory.create(builder.dataModule, getOkHttpClientProvider));
    this.getServerApiProvider =
        DoubleCheck.provider(
            DataModule_GetServerApiFactory.create(builder.dataModule, provideRetrofitProvider));
    this.provideRetrofitConverterProvider =
        DoubleCheck.provider(
            DataModule_ProvideRetrofitConverterFactory.create(
                builder.dataModule, provideRetrofitProvider));
    this.repositoryImplProvider =
        RepositoryImpl_Factory.create(getServerApiProvider, provideRetrofitConverterProvider);
    this.provideServerApiProvider = DoubleCheck.provider((Provider) repositoryImplProvider);
  }

  @Override
  public void inject(App app) {
    injectApp(app);
  }

  private App injectApp(App instance) {
    App_MembersInjector.injectActivityInjector(instance, getDispatchingAndroidInjectorOfActivity());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private AppModule appModule;

    private DataModule dataModule;

    private App application;

    @Override
    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      if (dataModule == null) {
        this.dataModule = new DataModule();
      }
      if (application == null) {
        throw new IllegalStateException(App.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(App app) {
      this.application = Preconditions.checkNotNull(app);
      return this;
    }
  }

  private final class SplashActivityComponentBuilder extends SplashActivityComponent.Builder {
    private SplashModule splashModule;

    private SplashActivity seedInstance;

    @Override
    public SplashActivityComponent build() {
      if (splashModule == null) {
        this.splashModule = new SplashModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(SplashActivity.class.getCanonicalName() + " must be set");
      }
      return new SplashActivityComponentImpl(this);
    }

    @Override
    public void seedInstance(SplashActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SplashActivityComponentImpl implements SplashActivityComponent {
    private SplashModule splashModule;

    private SplashActivity seedInstance;

    private SplashActivityComponentImpl(SplashActivityComponentBuilder builder) {
      initialize(builder);
    }

    private SplashActivityViewModel getSplashActivityViewModel() {
      return SplashModule_ProvideSplashViewModelFactory.proxyProvideSplashViewModel(
          splashModule,
          seedInstance,
          DaggerAppComponent.this.provideViewModelFactoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SplashActivityComponentBuilder builder) {
      this.splashModule = builder.splashModule;
      this.seedInstance = builder.seedInstance;
    }

    @Override
    public void inject(SplashActivity arg0) {
      injectSplashActivity(arg0);
    }

    private SplashActivity injectSplashActivity(SplashActivity instance) {
      SplashActivity_MembersInjector.injectViewModel(instance, getSplashActivityViewModel());
      SplashActivity_MembersInjector.injectNetworkHelper(
          instance, DaggerAppComponent.this.provideNetworkHelperProvider.get());
      SplashActivity_MembersInjector.injectSharedPreferences(
          instance, DaggerAppComponent.this.provideSharedPreferencesProvider.get());
      return instance;
    }
  }

  private final class MainActivityComponentBuilder extends MainActivityComponent.Builder {
    private MainActivity seedInstance;

    @Override
    public MainActivityComponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MainActivity.class.getCanonicalName() + " must be set");
      }
      return new MainActivityComponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivityComponentImpl implements MainActivityComponent {
    private Provider<ProductFragmentComponent.Builder> productFragmentComponentBuilderProvider;

    private Provider<DescriptionFragmentComponent.Builder>
        descriptionFragmentComponentBuilderProvider;

    private Provider<LoginFragmentComponent.Builder> loginFragmentComponentBuilderProvider;

    private MainActivityComponentImpl(MainActivityComponentBuilder builder) {
      initialize(builder);
    }

    private Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
        getMapOfClassOfAndProviderOfFactoryOf() {
      return MapBuilder
          .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
              newMapBuilder(3)
          .put(ProductFragment.class, (Provider) productFragmentComponentBuilderProvider)
          .put(DescriptionFragment.class, (Provider) descriptionFragmentComponentBuilderProvider)
          .put(LoginFragment.class, (Provider) loginFragmentComponentBuilderProvider)
          .build();
    }

    private DispatchingAndroidInjector<Fragment> getDispatchingAndroidInjectorOfFragment() {
      return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
          getMapOfClassOfAndProviderOfFactoryOf());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivityComponentBuilder builder) {
      this.productFragmentComponentBuilderProvider =
          new Provider<ProductFragmentComponent.Builder>() {
            @Override
            public ProductFragmentComponent.Builder get() {
              return new ProductFragmentComponentBuilder();
            }
          };
      this.descriptionFragmentComponentBuilderProvider =
          new Provider<DescriptionFragmentComponent.Builder>() {
            @Override
            public DescriptionFragmentComponent.Builder get() {
              return new DescriptionFragmentComponentBuilder();
            }
          };
      this.loginFragmentComponentBuilderProvider =
          new Provider<LoginFragmentComponent.Builder>() {
            @Override
            public LoginFragmentComponent.Builder get() {
              return new LoginFragmentComponentBuilder();
            }
          };
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectFragmentDispatchingAndroidInjector(
          instance, getDispatchingAndroidInjectorOfFragment());
      return instance;
    }

    private final class ProductFragmentComponentBuilder extends ProductFragmentComponent.Builder {
      private ProductFragmentModule productFragmentModule;

      private ProductFragment seedInstance;

      @Override
      public ProductFragmentComponent build() {
        if (productFragmentModule == null) {
          this.productFragmentModule = new ProductFragmentModule();
        }
        if (seedInstance == null) {
          throw new IllegalStateException(
              ProductFragment.class.getCanonicalName() + " must be set");
        }
        return new ProductFragmentComponentImpl(this);
      }

      @Override
      public void seedInstance(ProductFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ProductFragmentComponentImpl implements ProductFragmentComponent {
      private ProductFragmentModule productFragmentModule;

      private ProductFragment seedInstance;

      private ProductFragmentComponentImpl(ProductFragmentComponentBuilder builder) {
        initialize(builder);
      }

      private ProductFragmentViewModel getProductFragmentViewModel() {
        return ProductFragmentModule_ProvideViewModelFactory.proxyProvideViewModel(
            productFragmentModule,
            seedInstance,
            DaggerAppComponent.this.provideViewModelFactoryProvider.get());
      }

      private ProductRecyclerAdapter.ProductItemListListener getProductItemListListener() {
        return ProductFragmentModule_ProvideProductListListenerFactory
            .proxyProvideProductListListener(productFragmentModule, seedInstance);
      }

      private ProductRecyclerAdapter getProductRecyclerAdapter() {
        return ProductFragmentModule_ProvideProductAdapterFactory.proxyProvideProductAdapter(
            productFragmentModule, getProductItemListListener());
      }

      @SuppressWarnings("unchecked")
      private void initialize(final ProductFragmentComponentBuilder builder) {
        this.productFragmentModule = builder.productFragmentModule;
        this.seedInstance = builder.seedInstance;
      }

      @Override
      public void inject(ProductFragment arg0) {
        injectProductFragment(arg0);
      }

      private ProductFragment injectProductFragment(ProductFragment instance) {
        ProductFragment_MembersInjector.injectViewModel(instance, getProductFragmentViewModel());
        ProductFragment_MembersInjector.injectNetworkHelper(
            instance, DaggerAppComponent.this.provideNetworkHelperProvider.get());
        ProductFragment_MembersInjector.injectProductRecyclerAdapter(
            instance, getProductRecyclerAdapter());
        return instance;
      }
    }

    private final class DescriptionFragmentComponentBuilder
        extends DescriptionFragmentComponent.Builder {
      private DescriptionFragmentModule descriptionFragmentModule;

      private DescriptionFragment seedInstance;

      @Override
      public DescriptionFragmentComponent build() {
        if (descriptionFragmentModule == null) {
          this.descriptionFragmentModule = new DescriptionFragmentModule();
        }
        if (seedInstance == null) {
          throw new IllegalStateException(
              DescriptionFragment.class.getCanonicalName() + " must be set");
        }
        return new DescriptionFragmentComponentImpl(this);
      }

      @Override
      public void seedInstance(DescriptionFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class DescriptionFragmentComponentImpl implements DescriptionFragmentComponent {
      private DescriptionFragmentModule descriptionFragmentModule;

      private DescriptionFragment seedInstance;

      private DescriptionFragmentComponentImpl(DescriptionFragmentComponentBuilder builder) {
        initialize(builder);
      }

      private DescriptionFragmentViewModel getDescriptionFragmentViewModel() {
        return DescriptionFragmentModule_ProvideViewModelFactory.proxyProvideViewModel(
            descriptionFragmentModule,
            seedInstance,
            DaggerAppComponent.this.provideViewModelFactoryProvider.get());
      }

      @SuppressWarnings("unchecked")
      private void initialize(final DescriptionFragmentComponentBuilder builder) {
        this.descriptionFragmentModule = builder.descriptionFragmentModule;
        this.seedInstance = builder.seedInstance;
      }

      @Override
      public void inject(DescriptionFragment arg0) {
        injectDescriptionFragment(arg0);
      }

      private DescriptionFragment injectDescriptionFragment(DescriptionFragment instance) {
        DescriptionFragment_MembersInjector.injectViewModel(
            instance, getDescriptionFragmentViewModel());
        DescriptionFragment_MembersInjector.injectNetworkHelper(
            instance, DaggerAppComponent.this.provideNetworkHelperProvider.get());
        return instance;
      }
    }

    private final class LoginFragmentComponentBuilder extends LoginFragmentComponent.Builder {
      private LoginFragmentModule loginFragmentModule;

      private LoginFragment seedInstance;

      @Override
      public LoginFragmentComponent build() {
        if (loginFragmentModule == null) {
          this.loginFragmentModule = new LoginFragmentModule();
        }
        if (seedInstance == null) {
          throw new IllegalStateException(LoginFragment.class.getCanonicalName() + " must be set");
        }
        return new LoginFragmentComponentImpl(this);
      }

      @Override
      public void seedInstance(LoginFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class LoginFragmentComponentImpl implements LoginFragmentComponent {
      private LoginFragmentModule loginFragmentModule;

      private LoginFragment seedInstance;

      private LoginFragmentComponentImpl(LoginFragmentComponentBuilder builder) {
        initialize(builder);
      }

      private LoginFragmentViewModel getLoginFragmentViewModel() {
        return LoginFragmentModule_ProvideViewModelFactory.proxyProvideViewModel(
            loginFragmentModule,
            seedInstance,
            DaggerAppComponent.this.provideViewModelFactoryProvider.get());
      }

      @SuppressWarnings("unchecked")
      private void initialize(final LoginFragmentComponentBuilder builder) {
        this.loginFragmentModule = builder.loginFragmentModule;
        this.seedInstance = builder.seedInstance;
      }

      @Override
      public void inject(LoginFragment arg0) {
        injectLoginFragment(arg0);
      }

      private LoginFragment injectLoginFragment(LoginFragment instance) {
        LoginFragment_MembersInjector.injectViewModel(instance, getLoginFragmentViewModel());
        LoginFragment_MembersInjector.injectNetworkHelper(
            instance, DaggerAppComponent.this.provideNetworkHelperProvider.get());
        LoginFragment_MembersInjector.injectSharedPreferences(
            instance, DaggerAppComponent.this.provideSharedPreferencesProvider.get());
        return instance;
      }
    }
  }

  private final class ViewModelComponentBuilder implements ViewModelComponent.Builder {
    @Override
    public ViewModelComponent build() {
      return new ViewModelComponentImpl(this);
    }
  }

  private final class ViewModelComponentImpl implements ViewModelComponent {
    private ViewModelComponentImpl(ViewModelComponentBuilder builder) {}

    @Override
    public SplashActivityViewModel splashActivityViewModel() {
      return injectSplashActivityViewModel(
          SplashActivityViewModel_Factory.newSplashActivityViewModel());
    }

    @Override
    public ProductFragmentViewModel productFragmentViewModel() {
      return injectProductFragmentViewModel(
          ProductFragmentViewModel_Factory.newProductFragmentViewModel());
    }

    @Override
    public LoginFragmentViewModel loginFragmentViewModel() {
      return injectLoginFragmentViewModel(
          LoginFragmentViewModel_Factory.newLoginFragmentViewModel());
    }

    @Override
    public DescriptionFragmentViewModel descriptionFragmentViewModel() {
      return injectDescriptionFragmentViewModel(
          DescriptionFragmentViewModel_Factory.newDescriptionFragmentViewModel());
    }

    private SplashActivityViewModel injectSplashActivityViewModel(
        SplashActivityViewModel instance) {
      SplashActivityViewModel_MembersInjector.injectRepositoryApi(
          instance, DaggerAppComponent.this.provideServerApiProvider.get());
      return instance;
    }

    private ProductFragmentViewModel injectProductFragmentViewModel(
        ProductFragmentViewModel instance) {
      ProductFragmentViewModel_MembersInjector.injectRepositoryApi(
          instance, DaggerAppComponent.this.provideServerApiProvider.get());
      return instance;
    }

    private LoginFragmentViewModel injectLoginFragmentViewModel(LoginFragmentViewModel instance) {
      LoginFragmentViewModel_MembersInjector.injectRepositoryApi(
          instance, DaggerAppComponent.this.provideServerApiProvider.get());
      return instance;
    }

    private DescriptionFragmentViewModel injectDescriptionFragmentViewModel(
        DescriptionFragmentViewModel instance) {
      DescriptionFragmentViewModel_MembersInjector.injectRepositoryApi(
          instance, DaggerAppComponent.this.provideServerApiProvider.get());
      return instance;
    }
  }
}
