package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class AuthPage extends Base {

    String login = "glushkova.es@unicom24.ru";
    String password = "usertest1";

    @FindBy(className = "ui-authorization-form")
    private WebElement authForm;

    @FindBy(xpath = "//div[contains(text(), 'Войти')]")
    private WebElement entranceLink;

    @FindBy(xpath = "//div[contains(text(), 'Регистрация')]")
    private WebElement registrationTab;
    
    @FindBy(name = "emanresu_htua")
    private WebElement mailOrTelField;

    @FindBy(name = "drowssap_htua")
    private WebElement passwordField;

    @FindBy(className = "ui-authorization-ui-button-container")
    private WebElement entranceBtn;

    @FindBy(xpath = "//div[contains(text(), 'Зарегистрироваться')]")
    private WebElement registrationLink;

    @FindBy(xpath = "//div[contains(text(), 'Забыли пароль')]")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//div[contains(text(), 'Авторизация через портал Госуслуг')]")
    private WebElement authGosUslugiLink;

    private final List<WebElement>elements;

    public AuthPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(authForm, entranceLink, registrationTab, mailOrTelField, passwordField,
                entranceBtn, registrationLink, forgotPasswordLink, authGosUslugiLink);
    }

    public void authPageIsDisplayed() {
        allElementsAreVisible(elements);
    }

    public void loginFill(){
        typeIntoField(login, mailOrTelField);
    }

    public void passwordFill(){
        typeIntoField(password, passwordField);
    }

    public void entranceBtnClick(){
        entranceBtn.click();
    }
}
