package lightIT.test.application.app.home.adapter;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import javax.inject.Inject;

import lightIT.test.application.R;
import lightIT.test.application.app.home.adapter.holder.ProductViewHolder;
import lightIT.test.application.base.BaseRecyclerAdapter;
import lightIT.test.application.data.retrofit.response.Product;
import lightIT.test.application.databinding.ProductRecyclerItemBinding;

public class ProductRecyclerAdapter extends BaseRecyclerAdapter<ProductRecyclerItemBinding, Product, ProductViewHolder> {

    public ProductItemListListener productItemListListener;

    @Inject
    public ProductRecyclerAdapter(ProductItemListListener listener) {
        this.productItemListListener = listener;
    }

    @Override
    protected ProductRecyclerItemBinding getBinding(LayoutInflater inflater, ViewGroup parent) {
        return DataBindingUtil.inflate(inflater, R.layout.product_recycler_item, parent, false);
    }

    @Override
    protected ProductViewHolder getViewHolder(ProductRecyclerItemBinding binding) {
        binding.setAdapter(this);
        return new ProductViewHolder(binding);
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public interface ProductItemListListener {
        void onProductItemClick(Product user);
    }
}