package lightIT.test.application.databinding;
import lightIT.test.application.R;
import lightIT.test.application.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDescriptionBindingImpl extends FragmentDescriptionBinding implements lightIT.test.application.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(17);
        sIncludes.setIncludes(0, 
            new String[] {"layout_description_progress_bar"},
            new int[] {10},
            new int[] {R.layout.layout_description_progress_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerBackground, 11);
        sViewsWithIds.put(R.id.headerResizer, 12);
        sViewsWithIds.put(R.id.viewsWrap, 13);
        sViewsWithIds.put(R.id.ratingBar, 14);
        sViewsWithIds.put(R.id.ReviewTitle, 15);
        sViewsWithIds.put(R.id.recycleView, 16);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDescriptionBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentDescriptionBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.TextView) bindings[15]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.Button) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.widget.EditText) bindings[7]
            , (android.support.constraint.ConstraintLayout) bindings[11]
            , (android.view.View) bindings[12]
            , (android.widget.ImageView) bindings[4]
            , (lightIT.test.application.databinding.LayoutDescriptionProgressBarBinding) bindings[10]
            , (com.wang.avi.AVLoadingIndicatorView) bindings[9]
            , (android.widget.RatingBar) bindings[14]
            , (android.support.v7.widget.RecyclerView) bindings[16]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.support.constraint.ConstraintLayout) bindings[13]
            );
        this.backArrow.setTag(null);
        this.btnLogin.setTag(null);
        this.btnReview.setTag(null);
        this.description.setTag(null);
        this.etReview.setTag(null);
        this.image.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.textPricing.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new lightIT.test.application.generated.callback.OnClickListener(this, 3);
        mCallback4 = new lightIT.test.application.generated.callback.OnClickListener(this, 2);
        mCallback3 = new lightIT.test.application.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        includeLayoutProgressBar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includeLayoutProgressBar.hasPendingBindings()) {
            return true;
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
            setHandler((lightIT.test.application.app.home.DescriptionFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((lightIT.test.application.viewmodel.DescriptionFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setView(@Nullable android.view.View View) {
        this.mView = View;
    }
    public void setHandler(@Nullable lightIT.test.application.app.home.DescriptionFragment Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setViewModel(@Nullable lightIT.test.application.viewmodel.DescriptionFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable android.arch.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includeLayoutProgressBar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGetPostButtonClickable((android.arch.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelGetIsAuthorizationEvent((android.arch.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeIncludeLayoutProgressBar((lightIT.test.application.databinding.LayoutDescriptionProgressBarBinding) object, fieldId);
            case 3 :
                return onChangeViewModelGetDescriptionFromApi((android.arch.lifecycle.MutableLiveData<lightIT.test.application.data.retrofit.response.Product>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGetPostButtonClickable(android.arch.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelGetPostButtonClickable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetIsAuthorizationEvent(android.arch.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelGetIsAuthorizationEvent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeIncludeLayoutProgressBar(lightIT.test.application.databinding.LayoutDescriptionProgressBarBinding IncludeLayoutProgressBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetDescriptionFromApi(android.arch.lifecycle.MutableLiveData<lightIT.test.application.data.retrofit.response.Product> ViewModelGetDescriptionFromApi, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.Boolean viewModelGetPostButtonClickableGetValue = null;
        boolean androidDatabindingViewDataBindingSafeUnboxViewModelGetPostButtonClickableGetValue = false;
        android.graphics.drawable.Drawable viewModelGetIsAuthorizationEventBtnLoginAndroidDrawableIcLogoutRippleBtnLoginAndroidDrawableIcLoginRipple = null;
        java.lang.Boolean viewModelGetIsAuthorizationEventGetValue = null;
        android.arch.lifecycle.MutableLiveData<java.lang.Boolean> viewModelGetPostButtonClickable = null;
        android.arch.lifecycle.MutableLiveData<java.lang.Boolean> viewModelGetIsAuthorizationEvent = null;
        java.lang.String viewModelGetDescriptionFromApiImg = null;
        java.lang.String viewModelGetDescriptionFromApiText = null;
        java.lang.String imageAndroidStringIconUrlViewModelGetDescriptionFromApiImg = null;
        lightIT.test.application.app.home.DescriptionFragment handler = mHandler;
        lightIT.test.application.data.retrofit.response.Product viewModelGetDescriptionFromApiGetValue = null;
        boolean viewModelGetIsAuthorizationEventBooleanTrueBooleanFalse = false;
        int viewModelGetPostButtonClickableViewGONEViewVISIBLE = 0;
        boolean androidDatabindingViewDataBindingSafeUnboxViewModelGetIsAuthorizationEventGetValue = false;
        java.lang.String viewModelGetPostButtonClickableBtnReviewAndroidStringSubmitReviewJavaLangString = null;
        java.lang.String viewModelGetIsAuthorizationEventEtReviewAndroidStringTypeYourReviewEtReviewAndroidStringYouShouldSign = null;
        java.lang.String viewModelGetDescriptionFromApiTitle = null;
        android.arch.lifecycle.MutableLiveData<lightIT.test.application.data.retrofit.response.Product> viewModelGetDescriptionFromApi = null;
        lightIT.test.application.viewmodel.DescriptionFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xcbL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getPostButtonClickable()
                        viewModelGetPostButtonClickable = viewModel.getPostButtonClickable();
                    }
                    updateLiveDataRegistration(0, viewModelGetPostButtonClickable);


                    if (viewModelGetPostButtonClickable != null) {
                        // read viewModel.getPostButtonClickable().getValue()
                        viewModelGetPostButtonClickableGetValue = viewModelGetPostButtonClickable.getValue();
                    }


                    // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getPostButtonClickable().getValue())
                    androidDatabindingViewDataBindingSafeUnboxViewModelGetPostButtonClickableGetValue = android.databinding.ViewDataBinding.safeUnbox(viewModelGetPostButtonClickableGetValue);
                if((dirtyFlags & 0xc1L) != 0) {
                    if(androidDatabindingViewDataBindingSafeUnboxViewModelGetPostButtonClickableGetValue) {
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getPostButtonClickable().getValue()) ? View.GONE : View.VISIBLE
                    viewModelGetPostButtonClickableViewGONEViewVISIBLE = ((androidDatabindingViewDataBindingSafeUnboxViewModelGetPostButtonClickableGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getPostButtonClickable().getValue()) ? @android:string/submit_review : ""
                    viewModelGetPostButtonClickableBtnReviewAndroidStringSubmitReviewJavaLangString = ((androidDatabindingViewDataBindingSafeUnboxViewModelGetPostButtonClickableGetValue) ? (btnReview.getResources().getString(R.string.submit_review)) : (""));
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getIsAuthorizationEvent()
                        viewModelGetIsAuthorizationEvent = viewModel.getIsAuthorizationEvent();
                    }
                    updateLiveDataRegistration(1, viewModelGetIsAuthorizationEvent);


                    if (viewModelGetIsAuthorizationEvent != null) {
                        // read viewModel.getIsAuthorizationEvent().getValue()
                        viewModelGetIsAuthorizationEventGetValue = viewModelGetIsAuthorizationEvent.getValue();
                    }


                    // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getIsAuthorizationEvent().getValue())
                    androidDatabindingViewDataBindingSafeUnboxViewModelGetIsAuthorizationEventGetValue = android.databinding.ViewDataBinding.safeUnbox(viewModelGetIsAuthorizationEventGetValue);
                if((dirtyFlags & 0xc2L) != 0) {
                    if(androidDatabindingViewDataBindingSafeUnboxViewModelGetIsAuthorizationEventGetValue) {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getIsAuthorizationEvent().getValue()) ? @android:drawable/ic_logout_ripple : @android:drawable/ic_login_ripple
                    viewModelGetIsAuthorizationEventBtnLoginAndroidDrawableIcLogoutRippleBtnLoginAndroidDrawableIcLoginRipple = ((androidDatabindingViewDataBindingSafeUnboxViewModelGetIsAuthorizationEventGetValue) ? (getDrawableFromResource(btnLogin, R.drawable.ic_logout_ripple)) : (getDrawableFromResource(btnLogin, R.drawable.ic_login_ripple)));
                    // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getIsAuthorizationEvent().getValue()) ? true : false
                    viewModelGetIsAuthorizationEventBooleanTrueBooleanFalse = ((androidDatabindingViewDataBindingSafeUnboxViewModelGetIsAuthorizationEventGetValue) ? (true) : (false));
                    // read android.databinding.ViewDataBinding.safeUnbox(viewModel.getIsAuthorizationEvent().getValue()) ? @android:string/type_your_review : @android:string/you_should_sign
                    viewModelGetIsAuthorizationEventEtReviewAndroidStringTypeYourReviewEtReviewAndroidStringYouShouldSign = ((androidDatabindingViewDataBindingSafeUnboxViewModelGetIsAuthorizationEventGetValue) ? (etReview.getResources().getString(R.string.type_your_review)) : (etReview.getResources().getString(R.string.you_should_sign)));
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getDescriptionFromApi()
                        viewModelGetDescriptionFromApi = viewModel.getDescriptionFromApi();
                    }
                    updateLiveDataRegistration(3, viewModelGetDescriptionFromApi);


                    if (viewModelGetDescriptionFromApi != null) {
                        // read viewModel.getDescriptionFromApi().getValue()
                        viewModelGetDescriptionFromApiGetValue = viewModelGetDescriptionFromApi.getValue();
                    }


                    if (viewModelGetDescriptionFromApiGetValue != null) {
                        // read viewModel.getDescriptionFromApi().getValue().img
                        viewModelGetDescriptionFromApiImg = viewModelGetDescriptionFromApiGetValue.img;
                        // read viewModel.getDescriptionFromApi().getValue().text
                        viewModelGetDescriptionFromApiText = viewModelGetDescriptionFromApiGetValue.text;
                        // read viewModel.getDescriptionFromApi().getValue().title
                        viewModelGetDescriptionFromApiTitle = viewModelGetDescriptionFromApiGetValue.title;
                    }


                    // read (@android:string/icon_url) + (viewModel.getDescriptionFromApi().getValue().img)
                    imageAndroidStringIconUrlViewModelGetDescriptionFromApiImg = (image.getResources().getString(R.string.icon_url)) + (viewModelGetDescriptionFromApiImg);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.backArrow.setOnClickListener(mCallback3);
            this.btnLogin.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            android.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.btnLogin, viewModelGetIsAuthorizationEventBtnLoginAndroidDrawableIcLogoutRippleBtnLoginAndroidDrawableIcLoginRipple);
            this.etReview.setEnabled(viewModelGetIsAuthorizationEventBooleanTrueBooleanFalse);
            this.etReview.setHint(viewModelGetIsAuthorizationEventEtReviewAndroidStringTypeYourReviewEtReviewAndroidStringYouShouldSign);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.btnReview, viewModelGetPostButtonClickableBtnReviewAndroidStringSubmitReviewJavaLangString);
            android.databinding.adapters.ViewBindingAdapter.setOnClick(this.btnReview, mCallback5, androidDatabindingViewDataBindingSafeUnboxViewModelGetPostButtonClickableGetValue);
            this.progressBar.setVisibility(viewModelGetPostButtonClickableViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.description, viewModelGetDescriptionFromApiText);
            lightIT.test.application.utils.BindingAdapters.setAvatar(this.image, imageAndroidStringIconUrlViewModelGetDescriptionFromApiImg);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textPricing, viewModelGetDescriptionFromApiTitle);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, viewModelGetDescriptionFromApiTitle);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.includeLayoutProgressBar.setViewModel(viewModel);
        }
        executeBindingsOn(includeLayoutProgressBar);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel.getIsAuthorizationEvent().getValue()
                java.lang.Boolean viewModelGetIsAuthorizationEventGetValue = null;
                // viewModel.getDescriptionFromApi().getValue().id
                int viewModelGetDescriptionFromApiId = 0;
                // viewModel.getIsAuthorizationEvent() != null
                boolean viewModelGetIsAuthorizationEventJavaLangObjectNull = false;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.getDescriptionFromApi().getValue()
                lightIT.test.application.data.retrofit.response.Product viewModelGetDescriptionFromApiGetValue = null;
                // viewModel.getDescriptionFromApi() != null
                boolean viewModelGetDescriptionFromApiJavaLangObjectNull = false;
                // viewModel.getDescriptionFromApi().getValue() != null
                boolean viewModelGetDescriptionFromApiGetValueJavaLangObjectNull = false;
                // viewModel.getIsAuthorizationEvent()
                android.arch.lifecycle.MutableLiveData<java.lang.Boolean> viewModelGetIsAuthorizationEvent = null;
                // viewModel.getDescriptionFromApi()
                android.arch.lifecycle.MutableLiveData<lightIT.test.application.data.retrofit.response.Product> viewModelGetDescriptionFromApi = null;
                // viewModel
                lightIT.test.application.viewmodel.DescriptionFragmentViewModel viewModel = mViewModel;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelGetIsAuthorizationEvent = viewModel.getIsAuthorizationEvent();

                    viewModelGetIsAuthorizationEventJavaLangObjectNull = (viewModelGetIsAuthorizationEvent) != (null);
                    if (viewModelGetIsAuthorizationEventJavaLangObjectNull) {


                        viewModelGetIsAuthorizationEventGetValue = viewModelGetIsAuthorizationEvent.getValue();
                        if (viewModelGetIsAuthorizationEventGetValue) {




                            if ((etReview) != (null)) {


                                etReview.getText();
                                if ((etReview.getText()) != (null)) {


                                    etReview.getText().toString();

                                    if ((ratingBar) != (null)) {


                                        ratingBar.getRating();




                                        viewModelGetDescriptionFromApi = viewModel.getDescriptionFromApi();

                                        viewModelGetDescriptionFromApiJavaLangObjectNull = (viewModelGetDescriptionFromApi) != (null);
                                        if (viewModelGetDescriptionFromApiJavaLangObjectNull) {


                                            viewModelGetDescriptionFromApiGetValue = viewModelGetDescriptionFromApi.getValue();

                                            viewModelGetDescriptionFromApiGetValueJavaLangObjectNull = (viewModelGetDescriptionFromApiGetValue) != (null);
                                            if (viewModelGetDescriptionFromApiGetValueJavaLangObjectNull) {


                                                viewModelGetDescriptionFromApiId = viewModelGetDescriptionFromApiGetValue.id;

                                                viewModel.postRequestForReview(etReview.getText().toString(), ((int) (ratingBar.getRating())), viewModelGetDescriptionFromApiId);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        else {




                            viewModel.shouldSignEvent();
                        }
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel.getIsAuthorizationEvent().getValue()
                java.lang.Boolean viewModelGetIsAuthorizationEventGetValue = null;
                // viewModel.getIsAuthorizationEvent()
                android.arch.lifecycle.MutableLiveData<java.lang.Boolean> viewModelGetIsAuthorizationEvent = null;
                // viewModel.getIsAuthorizationEvent() != null
                boolean viewModelGetIsAuthorizationEventJavaLangObjectNull = false;
                // viewModel
                lightIT.test.application.viewmodel.DescriptionFragmentViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelGetIsAuthorizationEvent = viewModel.getIsAuthorizationEvent();

                    viewModelGetIsAuthorizationEventJavaLangObjectNull = (viewModelGetIsAuthorizationEvent) != (null);
                    if (viewModelGetIsAuthorizationEventJavaLangObjectNull) {


                        viewModelGetIsAuthorizationEventGetValue = viewModelGetIsAuthorizationEvent.getValue();
                        if (viewModelGetIsAuthorizationEventGetValue) {




                            viewModel.logoutClick();
                        }
                        else {




                            viewModel.authorizationClick();
                        }
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // handler
                lightIT.test.application.app.home.DescriptionFragment handler = mHandler;
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
        flag 0 (0x1L): viewModel.getPostButtonClickable()
        flag 1 (0x2L): viewModel.getIsAuthorizationEvent()
        flag 2 (0x3L): includeLayoutProgressBar
        flag 3 (0x4L): viewModel.getDescriptionFromApi()
        flag 4 (0x5L): view
        flag 5 (0x6L): handler
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getIsAuthorizationEvent().getValue()) ? @android:drawable/ic_logout_ripple : @android:drawable/ic_login_ripple
        flag 9 (0xaL): android.databinding.ViewDataBinding.safeUnbox(viewModel.getIsAuthorizationEvent().getValue()) ? @android:drawable/ic_logout_ripple : @android:drawable/ic_login_ripple
        flag 10 (0xbL): android.databinding.ViewDataBinding.safeUnbox(viewModel.getIsAuthorizationEvent().getValue()) ? true : false
        flag 11 (0xcL): android.databinding.ViewDataBinding.safeUnbox(viewModel.getIsAuthorizationEvent().getValue()) ? true : false
        flag 12 (0xdL): android.databinding.ViewDataBinding.safeUnbox(viewModel.getPostButtonClickable().getValue()) ? View.GONE : View.VISIBLE
        flag 13 (0xeL): android.databinding.ViewDataBinding.safeUnbox(viewModel.getPostButtonClickable().getValue()) ? View.GONE : View.VISIBLE
        flag 14 (0xfL): android.databinding.ViewDataBinding.safeUnbox(viewModel.getPostButtonClickable().getValue()) ? @android:string/submit_review : ""
        flag 15 (0x10L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getPostButtonClickable().getValue()) ? @android:string/submit_review : ""
        flag 16 (0x11L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getIsAuthorizationEvent().getValue()) ? @android:string/type_your_review : @android:string/you_should_sign
        flag 17 (0x12L): android.databinding.ViewDataBinding.safeUnbox(viewModel.getIsAuthorizationEvent().getValue()) ? @android:string/type_your_review : @android:string/you_should_sign
    flag mapping end*/
    //end
}