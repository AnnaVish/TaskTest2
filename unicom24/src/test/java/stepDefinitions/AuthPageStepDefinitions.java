package stepDefinitions;

import cucumber.api.java.ru.Тогда;
import pages.AuthPage;

public class AuthPageStepDefinitions {

    private final AuthPage authPage = new AuthPage();

    @Тогда("^отображается страница авторизации$")
    public void authPageIsDisplayed() {
        authPage.authPageIsDisplayed();
    }

    @Тогда("^пользователь авторизовывается$")
    public void userLogIn(){
        authPage.loginFill();
        authPage.passwordFill();
        authPage.entranceBtnClick();
    }
}
