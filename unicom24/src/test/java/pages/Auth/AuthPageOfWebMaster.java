package pages.Auth;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class AuthPageOfWebMaster extends Base {

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
    private WebElement registrationPageOfWebmasterLink;

    private final List<WebElement> elements;

    public AuthPageOfWebMaster(){
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(form, loginField, passwordField, entranceLink, registerPageLink, forgottenPasswordLink,
                registrationPageOfWebmasterLink);
    }

    public void onAuthPage(){
        driver.get(PagesUrls.webMasterAuth());
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(elements);
    }

    public void logIn(){
        typeIntoField(AuthPage.login, loginField);
        typeIntoField(AuthPage.password, passwordField);
        entranceLink.click();
    }
}
