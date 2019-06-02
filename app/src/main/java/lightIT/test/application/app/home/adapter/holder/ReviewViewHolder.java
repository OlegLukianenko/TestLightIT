package lightIT.test.application.app.home.adapter.holder;

import lightIT.test.application.base.BaseViewHolder;
import lightIT.test.application.data.retrofit.response.Review;
import lightIT.test.application.databinding.ReviewRecyclerItemBinding;


public class ReviewViewHolder extends BaseViewHolder<ReviewRecyclerItemBinding, Review> {

    public ReviewViewHolder(ReviewRecyclerItemBinding binding) {
        super(binding);
    }

    @Override
    public void bind(Review item) {
        getBinding().setData(item);
    }
}