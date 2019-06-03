package lightIT.test.application.data.retrofit;

import java.util.List;

import lightIT.test.application.data.retrofit.request.LoginRequest;
import lightIT.test.application.data.retrofit.request.ReviewRequest;
import lightIT.test.application.data.retrofit.response.LoginResponse;
import lightIT.test.application.data.retrofit.response.Product;
import lightIT.test.application.data.retrofit.response.Review;
import lightIT.test.application.data.retrofit.response.ReviewResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ServerApi {

    @GET("/api/products/")
    Call<List<Product>> getProductList();

    @GET("/api/reviews/{productId}")
    Call<List<Review>> getReviewList(@Path("productId") int productId);

    @POST("/api/reviews/{productId}")
    Call<ReviewResponse> postReview(@Header("Authorization") String token, @Path("productId") int productId, @Body ReviewRequest reviewRequest);

    @POST("/api/login/")
    Call<LoginResponse> sendLoginRequest(@Body LoginRequest loginRequest);

}