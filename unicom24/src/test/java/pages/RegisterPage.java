package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;


public class RegisterPage extends TestBase {

    private String organisationName = "АвтоПартнер";
    private String lastName = "Автопартнер";
    private String name = "Автопартнер";
    private String telegram = "123";
    private String phone = "9212102100";
    private String takenEmail = "glushkova.es@unicom24.ru";
    private String correctEmail = "autopart@tt.tt";
    private String password = "usertest";
    private String weakPassword = "user";
    private String correctPassword = "usertest";


    @FindBy(name = "company_name")
    private WebElement companyNameField;

    @FindBy(name = "last_name")
    private WebElement lastNameField;

    @FindBy(name = "first_name")
    private WebElement firstNameField;

    @FindBy(className = "ui-select-top-block__arrow")
    private WebElement chooseMessangerBtn;

    @FindBy(xpath = "//li[contains(text(), 'Telegram')]")
    private WebElement telegramChooseBtn;

    @FindBy(name = "messenger")
    private WebElement messangerField;

    @FindBy(name = "partner_phone")
    private WebElement partnerPhoneField;

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "password2")
    private WebElement password2Field;

    @FindBy(xpath = "//div[contains(text(), 'Данный адрес электронной почты уже зарегистрирован')]")
    private WebElement errorMessage;

    public final List<WebElement> elements;

    public RegisterPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(companyNameField, lastNameField, firstNameField,
                chooseMessangerBtn, partnerPhoneField, emailField, passwordField, password2Field);
    }

    public void registerPageIsDisplayed() {
        allElementsAreVisible(elements);
    }

    public static void onRegistrationPage() {
        TestBase.onRegistrationPage();
    }

    public void fillFildsWithTakenEmail() {
        typeIntoField(organisationName, companyNameField);
        typeIntoField(lastName, lastNameField);
        typeIntoField(name, firstNameField);
        chooseMessangerBtn.click();
        waitForVisibility(telegramChooseBtn);
        telegramChooseBtn.click();
        waitForInvisibility(telegramChooseBtn);
        typeIntoField(telegram, messangerField);
        typeIntoField(phone, partnerPhoneField);
        typeIntoField(takenEmail, emailField);
        typeIntoField(password, passwordField);
        typeIntoField(password, password2Field);
    }

    public void seeErorMessage() {
        waitForVisibility(errorMessage);
    }

}
