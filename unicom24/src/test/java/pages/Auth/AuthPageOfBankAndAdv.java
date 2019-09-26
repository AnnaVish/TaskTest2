package pages.Auth;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class AuthPageOfBankAndAdv extends Base {

    @FindBy(css = ".ui-authorization-form.ui-authorization-form-flex")
    private WebElement authForm;

    @FindBy(name = "emanresu_htua")
    private WebElement loginField;

    @FindBy(name = "drowssap_htua")
    private WebElement passwordField;

    @FindBy(xpath = "//button[./span[contains(text(), 'Войти')]]")
    private WebElement entranceLink;

    @FindBy(css = ".ui-checkbox-overlay")
    private WebElement remeberMeCheckBox;

    @FindBy(xpath = "//span[contains(text(), 'Запомнить меня')]")
    private WebElement rememberMeTitle;

    @FindBy(xpath = "//div[contains(text(), 'Забыли пароль')]")
    private WebElement forgottenPasswordLink;

    @FindBy(xpath = "//div[contains(text(), 'Авторизация через портал Госуслуг')]")
    private WebElement autESIA;

    @FindBy(css = ".ui-authorization-form-social")
    private WebElement socialBlock;

    private final List<WebElement> elements;

    public AuthPageOfBankAndAdv(){
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(authForm, passwordField, entranceLink, remeberMeCheckBox, rememberMeTitle,
                forgottenPasswordLink, autESIA, socialBlock);
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
