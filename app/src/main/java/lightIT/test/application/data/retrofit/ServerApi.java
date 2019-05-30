package lightIT.test.application.data.retrofit;

import java.util.List;

import lightIT.test.application.data.retrofit.response.Product;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ServerApi {

    @GET("/api/products/")
    Call<List<Product>> getProductList();
}