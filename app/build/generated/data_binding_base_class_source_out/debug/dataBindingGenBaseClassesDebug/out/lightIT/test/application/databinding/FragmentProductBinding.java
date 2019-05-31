package lightIT.test.application.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import lightIT.test.application.app.home.ProductFragment;
import lightIT.test.application.viewmodel.ProductFragmentViewModel;

public abstract class FragmentProductBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout headerBackground;

  @NonNull
  public final View headerResizer;

  @NonNull
  public final LayoutProdustProgressBarBinding includeLayoutProgressBar;

  @NonNull
  public final RecyclerView recycleView;

  @NonNull
  public final TextView textProducts;

  @Bindable
  protected ProductFragmentViewModel mViewModel;

  @Bindable
  protected ProductFragment mHandler;

  protected FragmentProductBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ConstraintLayout headerBackground, View headerResizer,
      LayoutProdustProgressBarBinding includeLayoutProgressBar, RecyclerView recycleView,
      TextView textProducts) {
    super(_bindingComponent, _root, _localFieldCount);
    this.headerBackground = headerBackground;
    this.headerResizer = headerResizer;
    this.includeLayoutProgressBar = includeLayoutProgressBar;
    setContainedBinding(this.includeLayoutProgressBar);;
    this.recycleView = recycleView;
    this.textProducts = textProducts;
  }

  public abstract void setViewModel(@Nullable ProductFragmentViewModel viewModel);

  @Nullable
  public ProductFragmentViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setHandler(@Nullable ProductFragment handler);

  @Nullable
  public ProductFragment getHandler() {
    return mHandler;
  }

  @NonNull
  public static FragmentProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentProductBinding>inflate(inflater, lightIT.test.application.R.layout.fragment_product, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentProductBinding>inflate(inflater, lightIT.test.application.R.layout.fragment_product, null, false, component);
  }

  public static FragmentProductBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentProductBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentProductBinding)bind(component, view, lightIT.test.application.R.layout.fragment_product);
  }
}
