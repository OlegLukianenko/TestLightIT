package lightIT.test.application.data.repository;

import android.arch.lifecycle.MutableLiveData;
import android.text.TextUtils;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;

import javax.inject.Inject;

import lightIT.test.application.data.retrofit.ResponseWrap;
import lightIT.test.application.data.retrofit.request.LoginRequest;
import lightIT.test.application.data.retrofit.request.ReviewRequest;
import lightIT.test.application.data.retrofit.response.LoginResponse;
import lightIT.test.application.data.retrofit.response.Product;
import lightIT.test.application.data.retrofit.response.Review;
import lightIT.test.application.data.retrofit.response.ReviewResponse;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;
import lightIT.test.application.data.retrofit.APIError;
import lightIT.test.application.data.retrofit.ServerApi;



public class RepositoryImpl implements RepositoryApi {

    @Inject
    ServerApi serverApi;

    @Inject
    protected Converter<ResponseBody, APIError> converter;
    private static final String UNKNOWN_ERROR = "Unknown error: ";
    public static final int TIMEOUT_CODE = 408;

    @Inject
    public RepositoryImpl() {
    }


    @Override
    public void getProductListFromApi(MutableLiveData<ResponseWrap<List<Product>>> productMutableLiveData) {
        Call<List<Product>> messages = serverApi.getProductList();
        messages.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                ResponseWrap<List<Product>> responseWrap;
                if (response.isSuccessful()) {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), response.body());
                } else {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), getErrorMessage(response));
                }

                productMutableLiveData.postValue(responseWrap);
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                ResponseWrap<List<Product>> responseWrap;

                if (t instanceof SocketTimeoutException) {
                    responseWrap = new ResponseWrap<>(false, TIMEOUT_CODE, null, t.getMessage());
                } else {
                    responseWrap = new ResponseWrap<>(false, 0, null, t.getMessage());
                }

                productMutableLiveData.postValue(responseWrap);
            }
        });
    }

    @Override
    public void getReviewListFromApi(int productId, MutableLiveData<ResponseWrap<List<Review>>> reviewMutableLiveData) {
        Call<List<Review>> messages = serverApi.getReviewList(productId);
        messages.enqueue(new Callback<List<Review>>() {
            @Override
            public void onResponse(Call<List<Review>> call, Response<List<Review>> response) {
                ResponseWrap<List<Review>> responseWrap;
                if (response.isSuccessful()) {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), response.body());
                } else {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), getErrorMessage(response));
                }

                reviewMutableLiveData.postValue(responseWrap);
            }

            @Override
            public void onFailure(Call<List<Review>> call, Throwable t) {
                ResponseWrap<List<Review>> responseWrap;

                if (t instanceof SocketTimeoutException) {
                    responseWrap = new ResponseWrap<>(false, TIMEOUT_CODE, null, t.getMessage());
                } else {
                    responseWrap = new ResponseWrap<>(false, 0, null, t.getMessage());
                }

                reviewMutableLiveData.postValue(responseWrap);
            }
        });
    }

    @Override
    public void postRequestForReview(int productId, ReviewRequest reviewRequest, MutableLiveData<ResponseWrap<ReviewResponse>> reviewResponseMutableLiveData) {

        Call<ReviewResponse> messages = serverApi.postReview("6352d8c3cea5fe1034840f4e710538b48daac598", productId, reviewRequest);
        messages.enqueue(new Callback<ReviewResponse>() {
            @Override
            public void onResponse(Call<ReviewResponse> call, Response<ReviewResponse> response) {
                ResponseWrap<ReviewResponse> responseWrap;
                if (response.isSuccessful()) {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), response.body());
                } else {
                    responseWrap = new ResponseWrap<>(response.isSuccessful(), response.code(), getErrorMessage(response));
                }

                reviewResponseMutableLiveData.postValue(responseWrap);
            }

            @Override
            public void onFailure(Call<ReviewResponse> call, Throwable t) {
                ResponseWrap<ReviewResponse> responseWrap;

                if (t instanceof SocketTimeoutException) {
                    responseWrap = new ResponseWrap<>(false, TIMEOUT_CODE, null, t.getMessage());
                } else {
                    responseWrap = new ResponseWrap<>(false, 0, null, t.getMessage());
                }

                reviewResponseMutableLiveData.postValue(responseWrap);
            }
        });
    }



    @Override
    public void sendLoginRequest(LoginRequest loginRequest, MutableLiveData<ResponseWrap<LoginResponse>> loginResponseMutableLiveData) {

    }





    private String getErrorMessage(Response<?> response) {
        String responseErrorMessage = null;

        try {
            APIError error = converter.convert(response.errorBody());
            if (!TextUtils.isEmpty(error.getMessage())) {
                responseErrorMessage = error.getMessage();
            }
        } catch (IOException e) {
            return UNKNOWN_ERROR + response.code();
        }

        return responseErrorMessage;
    }
}
