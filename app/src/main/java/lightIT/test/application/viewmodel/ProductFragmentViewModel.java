package lightIT.test.application.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import javax.inject.Inject;

import lightIT.test.application.data.repository.RepositoryApi;
import lightIT.test.application.data.retrofit.ResponseWrap;
import lightIT.test.application.data.retrofit.response.Product;


public class ProductFragmentViewModel extends ViewModel {

    @Inject
    RepositoryApi repositoryApi;

    @Inject
    public ProductFragmentViewModel() {
    }

    private MutableLiveData<ResponseWrap<List<Product>>> productListMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<Boolean> progressBarVisibility = new MutableLiveData<>();


    public void sendProductRequest() {
        repositoryApi.getProductListFromApi(productListMutableLiveData);
    }

    public MutableLiveData<ResponseWrap<List<Product>>> getProductListResponseMutable() {
        return productListMutableLiveData;
    }


    public MutableLiveData<Boolean> getProgressBarEvent() {
        return progressBarVisibility;
    }
}
