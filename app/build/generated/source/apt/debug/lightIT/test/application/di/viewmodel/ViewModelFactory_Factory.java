// Generated by Dagger (https://google.github.io/dagger).
package lightIT.test.application.di.viewmodel;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class ViewModelFactory_Factory implements Factory<ViewModelFactory> {
  private final Provider<ViewModelComponent> componentProvider;

  public ViewModelFactory_Factory(Provider<ViewModelComponent> componentProvider) {
    this.componentProvider = componentProvider;
  }

  @Override
  public ViewModelFactory get() {
    return provideInstance(componentProvider);
  }

  public static ViewModelFactory provideInstance(Provider<ViewModelComponent> componentProvider) {
    return new ViewModelFactory(componentProvider.get());
  }

  public static ViewModelFactory_Factory create(Provider<ViewModelComponent> componentProvider) {
    return new ViewModelFactory_Factory(componentProvider);
  }

  public static ViewModelFactory newViewModelFactory(ViewModelComponent component) {
    return new ViewModelFactory(component);
  }
}
