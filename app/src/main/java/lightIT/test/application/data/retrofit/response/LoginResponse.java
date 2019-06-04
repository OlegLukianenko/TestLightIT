package lightIT.test.application.data.retrofit.response;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {

    @SerializedName("success")
    public Boolean success;

    @SerializedName("token")
    public String token;

    @SerializedName("message")
    public String message;

    public LoginResponse() { }

}