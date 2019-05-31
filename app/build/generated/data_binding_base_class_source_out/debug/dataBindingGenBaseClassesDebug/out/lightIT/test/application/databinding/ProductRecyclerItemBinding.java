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
import android.widget.ImageView;
import android.widget.TextView;
import lightIT.test.application.app.home.adapter.ProductRecyclerAdapter;
import lightIT.test.application.data.retrofit.response.Product;

public abstract class ProductRecyclerItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView image;

  @NonNull
  public final View roundedBackground;

  @NonNull
  public final TextView title;

  @Bindable
  protected Product mData;

  @Bindable
  protected ProductRecyclerAdapter mAdapter;

  protected ProductRecyclerItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView image, View roundedBackground, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.image = image;
    this.roundedBackground = roundedBackground;
    this.title = title;
  }

  public abstract void setData(@Nullable Product data);

  @Nullable
  public Product getData() {
    return mData;
  }

  public abstract void setAdapter(@Nullable ProductRecyclerAdapter adapter);

  @Nullable
  public ProductRecyclerAdapter getAdapter() {
    return mAdapter;
  }

  @NonNull
  public static ProductRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ProductRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ProductRecyclerItemBinding>inflate(inflater, lightIT.test.application.R.layout.product_recycler_item, root, attachToRoot, component);
  }

  @NonNull
  public static ProductRecyclerItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ProductRecyclerItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ProductRecyclerItemBinding>inflate(inflater, lightIT.test.application.R.layout.product_recycler_item, null, false, component);
  }

  public static ProductRecyclerItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ProductRecyclerItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ProductRecyclerItemBinding)bind(component, view, lightIT.test.application.R.layout.product_recycler_item);
  }
}
