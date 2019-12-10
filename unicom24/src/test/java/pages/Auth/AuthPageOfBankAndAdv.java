package pages.Auth;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class AuthPageOfBankAndAdv extends Base {

    @FindBy(css = "div.auth-layout-form")
    private WebElement authForm;

    @FindBy(id = "email")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Войти')]")
    private WebElement entranceLink;

    @FindBy(xpath = "//label[contains(text(), 'Запомнить меня')]")
    private WebElement rememberMeTitle;

    @FindBy(xpath = "//a[contains(text(), 'Забыли пароль')]")
    private WebElement forgottenPasswordLink;

    private final List<WebElement> elements;

    public AuthPageOfBankAndAdv(){
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(authForm, passwordField, entranceLink, rememberMeTitle, forgottenPasswordLink);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(elements);
    }

    public void advAuth(){
        typeIntoField(AuthPage.login, loginField);
        typeIntoField(AuthPage.password, passwordField);
        entranceLink.click();
    }

}
