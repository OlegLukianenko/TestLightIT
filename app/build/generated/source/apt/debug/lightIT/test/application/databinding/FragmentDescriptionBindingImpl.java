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
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerBackground, 6);
        sViewsWithIds.put(R.id.headerResizer, 7);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDescriptionBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentDescriptionBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.support.constraint.ConstraintLayout) bindings[6]
            , (android.view.View) bindings[7]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.backArrow.setTag(null);
        this.description.setTag(null);
        this.image.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textPricing.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new lightIT.test.application.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.handler == variableId) {
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

    public void setHandler(@Nullable lightIT.test.application.app.home.DescriptionFragment Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setViewModel(@Nullable lightIT.test.application.viewmodel.DescriptionFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGetDescriptionFromApi((android.arch.lifecycle.MutableLiveData<lightIT.test.application.data.retrofit.response.Product>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGetDescriptionFromApi(android.arch.lifecycle.MutableLiveData<lightIT.test.application.data.retrofit.response.Product> ViewModelGetDescriptionFromApi, int fieldId) {
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
        java.lang.String viewModelGetDescriptionFromApiImg = null;
        java.lang.String viewModelGetDescriptionFromApiText = null;
        java.lang.String imageAndroidStringIconUrlViewModelGetDescriptionFromApiImg = null;
        lightIT.test.application.app.home.DescriptionFragment handler = mHandler;
        lightIT.test.application.data.retrofit.response.Product viewModelGetDescriptionFromApiGetValue = null;
        java.lang.String viewModelGetDescriptionFromApiTitle = null;
        android.arch.lifecycle.MutableLiveData<lightIT.test.application.data.retrofit.response.Product> viewModelGetDescriptionFromApi = null;
        lightIT.test.application.viewmodel.DescriptionFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.getDescriptionFromApi()
                    viewModelGetDescriptionFromApi = viewModel.getDescriptionFromApi();
                }
                updateLiveDataRegistration(0, viewModelGetDescriptionFromApi);


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
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.backArrow.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.description, viewModelGetDescriptionFromApiText);
            lightIT.test.application.utils.BindingAdapters.setAvatar(this.image, imageAndroidStringIconUrlViewModelGetDescriptionFromApiImg);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textPricing, viewModelGetDescriptionFromApiTitle);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, viewModelGetDescriptionFromApiTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        lightIT.test.application.app.home.DescriptionFragment handler = mHandler;
        // handler != null
        boolean handlerJavaLangObjectNull = false;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {


            handler.clickBackButton();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.getDescriptionFromApi()
        flag 1 (0x2L): handler
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}