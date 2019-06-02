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
import lightIT.test.application.viewmodel.DescriptionFragmentViewModel;

public abstract class LayoutDescriptionProgressBarBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar progressBarDesc;

  @NonNull
  public final ConstraintLayout progressBarWrapDesc;

  @Bindable
  protected DescriptionFragmentViewModel mViewModel;

  @Bindable
  protected View mView;

  protected LayoutDescriptionProgressBarBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ProgressBar progressBarDesc, ConstraintLayout progressBarWrapDesc) {
    super(_bindingComponent, _root, _localFieldCount);
    this.progressBarDesc = progressBarDesc;
    this.progressBarWrapDesc = progressBarWrapDesc;
  }

  public abstract void setViewModel(@Nullable DescriptionFragmentViewModel viewModel);

  @Nullable
  public DescriptionFragmentViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setView(@Nullable View view);

  @Nullable
  public View getView() {
    return mView;
  }

  @NonNull
  public static LayoutDescriptionProgressBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutDescriptionProgressBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutDescriptionProgressBarBinding>inflate(inflater, lightIT.test.application.R.layout.layout_description_progress_bar, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutDescriptionProgressBarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutDescriptionProgressBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutDescriptionProgressBarBinding>inflate(inflater, lightIT.test.application.R.layout.layout_description_progress_bar, null, false, component);
  }

  public static LayoutDescriptionProgressBarBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutDescriptionProgressBarBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutDescriptionProgressBarBinding)bind(component, view, lightIT.test.application.R.layout.layout_description_progress_bar);
  }
}
