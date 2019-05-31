package lightIT.test.application.di.home.product;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import lightIT.test.application.app.home.ProductFragment;
import lightIT.test.application.app.home.adapter.ProductRecyclerAdapter;
import lightIT.test.application.viewmodel.ProductFragmentViewModel;

@Module
public class ProductFragmentModule {

    @Provides
    ProductFragmentViewModel provideViewModel(ProductFragment fragment, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(fragment, factory).get(ProductFragmentViewModel.class);
    }


    @Provides
    ProductRecyclerAdapter provideProductAdapter(ProductRecyclerAdapter.ProductItemListListener listener) {
        return new ProductRecyclerAdapter(listener);
    }

    @Provides
    ProductRecyclerAdapter.ProductItemListListener provideProductListListener(ProductFragment fragment) {
        return fragment;
    }

}
