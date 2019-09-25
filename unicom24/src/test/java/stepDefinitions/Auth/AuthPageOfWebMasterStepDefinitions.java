package stepDefinitions.Auth;

import base.Base;
import cucumber.api.java.ru.Тогда;
import pages.Auth.AuthPageOfWebMaster;

public class AuthPageOfWebMasterStepDefinitions extends Base {

    private final AuthPageOfWebMaster authPageOfWebMaster = new AuthPageOfWebMaster();

    @Тогда("страница авторизации Вебмастера отображается")
    public void authPageOfWebMasterIsDisplayed(){
        authPageOfWebMaster.pageIsDisplayed();
    }

    @Тогда("вебМастер авторизовывается")
    public void webMasterLogIn(){
        authPageOfWebMaster.logIn();
    }
}
