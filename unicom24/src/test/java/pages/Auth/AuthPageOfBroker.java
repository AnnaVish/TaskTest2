package pages.Auth;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public AuthPageOfBroker(){
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(authForm, registerTab, loginInput, passwordField, entranceLink, forgottenPasswordLink,
                registerLink);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(elements);
    }

}
