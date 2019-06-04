package lightIT.test.application.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.SharedPreferences;

import java.util.List;

import javax.inject.Inject;

import lightIT.test.application.R;
import lightIT.test.application.base.SingleLiveEvent;
import lightIT.test.application.data.repository.RepositoryApi;
import lightIT.test.application.data.retrofit.ResponseWrap;
import lightIT.test.application.data.retrofit.request.ReviewRequest;
import lightIT.test.application.data.retrofit.response.Product;
import lightIT.test.application.data.retrofit.response.Review;
import lightIT.test.application.data.retrofit.response.ReviewResponse;
import lightIT.test.application.utils.NetworkHelper;

import static lightIT.test.application.app.home.MainActivity.USER_TOKEN_SP;

public class DescriptionFragmentViewModel extends ViewModel {

    @Inject
    RepositoryApi repositoryApi;

    @Inject
    protected NetworkHelper networkHelper;

    @Inject
    SharedPreferences sharedPreferences;

    @Inject
    public DescriptionFragmentViewModel() {
        postButtonClickable.setValue(true);
    }

    private MutableLiveData<Boolean> progressBarVisibility = new MutableLiveData<>();
    private MutableLiveData<Product> descriptionMutableLiveData = new MutableLiveData<>();
    private MutableLiveData<ResponseWrap<List<Review>>> reviewtListMutableLiveData = new MutableLiveData<>();

    private MutableLiveData<ResponseWrap<ReviewResponse>> postReviewResponse = new MutableLiveData<>();
    private MutableLiveData<Boolean> postButtonClickable = new MutableLiveData<>();
    private SingleLiveEvent<Void> emptyFieldsError = new SingleLiveEvent<>();
    private SingleLiveEvent<Void> internetConnectionError = new SingleLiveEvent<>();

    private SingleLiveEvent<Void> authorizationEvent = new SingleLiveEvent<>();
    private MutableLiveData<Boolean> isAuthorizationEvent = new MutableLiveData<>();
    private SingleLiveEvent<Void> shouldSignEvent = new SingleLiveEvent<>();
    private SingleLiveEvent<Void> logoutClickEvent = new SingleLiveEvent<>();


    public void sendReviewRequest(int productId) {
        repositoryApi.getReviewListFromApi(productId, reviewtListMutableLiveData);
    }

    public MutableLiveData<ResponseWrap<List<Review>>> getReviewtListResponseMutable() {
        return reviewtListMutableLiveData;
    }

    public MutableLiveData<Boolean> getIsAuthorizationEvent() {
        return isAuthorizationEvent;
    }

    public MutableLiveData<Product> getDescriptionFromApi() {
        return descriptionMutableLiveData;
    }

    public MutableLiveData<Boolean> getProgressBarEvent() {
        return progressBarVisibility;
    }


    public MutableLiveData<Boolean> getPostButtonClickable() {
        return postButtonClickable;
    }


    public LiveData<ResponseWrap<ReviewResponse>> getPostReviewResponse() {
        return postReviewResponse;
    }

    public SingleLiveEvent<Void> observeEmptyFieldsError() {
        return emptyFieldsError;
    }

    public SingleLiveEvent<Void> observeInternetConnectionError() {
        return internetConnectionError;
    }

    public SingleLiveEvent<Void> observeAuthorizationEvent() {
        return authorizationEvent;
    }

    public SingleLiveEvent<Void> observeShouldSignEvent() {
        return shouldSignEvent;
    }

    public SingleLiveEvent<Void> observeLogoutClickEvent() {
        return logoutClickEvent;
    }


    public void postRequestForReview(String text, int rate, int productId) {

        if (text.isEmpty()) {
            emptyFieldsError.call();
            return;
        }

        if (networkHelper.isNetworkAvailable()) {
            postButtonClickable.setValue(false);
            repositoryApi.postRequestForReview("Token " + sharedPreferences.getString(USER_TOKEN_SP, ""), productId, new ReviewRequest(rate, text), postReviewResponse);
        } else {
            internetConnectionError.call();
        }

    }

    public void shouldSignEvent() {
        shouldSignEvent.call();
    }

    public void authorizationClick() {
        authorizationEvent.call();
    }

    public void logoutClick() {
        logoutClickEvent.call();
    }

}
