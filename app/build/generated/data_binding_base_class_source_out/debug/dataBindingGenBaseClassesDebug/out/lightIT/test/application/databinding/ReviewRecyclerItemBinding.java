package lightIT.test.application.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import lightIT.test.application.data.retrofit.response.Review;

public abstract class ReviewRecyclerItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView comment;

  @NonNull
  public final TextView rate;

  @NonNull
  public final View roundedBackground;

  @NonNull
  public final TextView titleComment;

  @NonNull
  public final TextView titleRate;

  @NonNull
  public final TextView username;

  @Bindable
  protected Review mData;

  protected ReviewRecyclerItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView comment, TextView rate, View roundedBackground,
      TextView titleComment, TextView titleRate, TextView username) {
    super(_bindingComponent, _root, _localFieldCount);
    this.comment = comment;
    this.rate = rate;
    this.roundedBackground = roundedBackground;
    this.titleComment = titleComment;
    this.titleRate = titleRate;
    this.username = username;
  }

  public abstract void setData(@Nullable Review data);

  @Nullable
  public Review getData() {
    return mData;
  }

  @NonNull
  public static ReviewRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ReviewRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ReviewRecyclerItemBinding>inflate(inflater, lightIT.test.application.R.layout.review_recycler_item, root, attachToRoot, component);
  }

  @NonNull
  public static ReviewRecyclerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ReviewRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ReviewRecyclerItemBinding>inflate(inflater, lightIT.test.application.R.layout.review_recycler_item, null, false, component);
  }

  public static ReviewRecyclerItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ReviewRecyclerItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ReviewRecyclerItemBinding)bind(component, view, lightIT.test.application.R.layout.review_recycler_item);
  }
}
