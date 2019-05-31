package lightIT.test.application.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import javax.inject.Inject;

import lightIT.test.application.data.repository.RepositoryApi;
import lightIT.test.application.data.retrofit.response.Product;

public class DescriptionFragmentViewModel extends ViewModel {

    @Inject
    RepositoryApi repositoryApi;

    @Inject
    public DescriptionFragmentViewModel() {
    }

    private MutableLiveData<Boolean> progressBarVisibility = new MutableLiveData<>();
    private MutableLiveData<Product> descriptionMutableLiveData = new MutableLiveData<>();

//    public void sendProfileRequest(String login) {
//        repositoryApi.getUserProfile(login ,profileMutableLiveData);
//    }

    public MutableLiveData<Product> getDescriptionFromApi() {
        return descriptionMutableLiveData;
    }


    public MutableLiveData<Boolean> getProgressBarEvent() {
        return progressBarVisibility;
    }

}
