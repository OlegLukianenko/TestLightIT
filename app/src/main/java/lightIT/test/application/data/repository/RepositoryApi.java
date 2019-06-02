package lightIT.test.application.data.repository;

import android.arch.lifecycle.MutableLiveData;

import java.util.List;

import lightIT.test.application.data.retrofit.ResponseWrap;
import lightIT.test.application.data.retrofit.request.ReviewRequest;
import lightIT.test.application.data.retrofit.response.Product;
import lightIT.test.application.data.retrofit.response.Review;
import lightIT.test.application.data.retrofit.response.ReviewResponse;

public interface RepositoryApi {

    void getProductListFromApi (MutableLiveData<ResponseWrap<List<Product>>> userMutableLiveData);
    void getReviewListFromApi (int productId, MutableLiveData<ResponseWrap<List<Review>>> reviewMutableLiveData);

    void postRequestForReview(int productId, ReviewRequest  reviewRequest, MutableLiveData<ResponseWrap<ReviewResponse>> reviewResponseMutableLiveData);

}
