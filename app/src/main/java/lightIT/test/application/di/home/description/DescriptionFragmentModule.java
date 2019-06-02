package lightIT.test.application.di.home.description;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import lightIT.test.application.app.home.DescriptionFragment;
import lightIT.test.application.app.home.adapter.ReviewRecyclerAdapter;
import lightIT.test.application.viewmodel.DescriptionFragmentViewModel;

@Module
public class DescriptionFragmentModule {

    @Provides
    DescriptionFragmentViewModel provideViewModel(DescriptionFragment fragment, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(fragment, factory).get(DescriptionFragmentViewModel.class);
    }

    @Provides
    ReviewRecyclerAdapter provideReviewAdapter() {
        return new ReviewRecyclerAdapter();
    }
}