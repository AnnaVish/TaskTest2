package stepDefinitions.auth;

import base.Base;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Тогда;
import pages.auth.AuthPageOfWebMaster;

public class AuthPageOfWebMasterStepDefinitions extends Base {

    private final AuthPageOfWebMaster authPageOfWebMaster = new AuthPageOfWebMaster();

    @Дано("пользователь нахоидится на странице авторизации Вебмастера")
    public void onAuthPageOfWebmaster(){
        authPageOfWebMaster.onAuthPage();
    }

    @Тогда("страница авторизации Вебмастера отображается")
    public void authPageOfWebMasterIsDisplayed(){
        authPageOfWebMaster.pageIsDisplayed();
    }

    @Тогда("вебМастер авторизовывается")
    public void webMasterLogIn(){
        authPageOfWebMaster.logIn();
    }
}
