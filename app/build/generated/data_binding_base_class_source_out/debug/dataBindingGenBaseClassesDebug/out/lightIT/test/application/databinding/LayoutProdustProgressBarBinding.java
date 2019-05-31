package lightIT.test.application.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import lightIT.test.application.viewmodel.ProductFragmentViewModel;

public abstract class LayoutProdustProgressBarBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ConstraintLayout progressBarWrap;

  @Bindable
  protected ProductFragmentViewModel mViewModel;

  @Bindable
  protected View mView;

  protected LayoutProdustProgressBarBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ProgressBar progressBar, ConstraintLayout progressBarWrap) {
    super(_bindingComponent, _root, _localFieldCount);
    this.progressBar = progressBar;
    this.progressBarWrap = progressBarWrap;
  }

  public abstract void setViewModel(@Nullable ProductFragmentViewModel viewModel);

  @Nullable
  public ProductFragmentViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setView(@Nullable View view);

  @Nullable
  public View getView() {
    return mView;
  }

  @NonNull
  public static LayoutProdustProgressBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutProdustProgressBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutProdustProgressBarBinding>inflate(inflater, lightIT.test.application.R.layout.layout_produst_progress_bar, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutProdustProgressBarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutProdustProgressBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutProdustProgressBarBinding>inflate(inflater, lightIT.test.application.R.layout.layout_produst_progress_bar, null, false, component);
  }

  public static LayoutProdustProgressBarBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutProdustProgressBarBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutProdustProgressBarBinding)bind(component, view, lightIT.test.application.R.layout.layout_produst_progress_bar);
  }
}
