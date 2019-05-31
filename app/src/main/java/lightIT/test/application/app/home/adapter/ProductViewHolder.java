package lightIT.test.application.app.home.adapter;

import lightIT.test.application.base.BaseViewHolder;
import lightIT.test.application.data.retrofit.response.Product;
import lightIT.test.application.databinding.ProductRecyclerItemBinding;

public class ProductViewHolder extends BaseViewHolder<ProductRecyclerItemBinding, Product> {

    public ProductViewHolder(ProductRecyclerItemBinding binding) {
        super(binding);
    }

    @Override
    public void bind(Product item) {
        getBinding().setData(item);
    }
}