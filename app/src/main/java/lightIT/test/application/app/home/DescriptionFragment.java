package lightIT.test.application.app.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import javax.inject.Inject;

import lightIT.test.application.R;
import lightIT.test.application.base.BaseFragment;
import lightIT.test.application.data.retrofit.response.Product;
import lightIT.test.application.databinding.FragmentDescriptionBinding;
import lightIT.test.application.di.viewmodel.Injectable;
import lightIT.test.application.utils.NetworkHelper;
import lightIT.test.application.viewmodel.DescriptionFragmentViewModel;

public class DescriptionFragment extends BaseFragment<FragmentDescriptionBinding> implements
        Injectable {

    @Inject
    DescriptionFragmentViewModel viewModel;

    @Inject
    protected NetworkHelper networkHelper;

    //@Inject
    //ProductRecyclerAdapter productRecyclerAdapter;

    @Override
    protected int getLayout() {
        return R.layout.fragment_description;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.setViewModel(viewModel);
        binding.setHandler(this);

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            Product product = bundle.getParcelable("product");
            viewModel.getDescriptionFromApi().setValue(product);
        }

    }


    public void clickBackButton() {
        getActivity().onBackPressed();
    }

}
