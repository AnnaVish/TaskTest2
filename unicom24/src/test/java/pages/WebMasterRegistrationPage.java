package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class WebMasterRegistrationPage extends Base {

    @FindBy(xpath = "//div[contains(text(), 'Вход')]")
    private WebElement entanceTab;

    @FindBy(name = "company_name")
    private WebElement companyNameField;

    @FindBy(name = "partner_phone")
    private WebElement partnerPhoneField;

    @FindBy(name = "last_name")
    private WebElement lastNameField;

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "first_name")
    private WebElement nameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(css = ".ui-select-top-block__input")
    private WebElement messangerOptions;

    @FindBy(name = "password2")
    private WebElement repeatPassword;

    @FindBy(xpath = "//button[text()='Зарегистрироваться']")
    private WebElement registerBtn;

    private final List<WebElement> elements;

    public WebMasterRegistrationPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(entanceTab, companyNameField, partnerPhoneField, lastNameField, emailField,
                nameField, passwordField, messangerOptions, repeatPassword, registerBtn);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
    }

    public void entranceTabClick() {
        entanceTab.click();
    }
}
