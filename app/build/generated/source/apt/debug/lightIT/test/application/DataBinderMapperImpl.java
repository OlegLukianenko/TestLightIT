package lightIT.test.application;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lightIT.test.application.databinding.ActivityMainBindingImpl;
import lightIT.test.application.databinding.ActivitySplashBindingImpl;
import lightIT.test.application.databinding.FragmentDescriptionBindingImpl;
import lightIT.test.application.databinding.FragmentLoginBindingImpl;
import lightIT.test.application.databinding.FragmentProductBindingImpl;
import lightIT.test.application.databinding.LayoutDescriptionProgressBarBindingImpl;
import lightIT.test.application.databinding.LayoutProdustProgressBarBindingImpl;
import lightIT.test.application.databinding.LayoutSnackBarBindingImpl;
import lightIT.test.application.databinding.ProductRecyclerItemBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYSPLASH = 2;

  private static final int LAYOUT_FRAGMENTDESCRIPTION = 3;

  private static final int LAYOUT_FRAGMENTLOGIN = 4;

  private static final int LAYOUT_FRAGMENTPRODUCT = 5;

  private static final int LAYOUT_LAYOUTDESCRIPTIONPROGRESSBAR = 6;

  private static final int LAYOUT_LAYOUTPRODUSTPROGRESSBAR = 7;

  private static final int LAYOUT_LAYOUTSNACKBAR = 8;

  private static final int LAYOUT_PRODUCTRECYCLERITEM = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(lightIT.test.application.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(lightIT.test.application.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(lightIT.test.application.R.layout.fragment_description, LAYOUT_FRAGMENTDESCRIPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(lightIT.test.application.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(lightIT.test.application.R.layout.fragment_product, LAYOUT_FRAGMENTPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(lightIT.test.application.R.layout.layout_description_progress_bar, LAYOUT_LAYOUTDESCRIPTIONPROGRESSBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(lightIT.test.application.R.layout.layout_produst_progress_bar, LAYOUT_LAYOUTPRODUSTPROGRESSBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(lightIT.test.application.R.layout.layout_snack_bar, LAYOUT_LAYOUTSNACKBAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(lightIT.test.application.R.layout.product_recycler_item, LAYOUT_PRODUCTRECYCLERITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDESCRIPTION: {
          if ("layout/fragment_description_0".equals(tag)) {
            return new FragmentDescriptionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_description is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCT: {
          if ("layout/fragment_product_0".equals(tag)) {
            return new FragmentProductBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTDESCRIPTIONPROGRESSBAR: {
          if ("layout/layout_description_progress_bar_0".equals(tag)) {
            return new LayoutDescriptionProgressBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_description_progress_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPRODUSTPROGRESSBAR: {
          if ("layout/layout_produst_progress_bar_0".equals(tag)) {
            return new LayoutProdustProgressBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_produst_progress_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSNACKBAR: {
          if ("layout/layout_snack_bar_0".equals(tag)) {
            return new LayoutSnackBarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_snack_bar is invalid. Received: " + tag);
        }
        case  LAYOUT_PRODUCTRECYCLERITEM: {
          if ("layout/product_recycler_item_0".equals(tag)) {
            return new ProductRecyclerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for product_recycler_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(7);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "handler");
      sKeys.put(2, "view");
      sKeys.put(3, "adapter");
      sKeys.put(4, "data");
      sKeys.put(5, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_main_0", lightIT.test.application.R.layout.activity_main);
      sKeys.put("layout/activity_splash_0", lightIT.test.application.R.layout.activity_splash);
      sKeys.put("layout/fragment_description_0", lightIT.test.application.R.layout.fragment_description);
      sKeys.put("layout/fragment_login_0", lightIT.test.application.R.layout.fragment_login);
      sKeys.put("layout/fragment_product_0", lightIT.test.application.R.layout.fragment_product);
      sKeys.put("layout/layout_description_progress_bar_0", lightIT.test.application.R.layout.layout_description_progress_bar);
      sKeys.put("layout/layout_produst_progress_bar_0", lightIT.test.application.R.layout.layout_produst_progress_bar);
      sKeys.put("layout/layout_snack_bar_0", lightIT.test.application.R.layout.layout_snack_bar);
      sKeys.put("layout/product_recycler_item_0", lightIT.test.application.R.layout.product_recycler_item);
    }
  }
}
