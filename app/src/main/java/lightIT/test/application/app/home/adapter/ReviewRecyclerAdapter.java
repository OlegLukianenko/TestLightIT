package lightIT.test.application.app.home.adapter;


import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import javax.inject.Inject;

import lightIT.test.application.R;
import lightIT.test.application.app.home.adapter.holder.ReviewViewHolder;
import lightIT.test.application.base.BaseRecyclerAdapter;
import lightIT.test.application.data.retrofit.response.Review;
import lightIT.test.application.databinding.ReviewRecyclerItemBinding;

public class ReviewRecyclerAdapter extends BaseRecyclerAdapter<ReviewRecyclerItemBinding, Review, ReviewViewHolder> {

    @Inject
    public ReviewRecyclerAdapter() {
    }

    @Override
    protected ReviewRecyclerItemBinding getBinding(LayoutInflater inflater, ViewGroup parent) {
        return DataBindingUtil.inflate(inflater, R.layout.review_recycler_item, parent, false);
    }

    @Override
    protected ReviewViewHolder getViewHolder(ReviewRecyclerItemBinding binding) {
        return new ReviewViewHolder(binding);
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }


}