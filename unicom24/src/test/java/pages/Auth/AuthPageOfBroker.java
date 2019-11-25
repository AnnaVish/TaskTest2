package pages.Auth;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesUrls.PagesUrls;

import java.security.Key;
import java.util.Arrays;
import java.util.List;

public class AuthPageOfBroker extends Base {

    @FindBy(css = ".auth-container")
    private WebElement authForm;

    @FindBy(xpath = "//a[contains(text(), 'Регистрация')]")
    private WebElement registerTab;

    @FindBy(name = "username")
    private WebElement loginInput;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[./span[contains(text(), 'Войти')]]")
    private WebElement entranceLink;

    @FindBy(xpath = "//a[contains(text(), 'Забыли пароль')]")
    private WebElement forgottenPasswordLink;

    @FindBy(xpath = "//a[contains(text(), 'Зарегистрироваться')]")
    private WebElement registerLink;

    private final List<WebElement> elements;

    public AuthPageOfBroker() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(authForm, registerTab, loginInput, passwordField, entranceLink, forgottenPasswordLink,
                registerLink);
    }

    public void onPage() {
        driver.get(PagesUrls.brokerAuth());
        waitForPageLoaded(PagesUrls.brokerAuth());
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
    }

    public void brokerLogIn() {
        waitForVisibility(loginInput);
        waitForVisibility(passwordField);
        /*
         *Здесь происходит неведомая хрень - селениум путает буквы при вооде, строго на этой странице на сайте
         * пришлось обходить это циклом, что пока значение в поле не будет правильным, пиши заново
         */
        while (!loginInput.getAttribute("value").equals(AuthPage.login)) {
            for (int i = 0; i < 15; i++)
                loginInput.sendKeys(Keys.BACK_SPACE);
            typeIntoField(AuthPage.login, loginInput);
        }
        while (!passwordField.getAttribute("value").equals(AuthPage.password)) {
            for (int i = 0; i < 15; i++)
                passwordField.sendKeys(Keys.BACK_SPACE);
            typeIntoField(AuthPage.password, passwordField);
        }
        entranceLink.click();
    }

}
