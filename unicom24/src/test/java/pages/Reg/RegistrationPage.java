package pages.Reg;

import TestContext.TestContext;
import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.commonElementsForAllPages.UserData;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class RegistrationPage extends Base {

    Actions actions = new Actions(driver);

    @FindBy(className = "ui-authorization-form")
    private WebElement authForm;

    @FindBy(xpath = "//div[contains(text(), 'Войти')]")
    private WebElement entranceTab;

    @FindBy(xpath = "//div[contains(text(), 'Регистрация')]")
    private WebElement registrationTab;

    @FindBy(xpath = "//button[./span[contains(text(), 'Получить пароль')]]")
    private WebElement getPasswordBtn;

    @FindBy(name = "emanresu_ger")
    private WebElement telField;

    @FindBy(xpath = "//a[contains(text(), 'согласие на обработку персональных данных')]")
    private WebElement confirmData;

    @FindBy(xpath = "//a[contains(text(), 'договора оферты')]")
    private WebElement ofertaLink;

    @FindBy(name = "nekot_ger")
    private WebElement passwordField;

    @FindBy(xpath = "//div[@class='ui-authorization-ui-button-container']/button[./span[contains(text(), 'Войти')]]")
    private WebElement entranceBtn;


    private final List<WebElement> elements;

    public RegistrationPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(authForm, entranceTab, registrationTab, getPasswordBtn, telField, confirmData, ofertaLink);
    }

    public void pageIsDisplayed() {
        for (int i = 0; i < 5; i++) {
            try {
                allElementsAreVisible(elements);
                waitForUrlContains("/registration");
            } catch (StaleElementReferenceException e) {

            }
        }
    }

    public void typePhone() {
        TestContext.correctPhone = UserData.correctPhoneNumber;
        typeIntoField(TestContext.correctPhone, telField);
    }

    public void getPasswordClick() {
        getPasswordBtn.click();
    }

    public void typeIncorrectPassword() {
        openNewTab();
        switchToTheSecondTab();
        for (int i = 0; i < 4; i++) {
            if (TestContext.passrordFromSms == null) {
                try {
                    getPasswordFromServer(PagesUrls.smsServerLink2().get("smsServer1"));
                } catch (Exception e) {
                    getPasswordFromServer(PagesUrls.smsServerLink2().get("smsServer2"));
                }
            } else break;
        }
        driver.close();
        switchToTheFirstTab();
        int incorrectPasswordValue = Integer.parseInt(TestContext.passrordFromSms) + 1;
        String inccorectPassword = Integer.toString(incorrectPasswordValue);
        // Повторение неведомой хрени, заставляем селениум писать в поле ящик до тех пор пока не напишет правильно
        while (!passwordField.getAttribute("value").equals(inccorectPassword)) {
            clearField(passwordField);
            typeIntoField(inccorectPassword, passwordField);
        }
        //typeIntoField(inccorectPassword, passwordField); иногда теряет 1 символ
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        entranceBtnClick();
    }

    public void typeCorrectCode() {
        try {
            clearField(passwordField);
            //typeIntoField(TestContext.passrordFromSms, passwordField); иногда теряет 1 символ
            // Повторение не ведомой хрени, заставляем селениум писать в поле ящик до тех пор пока не напишет правильно
            while (!passwordField.getAttribute("value").equals(TestContext.passrordFromSms)) {
                clearField(passwordField);
                typeIntoField(TestContext.passrordFromSms, passwordField);
            }
            entranceBtnClick();
            waitForUrlContains(PagesUrls.baseUrl() + "/");
        } catch (Exception e) {
            openNewTab();
            switchToTheSecondTab();
            getPasswordFromServer(PagesUrls.smsServerLink2().get(TestContext.smsServerValueUrl));
            driver.close();
            switchToTheFirstTab();
            clearField(passwordField);
            //typeIntoField(TestContext.passrordFromSms, passwordField); иногда теряет 1 символ
            // Повторение не ведомой хрени, заставляем селениум писать в поле ящик до тех пор пока не напишет правильно
            while (!passwordField.getAttribute("value").equals(TestContext.passrordFromSms)) {
                clearField(passwordField);
                typeIntoField(TestContext.passrordFromSms, passwordField);
            }

            entranceBtnClick();
            waitForUrlContains(PagesUrls.baseUrl() + "/");
        }
    }

    public void entranceBtnClick() {
        waitForVisibility(entranceBtn);
        entranceBtn.click();
    }

    public void getPasswordFromServer(String url) {
        driver.get(url);
        String xPath = String.format("//tr[./td[contains(text(), '%s')]]/td[contains(text(), 'Пароль для входа в личный кабинет')]", UserData.getFormatNumber());
        TestContext.passrordFromSms = driver.findElement(By.xpath(xPath)).getText();
        TestContext.passrordFromSms = TestContext.passrordFromSms.replaceAll("[^0-9]", "");
        TestContext.passrordFromSms = TestContext.passrordFromSms.substring(0, TestContext.passrordFromSms.length() - 2);
        TestContext.smsServerValueUrl = driver.getCurrentUrl();
    }
}
