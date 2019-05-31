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
import lightIT.test.application.viewmodel.LoginFragmentViewModel;

public abstract class FragmentLoginBinding extends ViewDataBinding {
  @NonNull
  public final Button btnLogin;

  @NonNull
  public final ConstraintLayout cardinal;

  @NonNull
  public final EditText etPassword;

  @NonNull
  public final EditText etUsername;

  @NonNull
  public final TextView forgotPassword;

  @NonNull
  public final Guideline guidelineH1;

  @NonNull
  public final ConstraintLayout loginViewsWrap;

  @NonNull
  public final View vInscription;

  @Bindable
  protected LoginFragmentViewModel mViewModel;

  @Bindable
  protected View mView;

  protected FragmentLoginBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button btnLogin, ConstraintLayout cardinal, EditText etPassword,
      EditText etUsername, TextView forgotPassword, Guideline guidelineH1,
      ConstraintLayout loginViewsWrap, View vInscription) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnLogin = btnLogin;
    this.cardinal = cardinal;
    this.etPassword = etPassword;
    this.etUsername = etUsername;
    this.forgotPassword = forgotPassword;
    this.guidelineH1 = guidelineH1;
    this.loginViewsWrap = loginViewsWrap;
    this.vInscription = vInscription;
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
