package lightIT.test.application.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.text.TextUtils;

import javax.inject.Inject;

import lightIT.test.application.base.SingleLiveEvent;
import lightIT.test.application.data.repository.RepositoryApi;
import lightIT.test.application.data.retrofit.ResponseWrap;
import lightIT.test.application.data.retrofit.request.LoginRequest;
import lightIT.test.application.data.retrofit.response.LoginResponse;
import lightIT.test.application.utils.NetworkHelper;

public class LoginFragmentViewModel extends ViewModel {

    @Inject
    RepositoryApi repositoryApi;

    @Inject
    protected NetworkHelper networkHelper;

    @Inject
    LoginFragmentViewModel() {
        loginButtonClickable.setValue(true);
    }

    private MutableLiveData<ResponseWrap<LoginResponse>> loginResponse = new MutableLiveData<>();
    private MutableLiveData<Boolean> loginButtonClickable = new MutableLiveData<>();

    private SingleLiveEvent<Void> emptyUsernameFieldError = new SingleLiveEvent<>();
    private SingleLiveEvent<Void> emptyPasswordFieldError = new SingleLiveEvent<>();
    private SingleLiveEvent<Void> emptyLoginFieldsError = new SingleLiveEvent<>();
    private SingleLiveEvent<Void> invalidEmailAddressError = new SingleLiveEvent<>();
    private SingleLiveEvent<Void> internetConnectionError = new SingleLiveEvent<>();
    private SingleLiveEvent<Void> signUpEvent = new SingleLiveEvent<>();


    public void sendRequestForLogin(String login, String pass) {


        if (login.isEmpty() && pass.isEmpty()) {
            emptyLoginFieldsError.call();
            return;
        }

        if (login.isEmpty()) {
            emptyUsernameFieldError.call();
            return;
        }

        if (pass.isEmpty()) {
            emptyPasswordFieldError.call();
            return;
        }

        //if (isValidEmail(login)) {

        if (networkHelper.isNetworkAvailable()) {
            loginButtonClickable.setValue(false);
            repositoryApi.sendLoginRequest(new LoginRequest(login, pass), loginResponse);
        } else {
            internetConnectionError.call();
        }

        //} else
        //  invalidEmailAddressError.call();
    }

    public void signUp() {
        signUpEvent.call();
    }

    public LiveData<Boolean> getLoginButtonClickable() {
        return loginButtonClickable;
    }

    public LiveData<ResponseWrap<LoginResponse>> getLoginResponse() {
        return loginResponse;
    }

    public void setLoginButtonClickable() {
        this.loginButtonClickable.setValue(true);
    }

    public SingleLiveEvent<Void> observeSignUpEvent() {
        return signUpEvent;
    }

    public SingleLiveEvent<Void> observeInvalidEmailAddress() {
        return invalidEmailAddressError;
    }

    public SingleLiveEvent<Void> observeEmptyUsernameFieldError() {
        return emptyUsernameFieldError;
    }

    public SingleLiveEvent<Void> observeEmptyPasswordFieldError() {
        return emptyPasswordFieldError;
    }

    public SingleLiveEvent<Void> observeEmptyLoginFieldsError() {
        return emptyLoginFieldsError;
    }

    public SingleLiveEvent<Void> observeInternetConnectionError() {
        return internetConnectionError;
    }

    private boolean isValidEmail(CharSequence email) {
        if (TextUtils.isEmpty(email)) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
        }
    }

}
