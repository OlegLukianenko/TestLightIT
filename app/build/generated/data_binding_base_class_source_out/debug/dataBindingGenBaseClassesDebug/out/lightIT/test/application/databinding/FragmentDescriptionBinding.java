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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.wang.avi.AVLoadingIndicatorView;
import lightIT.test.application.app.home.DescriptionFragment;
import lightIT.test.application.viewmodel.DescriptionFragmentViewModel;

public abstract class FragmentDescriptionBinding extends ViewDataBinding {
  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final Button btnReview;

  @NonNull
  public final TextView description;

  @NonNull
  public final EditText etReview;

  @NonNull
  public final ConstraintLayout headerBackground;

  @NonNull
  public final View headerResizer;

  @NonNull
  public final ImageView image;

  @NonNull
  public final ConstraintLayout loginViewsWrap;

  @NonNull
  public final AVLoadingIndicatorView progressBar;

  @NonNull
  public final TextView textPricing;

  @NonNull
  public final TextView title;

  @Bindable
  protected DescriptionFragmentViewModel mViewModel;

  @Bindable
  protected DescriptionFragment mHandler;

  protected FragmentDescriptionBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView backArrow, Button btnReview, TextView description,
      EditText etReview, ConstraintLayout headerBackground, View headerResizer, ImageView image,
      ConstraintLayout loginViewsWrap, AVLoadingIndicatorView progressBar, TextView textPricing,
      TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.backArrow = backArrow;
    this.btnReview = btnReview;
    this.description = description;
    this.etReview = etReview;
    this.headerBackground = headerBackground;
    this.headerResizer = headerResizer;
    this.image = image;
    this.loginViewsWrap = loginViewsWrap;
    this.progressBar = progressBar;
    this.textPricing = textPricing;
    this.title = title;
  }

  public abstract void setViewModel(@Nullable DescriptionFragmentViewModel viewModel);

  @Nullable
  public DescriptionFragmentViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setHandler(@Nullable DescriptionFragment handler);

  @Nullable
  public DescriptionFragment getHandler() {
    return mHandler;
  }

  @NonNull
  public static FragmentDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDescriptionBinding>inflate(inflater, lightIT.test.application.R.layout.fragment_description, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDescriptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDescriptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDescriptionBinding>inflate(inflater, lightIT.test.application.R.layout.fragment_description, null, false, component);
  }

  public static FragmentDescriptionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentDescriptionBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentDescriptionBinding)bind(component, view, lightIT.test.application.R.layout.fragment_description);
  }
}
