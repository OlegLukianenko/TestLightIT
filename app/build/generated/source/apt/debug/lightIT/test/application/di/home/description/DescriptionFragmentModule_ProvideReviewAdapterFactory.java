// Generated by Dagger (https://google.github.io/dagger).
package lightIT.test.application.di.home.description;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import lightIT.test.application.app.home.adapter.ReviewRecyclerAdapter;

public final class DescriptionFragmentModule_ProvideReviewAdapterFactory
    implements Factory<ReviewRecyclerAdapter> {
  private final DescriptionFragmentModule module;

  public DescriptionFragmentModule_ProvideReviewAdapterFactory(DescriptionFragmentModule module) {
    this.module = module;
  }

  @Override
  public ReviewRecyclerAdapter get() {
    return provideInstance(module);
  }

  public static ReviewRecyclerAdapter provideInstance(DescriptionFragmentModule module) {
    return proxyProvideReviewAdapter(module);
  }

  public static DescriptionFragmentModule_ProvideReviewAdapterFactory create(
      DescriptionFragmentModule module) {
    return new DescriptionFragmentModule_ProvideReviewAdapterFactory(module);
  }

  public static ReviewRecyclerAdapter proxyProvideReviewAdapter(
      DescriptionFragmentModule instance) {
    return Preconditions.checkNotNull(
        instance.provideReviewAdapter(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
