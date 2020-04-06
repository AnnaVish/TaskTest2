package pages.auth;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class AuthPageOfWebMaster extends Base {

    @FindBy(id = "email")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Войти')]")
    private WebElement entranceLink;

    @FindBy(xpath = "//a[contains(text(), 'Регистрация')]")
    private WebElement registerPageLink;

    @FindBy(xpath = "//a[contains(text(), 'Забыли пароль')]")
    private WebElement forgottenPasswordLink;

    @FindBy(xpath = "//label[contains(text(), 'Запомнить меня')]")
    private WebElement rememberMe;

    private final List<WebElement> elements;

    public AuthPageOfWebMaster(){
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(loginField, passwordField, entranceLink, registerPageLink, forgottenPasswordLink,
                rememberMe);
    }

    public void onAuthPage(){
        driver.get(PagesUrls.webMasterAuth());
    }

    public void pageIsDisplayed(){
        waitForPageLoaded(PagesUrls.webMasterAuth());
        allElementsAreVisible(elements);
    }

    public void logIn(){
        typeIntoField(AuthPage.login, loginField);
        typeIntoField(AuthPage.password, passwordField);
        entranceLink.click();
    }
}
