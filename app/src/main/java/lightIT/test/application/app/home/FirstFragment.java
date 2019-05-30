package lightIT.test.application.app.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import javax.inject.Inject;

import lightIT.test.application.R;
import lightIT.test.application.base.BaseFragment;
import lightIT.test.application.databinding.FragmentFirstBinding;
import lightIT.test.application.di.viewmodel.Injectable;
import lightIT.test.application.viewmodel.FirstFragmentViewModel;


public class FirstFragment extends BaseFragment<FragmentFirstBinding> implements
        Injectable {

    @Inject
    FirstFragmentViewModel viewModel;

    @Override
    protected int getLayout() {
        return R.layout.fragment_first;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.setViewModel(viewModel);

    }
}
