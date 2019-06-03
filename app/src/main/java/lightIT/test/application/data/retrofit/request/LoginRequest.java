package lightIT.test.application.data.retrofit.request;

public class LoginRequest {

    private String username;
    private String password;


    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
