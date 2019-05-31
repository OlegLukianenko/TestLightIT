package lightIT.test.application.data.repository;

import android.arch.lifecycle.MutableLiveData;

import java.util.List;

import lightIT.test.application.data.retrofit.ResponseWrap;
import lightIT.test.application.data.retrofit.response.Product;

public interface RepositoryApi {

    void getProductListFromApi (MutableLiveData<ResponseWrap<List<Product>>> userMutableLiveData);
}
