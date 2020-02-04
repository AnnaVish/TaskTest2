package pages.Auth;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class AuthPageOfBroker extends Base {

    @FindBy(css = ".login-partners-inner")
    private WebElement form;

    @FindBy(xpath = "//div[@class= 'login-partners-inner-log-block']/div/input[@name='email']")
    private WebElement loginField;

    @FindBy(xpath = "//div[@class= 'login-partners-inner-log-block']/div/input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Войти')]")
    private WebElement entranceLink;

    @FindBy(xpath = "//div[@class='login-partners-inner-additional-block']/div[contains(text(), 'Зарегистрироваться')]")
    private WebElement registerPageLink;

    @FindBy(xpath = "//div[@class='login-partners-inner-additional-block']/div[contains(text(), 'Забыли пароль')]")
    private WebElement forgottenPasswordLink;

    @FindBy(xpath = "//div[@class='login-partners-inner']/div/div[contains(text(), 'Регистрация')]")
    private WebElement registrationPageOfLink;

    private final List<WebElement> elements;

    public AuthPageOfBroker() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(form, registrationPageOfLink, loginField, passwordField, entranceLink, forgottenPasswordLink,
                registrationPageOfLink);
    }

    public void onPage() {
        driver.get(PagesUrls.brokerAuth());
        waitForPageLoaded(PagesUrls.brokerAuth());
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
    }

    public void brokerLogIn() {
        waitForVisibility(loginField);
        waitForVisibility(passwordField);
        /*
         *Здесь происходит неведомая хрень - селениум путает буквы при вооде, строго на этой странице на сайте
         * пришлось обходить это циклом, что пока значение в поле не будет правильным, пиши заново
         */
        while (!loginField.getAttribute("value").equals(AuthPage.login)) {
            clearField(loginField);
            typeIntoField(AuthPage.login, loginField);
        }
        while (!passwordField.getAttribute("value").equals(AuthPage.password)) {
            clearField(passwordField);
            typeIntoField(AuthPage.password, passwordField);
        }
        entranceLink.click();
    }

}
