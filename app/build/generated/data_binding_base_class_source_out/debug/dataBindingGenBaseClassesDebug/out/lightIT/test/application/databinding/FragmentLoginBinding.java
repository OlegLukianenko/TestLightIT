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
import android.widget.TextView;
import com.wang.avi.AVLoadingIndicatorView;
import lightIT.test.application.viewmodel.LoginFragmentViewModel;

public abstract class FragmentLoginBinding extends ViewDataBinding {
  @NonNull
  public final TextView appName;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final EditText etUsername;

  @NonNull
  public final Guideline guidelineH1;

  @NonNull
  public final ConstraintLayout loginViewsWrap;

  @NonNull
  public final AVLoadingIndicatorView progressBar;

  @NonNull
  public final TextView signUp;

  @NonNull
  public final TextView tvDontHaveAccount;

  @Bindable
  protected LoginFragmentViewModel mViewModel;

  @Bindable
  protected View mView;

  protected FragmentLoginBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView appName, Button btnLogin, EditText etPassword,
      EditText etUsername, Guideline guidelineH1, ConstraintLayout loginViewsWrap,
      AVLoadingIndicatorView progressBar, TextView signUp, TextView tvDontHaveAccount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appName = appName;
    this.btnLogin = btnLogin;
    this.etPassword = etPassword;
    this.etUsername = etUsername;
    this.guidelineH1 = guidelineH1;
    this.loginViewsWrap = loginViewsWrap;
    this.progressBar = progressBar;
    this.signUp = signUp;
    this.tvDontHaveAccount = tvDontHaveAccount;
  }

  public abstract void setViewModel(@Nullable LoginFragmentViewModel viewModel);

  @Nullable
  public LoginFragmentViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setView(@Nullable View view);

  @Nullable
  public View getView() {
    return mView;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentLoginBinding>inflate(inflater, lightIT.test.application.R.layout.fragment_login, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentLoginBinding>inflate(inflater, lightIT.test.application.R.layout.fragment_login, null, false, component);
  }

  public static FragmentLoginBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentLoginBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentLoginBinding)bind(component, view, lightIT.test.application.R.layout.fragment_login);
  }
}
