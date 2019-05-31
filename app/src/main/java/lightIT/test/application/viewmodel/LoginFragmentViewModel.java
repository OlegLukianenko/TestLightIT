package lightIT.test.application.viewmodel;

import android.arch.lifecycle.ViewModel;

import javax.inject.Inject;

import lightIT.test.application.data.repository.RepositoryApi;

public class LoginFragmentViewModel extends ViewModel {

    @Inject
    RepositoryApi repositoryApi;

    @Inject
    public LoginFragmentViewModel() {
    }

}
