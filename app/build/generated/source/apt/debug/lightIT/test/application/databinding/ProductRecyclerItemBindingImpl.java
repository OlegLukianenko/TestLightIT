package lightIT.test.application.databinding;
import lightIT.test.application.R;
import lightIT.test.application.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProductRecyclerItemBindingImpl extends ProductRecyclerItemBinding implements lightIT.test.application.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rounded_background, 3);
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

    public ProductRecyclerItemBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ProductRecyclerItemBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.view.View) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.image.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new lightIT.test.application.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.data == variableId) {
            setData((lightIT.test.application.data.retrofit.response.Product) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((lightIT.test.application.app.home.adapter.ProductRecyclerAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable lightIT.test.application.data.retrofit.response.Product Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setAdapter(@Nullable lightIT.test.application.app.home.adapter.ProductRecyclerAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String imageAndroidStringIconUrlDataImg = null;
        java.lang.String dataTitle = null;
        java.lang.String dataImg = null;
        lightIT.test.application.data.retrofit.response.Product data = mData;
        lightIT.test.application.app.home.adapter.ProductRecyclerAdapter adapter = mAdapter;

        if ((dirtyFlags & 0x5L) != 0) {



                if (data != null) {
                    // read data.title
                    dataTitle = data.title;
                    // read data.img
                    dataImg = data.img;
                }


                // read (@android:string/icon_url) + (data.img)
                imageAndroidStringIconUrlDataImg = (image.getResources().getString(R.string.icon_url)) + (dataImg);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            lightIT.test.application.utils.BindingAdapters.setAvatar(this.image, imageAndroidStringIconUrlDataImg);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, dataTitle);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // adapter.productItemListListener != null
        boolean adapterProductItemListListenerJavaLangObjectNull = false;
        // adapter
        lightIT.test.application.app.home.adapter.ProductRecyclerAdapter adapter = mAdapter;
        // adapter.productItemListListener
        lightIT.test.application.app.home.adapter.ProductRecyclerAdapter.ProductItemListListener adapterProductItemListListener = null;
        // data
        lightIT.test.application.data.retrofit.response.Product data = mData;
        // adapter != null
        boolean adapterJavaLangObjectNull = false;



        adapterJavaLangObjectNull = (adapter) != (null);
        if (adapterJavaLangObjectNull) {


            adapterProductItemListListener = adapter.productItemListListener;

            adapterProductItemListListenerJavaLangObjectNull = (adapterProductItemListListener) != (null);
            if (adapterProductItemListListenerJavaLangObjectNull) {



                adapterProductItemListListener.onProductItemClick(data);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): adapter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}