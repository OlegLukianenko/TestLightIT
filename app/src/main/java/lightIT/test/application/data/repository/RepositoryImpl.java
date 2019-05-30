package lightIT.test.application.data.repository;

import android.text.TextUtils;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.ResponseBody;
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
