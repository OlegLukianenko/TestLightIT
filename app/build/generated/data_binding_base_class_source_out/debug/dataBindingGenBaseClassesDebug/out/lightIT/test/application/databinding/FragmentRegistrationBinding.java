package lightIT.test.application.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.wang.avi.AVLoadingIndicatorView;
import lightIT.test.application.app.home.RegistrationFragment;
import lightIT.test.application.viewmodel.RegistrationFragmentViewModel;

public abstract class FragmentRegistrationBinding extends ViewDataBinding {
  @NonNull
  public final TextView appName;

  @NonNull
  public final ImageView backArrow;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final EditText etUsername;

  @NonNull
  public final Guideline guidelineH1;

  @NonNull
  public final ConstraintLayout headerBackground;

  @NonNull
  public final View headerResizer;

  @NonNull
  public final AVLoadingIndicatorView progressBar;

  @NonNull
  public final ConstraintLayout registrationViewsWrap;

  @NonNull
  public final TextView textPricing;

  @Bindable
  protected RegistrationFragmentViewModel mViewModel;

  @Bindable
  protected View mView;

  @Bindable
  protected RegistrationFragment mHandler;

  protected FragmentRegistrationBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView appName, ImageView backArrow, Button btnLogin,
      EditText etPassword, EditText etUsername, Guideline guidelineH1,
      ConstraintLayout headerBackground, View headerResizer, AVLoadingIndicatorView progressBar,
      ConstraintLayout registrationViewsWrap, TextView textPricing) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appName = appName;
    this.backArrow = backArrow;
    this.btnLogin = btnLogin;
    this.etPassword = etPassword;
    this.etUsername = etUsername;
    this.guidelineH1 = guidelineH1;
    this.headerBackground = headerBackground;
    this.headerResizer = headerResizer;
    this.progressBar = progressBar;
    this.registrationViewsWrap = registrationViewsWrap;
    this.textPricing = textPricing;
  }

  public abstract void setViewModel(@Nullable RegistrationFragmentViewModel viewModel);

  @Nullable
  public RegistrationFragmentViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setView(@Nullable View view);

  @Nullable
  public View getView() {
    return mView;
  }

  public abstract void setHandler(@Nullable RegistrationFragment handler);

  @Nullable
  public RegistrationFragment getHandler() {
    return mHandler;
  }

  @NonNull
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentRegistrationBinding>inflate(inflater, lightIT.test.application.R.layout.fragment_registration, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentRegistrationBinding>inflate(inflater, lightIT.test.application.R.layout.fragment_registration, null, false, component);
  }

  public static FragmentRegistrationBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentRegistrationBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentRegistrationBinding)bind(component, view, lightIT.test.application.R.layout.fragment_registration);
  }
}
