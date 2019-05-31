package lightIT.test.application.databinding;
import lightIT.test.application.R;
import lightIT.test.application.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProductBindingImpl extends FragmentProductBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new android.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(0, 
            new String[] {"layout_produst_progress_bar"},
            new int[] {1},
            new int[] {R.layout.layout_produst_progress_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.headerBackground, 2);
        sViewsWithIds.put(R.id.headerResizer, 3);
        sViewsWithIds.put(R.id.textProducts, 4);
        sViewsWithIds.put(R.id.recycleView, 5);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProductBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentProductBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.support.constraint.ConstraintLayout) bindings[2]
            , (android.view.View) bindings[3]
            , (lightIT.test.application.databinding.LayoutProdustProgressBarBinding) bindings[1]
            , (android.support.v7.widget.RecyclerView) bindings[5]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.handler == variableId) {
            setHandler((lightIT.test.application.app.home.ProductFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((lightIT.test.application.viewmodel.ProductFragmentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable lightIT.test.application.app.home.ProductFragment Handler) {
        this.mHandler = Handler;
    }
    public void setViewModel(@Nullable lightIT.test.application.viewmodel.ProductFragmentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
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
                return onChangeIncludeLayoutProgressBar((lightIT.test.application.databinding.LayoutProdustProgressBarBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludeLayoutProgressBar(lightIT.test.application.databinding.LayoutProdustProgressBarBinding IncludeLayoutProgressBar, int fieldId) {
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
        lightIT.test.application.viewmodel.ProductFragmentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xcL) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.includeLayoutProgressBar.setViewModel(viewModel);
        }
        executeBindingsOn(includeLayoutProgressBar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includeLayoutProgressBar
        flag 1 (0x2L): handler
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}