package lightIT.test.application.databinding;
import lightIT.test.application.R;
import lightIT.test.application.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegistrationBindingImpl extends FragmentRegistrationBinding implements lightIT.test.application.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerBackground, 4);
        sViewsWithIds.put(R.id.headerResizer, 5);
        sViewsWithIds.put(R.id.textPricing, 6);
        sViewsWithIds.put(R.id.appName, 7);
        sViewsWithIds.put(R.id.registrationViewsWrap, 8);
        sViewsWithIds.put(R.id.etUsername, 9);
        sViewsWithIds.put(R.id.etPassword, 10);
        sViewsWithIds.put(R.id.guideline_h_1, 11);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRegistrationBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentRegistrationBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.Button) bindings[2]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[9]
            , (android.support.constraint.Guideline) bindings[11]
            , (android.support.constraint.ConstraintLayout) bindings[4]
            , (android.view.View) bindings[5]
            , (com.wang.avi.AVLoadingIndicatorView) bindings[3]
            , (android.support.constraint.ConstraintLayout) bindings[8]
            , (android.widget.TextView) bindings[6]
            );
        this.backArrow.setTag(null);
        this.btnLogin.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new lightIT.test.application.generated.callback.OnClickListener(this, 2);
        mCallback4 = new lightIT.test.application.generated.callback.OnClickListener(this, 1);
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
            setHandler((lightIT.test.application.app.home.RegistrationFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((lightIT.test.application.viewmodel.RegistrationFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setView(@Nullable android.view.View View) {
        this.mView = View;
    }
    public void setHandler(@Nullable lightIT.test.application.app.home.RegistrationFragment Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setViewModel(@Nullable lightIT.test.application.viewmodel.RegistrationFragmentViewModel ViewModel) {
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
                return onChangeViewModelGetRegistrationButtonClickable((android.arch.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGetRegistrationButtonClickable(android.arch.lifecycle.LiveData<java.lang.Boolean> ViewModelGetRegistrationButtonClickable, int fieldId) {
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
        android.arch.lifecycle.LiveData<java.lang.Boolean> viewModelGetRegistrationButtonClickable = null;
        int viewModelGetRegistrationButtonClickableViewGONEViewVISIBLE = 0;
        java.lang.Boolean viewModelGetRegistrationButtonClickableGetValue = null;
        boolean androidDatabindingViewDataBindingSafeUnboxViewModelGetRegistrationButtonClickableGetValue = false;
        lightIT.test.application.app.home.RegistrationFragment handler = mHandler;
        java.lang.String viewModelGetRegistrationButtonClickableBtnLoginAndroidStringSubmitReviewJavaLangString = null;
        lightIT.test.application.viewmodel.RegistrationFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x19L) != 0) {



                if (viewModel != null) {
                    // read viewModel.getRegistrationButtonClickable()
                    viewModelGetRegistrationButtonClickable = viewModel.getRegistrationButtonClickable();
                }
                updateLiveDataRegistration(0, viewModelGetRegistrationButtonClickable);


                if (viewModelGetRegistrationButtonClickable != null) {
                    // read viewModel.getRegistrationButtonClickable().getValue()
                    viewModelGetRegistrationButtonClickableGetValue = viewModelGetRegistrationButtonClickable.getValue();
                }


                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getRegistrationButtonClickable().getValue())
                androidDatabindingViewDataBindingSafeUnboxViewModelGetRegistrationButtonClickableGetValue = android.databinding.ViewDataBinding.safeUnbox(viewModelGetRegistrationButtonClickableGetValue);
            if((dirtyFlags & 0x19L) != 0) {
                if(androidDatabindingViewDataBindingSafeUnboxViewModelGetRegistrationButtonClickableGetValue) {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
            }


                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getRegistrationButtonClickable().getValue()) ? View.GONE : View.VISIBLE
                viewModelGetRegistrationButtonClickableViewGONEViewVISIBLE = ((androidDatabindingViewDataBindingSafeUnboxViewModelGetRegistrationButtonClickableGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getRegistrationButtonClickable().getValue()) ? @android:string/submit_review : ""
                viewModelGetRegistrationButtonClickableBtnLoginAndroidStringSubmitReviewJavaLangString = ((androidDatabindingViewDataBindingSafeUnboxViewModelGetRegistrationButtonClickableGetValue) ? (btnLogin.getResources().getString(R.string.submit_review)) : (""));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.backArrow.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.btnLogin, viewModelGetRegistrationButtonClickableBtnLoginAndroidStringSubmitReviewJavaLangString);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.btnLogin, mCallback5, androidDatabindingViewDataBindingSafeUnboxViewModelGetRegistrationButtonClickableGetValue);
            this.progressBar.setVisibility(viewModelGetRegistrationButtonClickableViewGONEViewVISIBLE);
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
                lightIT.test.application.viewmodel.RegistrationFragmentViewModel viewModel = mViewModel;



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

                                    viewModel.sendRequestForRegistration(etUsername.getText().toString(), etPassword.getText().toString());
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
                lightIT.test.application.app.home.RegistrationFragment handler = mHandler;
                // handler != null
                boolean handlerJavaLangObjectNull = false;



                handlerJavaLangObjectNull = (handler) != (null);
                if (handlerJavaLangObjectNull) {


                    handler.clickBackButton();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.getRegistrationButtonClickable()
        flag 1 (0x2L): view
        flag 2 (0x3L): handler
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getRegistrationButtonClickable().getValue()) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getRegistrationButtonClickable().getValue()) ? View.GONE : View.VISIBLE
        flag 7 (0x8L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getRegistrationButtonClickable().getValue()) ? @android:string/submit_review : ""
        flag 8 (0x9L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getRegistrationButtonClickable().getValue()) ? @android:string/submit_review : ""
    flag mapping end*/
    //end
}