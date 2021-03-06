package lightIT.test.application.databinding;
import lightIT.test.application.R;
import lightIT.test.application.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements lightIT.test.application.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerBackground, 5);
        sViewsWithIds.put(R.id.headerResizer, 6);
        sViewsWithIds.put(R.id.textPricing, 7);
        sViewsWithIds.put(R.id.appName, 8);
        sViewsWithIds.put(R.id.loginViewsWrap, 9);
        sViewsWithIds.put(R.id.etUsername, 10);
        sViewsWithIds.put(R.id.etPassword, 11);
        sViewsWithIds.put(R.id.guideline_h_1, 12);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLoginBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.Button) bindings[2]
            , (android.widget.EditText) bindings[11]
            , (android.widget.EditText) bindings[10]
            , (android.support.constraint.Guideline) bindings[12]
            , (android.support.constraint.ConstraintLayout) bindings[5]
            , (android.view.View) bindings[6]
            , (android.support.constraint.ConstraintLayout) bindings[9]
            , (com.wang.avi.AVLoadingIndicatorView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            );
        this.backArrow.setTag(null);
        this.btnLogin.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.signUp.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new lightIT.test.application.generated.callback.OnClickListener(this, 2);
        mCallback1 = new lightIT.test.application.generated.callback.OnClickListener(this, 1);
        mCallback3 = new lightIT.test.application.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.view == variableId) {
            setView((android.view.View) variable);
        }
        else if (BR.handler == variableId) {
            setHandler((lightIT.test.application.app.home.LoginFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((lightIT.test.application.viewmodel.LoginFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setView(@Nullable android.view.View View) {
        this.mView = View;
    }
    public void setHandler(@Nullable lightIT.test.application.app.home.LoginFragment Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setViewModel(@Nullable lightIT.test.application.viewmodel.LoginFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGetLoginButtonClickable((android.arch.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGetLoginButtonClickable(android.arch.lifecycle.LiveData<java.lang.Boolean> ViewModelGetLoginButtonClickable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int viewModelGetLoginButtonClickableViewGONEViewVISIBLE = 0;
        lightIT.test.application.app.home.LoginFragment handler = mHandler;
        boolean androidDatabindingViewDataBindingSafeUnboxViewModelGetLoginButtonClickable = false;
        boolean androidDatabindingViewDataBindingSafeUnboxViewModelGetLoginButtonClickableGetValue = false;
        java.lang.Boolean viewModelGetLoginButtonClickableGetValue = null;
        java.lang.String androidDatabindingViewDataBindingSafeUnboxViewModelGetLoginButtonClickableBtnLoginAndroidStringSubmitReviewJavaLangString = null;
        android.arch.lifecycle.LiveData<java.lang.Boolean> viewModelGetLoginButtonClickable = null;
        lightIT.test.application.viewmodel.LoginFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x19L) != 0) {



                if (viewModel != null) {
                    // read viewModel.getLoginButtonClickable()
                    viewModelGetLoginButtonClickable = viewModel.getLoginButtonClickable();
                }
                updateLiveDataRegistration(0, viewModelGetLoginButtonClickable);


                if (viewModelGetLoginButtonClickable != null) {
                    // read viewModel.getLoginButtonClickable().getValue()
                    viewModelGetLoginButtonClickableGetValue = viewModelGetLoginButtonClickable.getValue();
                }


                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getLoginButtonClickable().getValue())
                androidDatabindingViewDataBindingSafeUnboxViewModelGetLoginButtonClickable = android.databinding.ViewDataBinding.safeUnbox(viewModelGetLoginButtonClickableGetValue);
                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getLoginButtonClickable().getValue())
                androidDatabindingViewDataBindingSafeUnboxViewModelGetLoginButtonClickableGetValue = android.databinding.ViewDataBinding.safeUnbox(viewModelGetLoginButtonClickableGetValue);
            if((dirtyFlags & 0x19L) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxViewModelGetLoginButtonClickable) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
            if((dirtyFlags & 0x19L) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxViewModelGetLoginButtonClickableGetValue) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getLoginButtonClickable().getValue()) ? @android:string/submit_review : ""
                androidDatabindingViewDataBindingSafeUnboxViewModelGetLoginButtonClickableBtnLoginAndroidStringSubmitReviewJavaLangString = ((androidDatabindingViewDataBindingSafeUnboxViewModelGetLoginButtonClickable) ? (btnLogin.getResources().getString(R.string.submit_review)) : (""));
                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getLoginButtonClickable().getValue()) ? View.GONE : View.VISIBLE
                viewModelGetLoginButtonClickableViewGONEViewVISIBLE = ((androidDatabindingViewDataBindingSafeUnboxViewModelGetLoginButtonClickableGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.backArrow.setOnClickListener(mCallback1);
            this.signUp.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.btnLogin, androidDatabindingViewDataBindingSafeUnboxViewModelGetLoginButtonClickableBtnLoginAndroidStringSubmitReviewJavaLangString);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.btnLogin, mCallback2, androidDatabindingViewDataBindingSafeUnboxViewModelGetLoginButtonClickableGetValue);
            this.progressBar.setVisibility(viewModelGetLoginButtonClickableViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel
                lightIT.test.application.viewmodel.LoginFragmentViewModel viewModel = mViewModel;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    if ((etUsername) != (null)) {


                        etUsername.getText();
                        if ((etUsername.getText()) != (null)) {


                            etUsername.getText().toString();

                            if ((etPassword) != (null)) {


                                etPassword.getText();
                                if ((etPassword.getText()) != (null)) {


                                    etPassword.getText().toString();

                                    viewModel.sendRequestForLogin(etUsername.getText().toString(), etPassword.getText().toString());
                                }
                            }
                        }
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                lightIT.test.application.app.home.LoginFragment handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.clickBackButton();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                lightIT.test.application.viewmodel.LoginFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.signUp();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.getLoginButtonClickable()
        flag 1 (0x2L): view
        flag 2 (0x3L): handler
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getLoginButtonClickable().getValue()) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getLoginButtonClickable().getValue()) ? View.GONE : View.VISIBLE
        flag 7 (0x8L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getLoginButtonClickable().getValue()) ? @android:string/submit_review : ""
        flag 8 (0x9L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getLoginButtonClickable().getValue()) ? @android:string/submit_review : ""
    flag mapping end*/
    //end
}