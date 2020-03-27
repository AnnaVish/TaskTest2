package pages.Auth;

import TestContext.TestContext;
import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pages.commonElementsForAllPages.UserData;
import pages.mailCatcher.MailCatcher;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class AuthPage extends Base {

    WebDriverWait wait = new WebDriverWait(driver, 20);
    Header headerPage = new Header();
    Footer footerPage = new Footer();
    MailCatcher mailCatcher = new MailCatcher();

    public static String login = "glushkova.es@unicom24.ru";
    public static String password = "usertest1";

    @FindBy(className = "ui-authorization-form")
    private WebElement authForm;

    @FindBy(xpath = "//div[contains(text(), 'Войти')]")
    private WebElement entranceLink;

    @FindBy(xpath = "//div[contains(text(), 'Регистрация')]")
    private WebElement registrationTab;

    @FindBy(xpath = "//input[@name='emanresu_htua']")
    private WebElement mailOrTelField;

    @FindBy(xpath = "//input[@name='drowssap_htua']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@name='drowssap_teser']")
    private WebElement newPasswordField;

    @FindBy(xpath = "//input[@name='wen_drowssap_teser']")
    private WebElement repeatNewPasswordField;

    @FindBy(xpath = "//button[@class='ui-btn font__base yellow']")
    private WebElement savePasswordButton;

    @FindBy(xpath = "//button[@class='ui-btn font__base yellow']")
    private WebElement entranceBtn;

    @FindBy(xpath = "//div[contains(text(), 'Зарегистрироваться')]")
    private WebElement registrationLink;

    @FindBy(xpath = "//div[contains(text(), 'Забыли пароль')]")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//div[contains(text(), 'Авторизация через портал Госуслуг')]")
    private WebElement authGosUslugiLink;

    /*
     * Форма восстановления пароля
     */
    @FindBy(xpath = "//div[contains(text(), 'Восстановление пароля')]")
    private WebElement resetPasswordTitle;

    @FindBy(xpath = "//span[contains(text(), 'E-mail или телефон')]")
    private WebElement emailOrPhoneAdvice;

    @FindBy(name = "emanresu_teser")
    private WebElement emailOrPhoneField;

    @FindBy(xpath = "//button[./span[contains(text(), 'Отправить')]]")
    private WebElement sendBtn;

    @FindBy(xpath = "//div[contains(text(), 'Зарегистрироваться')]")
    private WebElement registerLink;

    @FindBy(name = "nekot_teser")
    private WebElement passwordFromSmsField;
    /*
     * Форма восстановления пароля окончена
     */

    private final List<WebElement> elements;

    public AuthPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        elements = Arrays.asList(authForm, entranceLink, registrationTab, mailOrTelField, passwordField,
                entranceBtn, registrationLink, forgotPasswordLink, authGosUslugiLink);
    }

    public void authPageIsDisplayed() {
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(elements);
//        allElementsAreVisible(footerPage.getFooter());
    }

    public void loginFill() {
        typeIntoField(login, mailOrTelField);
    }

    public void passwordFill() {
        typeIntoField(password, passwordField);
    }

    public void entranceBtnClick() {
        entranceBtn.click();
    }

    public void forgetPasswordClick() {
        forgotPasswordLink.click();
    }

    public void resetPasswordFormIsDisplayed() {
        final List<WebElement> elements = Arrays.asList(resetPasswordTitle, emailOrPhoneAdvice, emailOrPhoneField,
                sendBtn, registerLink);
        allElementsAreVisible(elements);
    }

    public void typePhoneOfUnregisteredUser(String emailOrPhone) {
        clearField(emailOrPhoneField);
        typeIntoField(emailOrPhone, emailOrPhoneField);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        sendBtn.click();
        driver.findElement(By.xpath("//button[./span[contains(text(), 'Отправить')]]")).click();
    }

    public void messageIsDisplayed(String errorMessage) {
        String xPath = String.format("//span[contains(text(), '%s')]", errorMessage);
        WebElement element = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(By.cssSelector(".input_container .ui-input-label-block"), By.xpath(xPath)));
        waitForAjaxElementIsVisible(element);
    }

    public void notificationIsDisplayed(String notificationMessage) {
        waitForVisibility(By.xpath("//div[contains(text(),'Письмо с дальнейшими инструкциями успешно отправлено!')]"));
        String xPath = String.format("//div[contains(text(), '%s')]", notificationMessage);
        WebElement element = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(By.cssSelector(".ui-authorization-form__login"), By.xpath(xPath)));
        waitForAjaxElementIsVisible(element);
    }

    public Boolean hintIsDislayed(String hitn) {
        String xPath = String.format("//div[contains(text(), '%s')]", hitn);
        WebElement element = wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(By.cssSelector("div .ui-authorization-form-counter-block"), By.xpath(xPath)));
        return isElementVisible(element);
    }

    public Boolean seeBtnText(String textButton) {
        String xPath = String.format("//div[@class='ui-authorization-ui-button-container']/button[./span[contains(text(), '%s')]]", textButton);
        WebElement element = driver.findElement(By.xpath(xPath));
        TestContext.btn = element;
        return isElementVisible(element);
    }

    public void typeCodeFromFirstServerOrSecondServer(String btn) {
        openNewTab();
        switchToTheSecondTab();
        driver.get(PagesUrls.smsServerLink2().get("smsServer1"));
        waitForPageLoaded(PagesUrls.smsServerLink2().get("smsServer1"));
        TestContext.smsServerValueUrl = PagesUrls.smsServerLink2().get("smsServer1");
        try {
            getCodeFromFirstLink();
            switchToTheFirstTab();
            waitForVisibility(passwordFromSmsField);
            typeIntoField(TestContext.smsCode, passwordFromSmsField);
            TestContext.btn.click();
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.urlToBe(PagesUrls.mainPage + "/"));
        } catch (Exception e) {
            try {
                switchToTheSecondTab();
                refreshPage();
                getCodeFromFirstLink();
                switchToTheFirstTab();
                waitForVisibility(passwordFromSmsField);
                typeIntoField(TestContext.smsCode, passwordFromSmsField);
                TestContext.btn.click();
                WebDriverWait wait = new WebDriverWait(driver, 20);
                wait.until(ExpectedConditions.urlToBe(PagesUrls.mainPage + "/"));
            } catch (Exception ex) {
                switchToTheSecondTab();
                getCodeFromOtherLink();
                switchToTheFirstTab();
                waitForVisibility(passwordFromSmsField);
                typeIntoField(TestContext.smsCode, passwordFromSmsField);
                TestContext.btn.click();
                WebDriverWait wait = new WebDriverWait(driver, 20);
                wait.until(ExpectedConditions.urlToBe(PagesUrls.mainPage + "/"));
            }
        }
    }

    private void getCodeFromFirstLink() {
        WebElement element;
        String xPath1 = String.format("//tr[./td[contains(text(), '%s')]]/td[contains(text(), 'Пароль для входа в личный кабинет:')]", UserData.getFormatNumberPhoneForChangePassword());
        element = driver.findElement(By.xpath(xPath1));
        waitForVisibility(element);
        String smsCode = element.getText();
        smsCode = smsCode.replaceAll("[^0-9]", "");
        smsCode = smsCode.substring(0, smsCode.length() - 2);
        TestContext.smsCode = smsCode;
    }

    private void getCodeFromOtherLink() {
        WebElement element;
        if (TestContext.smsServerValueUrl.equals(PagesUrls.smsServerLink2().get("smsServer1"))) {
            driver.get(PagesUrls.smsServerLink2().get("smsServer2"));
            waitForPageLoaded(PagesUrls.smsServerLink2().get("smsServer2"));
        } else {
            driver.get(PagesUrls.smsServerLink2().get("smsServer1"));
            waitForPageLoaded(PagesUrls.smsServerLink2().get("smsServer1"));
        }
        String xPath = String.format("//tr[./td[contains(text(), '%s')]]/td[contains(text(), 'Пароль для входа в личный кабинет:')]", UserData.getFormatNumberPhoneForChangePassword());
        element = driver.findElement(By.xpath(xPath));
        waitForVisibility(element);
        String smsCode = element.getText();
        smsCode = smsCode.replaceAll("[^0-9]", "");
        smsCode = smsCode.substring(0, smsCode.length() - 2);
        TestContext.smsCode = smsCode;
    }

    public void changePasswordFromFirstServerOrSecondServer() throws InterruptedException {
        openNewTab();
        switchToTheSecondTab();
//        driver.get(PagesUrls.emailServerLink().get("emailServer1"));
//        waitForPageLoaded(PagesUrls.smsServerLink2().get("emailServer1"));
//        TestContext.smsServerValueUrl = PagesUrls.smsServerLink2().get("emailServer1");
        driver.get("http://develop-34.vuaro.ru:1080/");
        waitForPageLoaded("http://develop-34.vuaro.ru:1080/");
        TestContext.emailServerLink = "http://develop-34.vuaro.ru:1080/";
        mailCatcher.latestEmailByToAndSubjectClick();
    }

    public void enterNewPasswordAndSave() {
        switchToTheThirdTab();
        typeIntoField(UserData.newCorrectPassword, newPasswordField);
        typeIntoField(UserData.newCorrectPassword, repeatNewPasswordField);
        savePasswordButton.click();
        waitForVisibility(By.xpath("//div[contains(text(),'Оксана Олеговна Александрова')]"));
        System.out.println("кнопка Сохранить пароль нажата");
    }

    public void regClick() {
        waitForVisibility(registrationTab);
        registrationTab.click();
    }
}
