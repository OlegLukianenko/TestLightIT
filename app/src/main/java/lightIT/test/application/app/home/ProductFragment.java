package lightIT.test.application.app.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import lightIT.test.application.R;
import lightIT.test.application.app.home.adapter.ProductRecyclerAdapter;
import lightIT.test.application.base.BaseFragment;
import lightIT.test.application.data.retrofit.response.Product;
import lightIT.test.application.databinding.FragmentProductBinding;
import lightIT.test.application.di.viewmodel.Injectable;
import lightIT.test.application.utils.NetworkHelper;
import lightIT.test.application.viewmodel.ProductFragmentViewModel;

import static lightIT.test.application.data.repository.RepositoryImpl.TIMEOUT_CODE;


public class ProductFragment extends BaseFragment<FragmentProductBinding> implements
        Injectable, ProductRecyclerAdapter.ProductItemListListener {

    @Inject
    ProductFragmentViewModel viewModel;

    @Inject
    protected NetworkHelper networkHelper;

    @Inject
    ProductRecyclerAdapter productRecyclerAdapter;

    @Override
    protected int getLayout() {
        return R.layout.fragment_product;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.setViewModel(viewModel);
        binding.setHandler(this);

        viewModel.sendProductRequest();
        viewModel.getProgressBarEvent().postValue(true);

        initUserAdapter();
        initSubscribers();
    }

    private void initUserAdapter() {
        binding.recycleView.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.recycleView.setAdapter(productRecyclerAdapter);
    }

    private void initSubscribers() {
        viewModel.getProductListResponseMutable().observe(this, productListResponseWrap ->
        {
            if (productListResponseWrap.status) {

                productRecyclerAdapter.setItems(productListResponseWrap.data);
                viewModel.getProgressBarEvent().postValue(false);
            } else {
                if (productListResponseWrap.statusCode == TIMEOUT_CODE) {
                    if (networkHelper.isNetworkAvailable()) {
                        showToast(getString(R.string.poor_internet_connection), Toast.LENGTH_LONG);
                    }
                } else {
                    showToast(productListResponseWrap.message, Toast.LENGTH_LONG);
                }
            }
        });
    }

    @Override
    public void onProductItemClick(Product product) {

    }
}
