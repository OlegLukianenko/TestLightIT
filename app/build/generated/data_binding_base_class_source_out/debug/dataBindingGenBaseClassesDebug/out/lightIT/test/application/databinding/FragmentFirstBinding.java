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
import lightIT.test.application.viewmodel.FirstFragmentViewModel;

public abstract class FragmentFirstBinding extends ViewDataBinding {
  @Bindable
  protected FirstFragmentViewModel mViewModel;

  protected FragmentFirstBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setViewModel(@Nullable FirstFragmentViewModel viewModel);

  @Nullable
  public FirstFragmentViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentFirstBinding>inflate(inflater, lightIT.test.application.R.layout.fragment_first, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentFirstBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentFirstBinding>inflate(inflater, lightIT.test.application.R.layout.fragment_first, null, false, component);
  }

  public static FragmentFirstBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentFirstBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentFirstBinding)bind(component, view, lightIT.test.application.R.layout.fragment_first);
  }
}
