package stepDefinitions.Auth;

import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import pages.Auth.AuthPage;
import pages.commonElementsForAllPages.UserData;

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

    @Тогда("^пользователь нажимает: забыли пароль$")
    public void userClickForgetPassword() {
        authPage.forgetPasswordClick();
    }

    @Тогда("^открывается форма восстановления пароля$")
    public void resetPasswordFormIsDisplayed() {
        authPage.resetPasswordFormIsDisplayed();
    }

    @Тогда("^пользователь вводит номер несуществующего пользователя и нажимает Отправить$")
    public void userTypePhoneOfUnregisteredUser() {
        authPage.typePhoneOfUnregisteredUser(UserData.unRegisteredUserPhone);
    }

    @Тогда("^пользователь вводит почту несуществующего пользователя и нажимает Отправить$")
    public void userTypeUnregisteredMail() {
        authPage.typePhoneOfUnregisteredUser(UserData.unregisteredEmail);
    }

    @Тогда("отображается ошибка \"([^\"]*)\"")
    public void errorIsDisplayed(String errorMessage) {
        authPage.messageIsDisplayed(errorMessage);
    }

    @Тогда("^пользователь вводит неккоректный номер и нажимает отправить$")
    public void userTypeIncorrectPhoneOfUnregisteredUser() {
        authPage.typePhoneOfUnregisteredUser(UserData.incorrectPhoneNumber);
    }

    @Тогда("^пользователь вводит неккоректный мэил и нажимает отправить$")
    public void userTypeIncorrectEmail() {
        authPage.typePhoneOfUnregisteredUser(UserData.incorrectMail);
    }

    @Тогда("^пользователь вводит телефон зарегистрированного пользователя, нажать \"Отправить\"$")
    public void userTypeCorrectPhoneOfUnregisteredUser() {
        authPage.typePhoneOfUnregisteredUser(UserData.phoneForChangePassword);
    }

    @Тогда("^пользователь вводит email зарегистрированного пользователя, нажать Отправить$")
    public void userTypeCorrectEmail() {
        authPage.typePhoneOfUnregisteredUser(UserData.correctEmail);
    }

    @Тогда("^в окне восстановления пароля выводится текст \"([^\"]*)\"$")
    public void messageAboutResetPassEmailIsDisplayed(String message) {
        Assert.assertTrue(authPage.messageAboutEmailIsDisplayed(message));
    }

    @Тогда("^в поле ввода появится подсказка \"([^\"]*)\"$")
    public void hintIsDisplayed(String hint) {
        authPage.messageIsDisplayed(hint);
    }

    @Тогда("^под полем ввода ссылка \"([^\"]*)\"$")
    public void linkIsDisplayed(String hint) {
        authPage.hintIsDislayed(hint);
    }

    @Тогда("^название кнопки изменится на \"([^\"]*)\"$")
    public void changeBtnText(String textButton) {
        authPage.seeBtnText(textButton);
    }

    @Тогда("^пользователь вводит пароль из смс и нажимает на \"([^\"]*)\"$")
    public void typePasswordAndClickBtn(String btn) {
        authPage.typeCodeFromFirstServerOrSecondServer(btn);
    }
}
