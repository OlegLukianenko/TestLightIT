package lightIT.test.application.di.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;
import android.util.ArrayMap;

import java.util.Map;
import java.util.concurrent.Callable;

import javax.inject.Inject;

import lightIT.test.application.viewmodel.DescriptionFragmentViewModel;
import lightIT.test.application.viewmodel.ProductFragmentViewModel;
import lightIT.test.application.viewmodel.LoginFragmentViewModel;
import lightIT.test.application.viewmodel.RegistrationFragmentViewModel;
import lightIT.test.application.viewmodel.SplashActivityViewModel;

public class ViewModelFactory implements ViewModelProvider.Factory {

    private final ArrayMap<Class, Callable<? extends ViewModel>> creators;

    @Inject
    public ViewModelFactory(ViewModelComponent component) {
        creators = new ArrayMap<>();
        creators.put(SplashActivityViewModel.class, component::splashActivityViewModel);
        creators.put(ProductFragmentViewModel.class, component::productFragmentViewModel);
        creators.put(LoginFragmentViewModel.class, component::loginFragmentViewModel);
        creators.put(DescriptionFragmentViewModel.class, component::descriptionFragmentViewModel);
        creators.put(RegistrationFragmentViewModel.class, component::registrationFragmentViewModel);
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        Callable<? extends ViewModel> creator = creators.get(modelClass);
        if (creator == null) {
            for (Map.Entry<Class, Callable<? extends ViewModel>> entry : creators.entrySet()) {
                if (modelClass.isAssignableFrom(entry.getKey())) {
                    creator = entry.getValue();
                    break;
                }
            }
        }
        if (creator == null) {
            throw new IllegalArgumentException("Unknown model class " + modelClass);
        }

        try {
            return (T) creator.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


