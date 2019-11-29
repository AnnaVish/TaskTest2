package pages.verticals.microCredits;

import TestContext.TestContext;
import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pages.commonElementsForAllPages.UserData;
import pages.verticals.common.CommonElementsForAllVerticals;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class MicroCreditsPage extends Base {

    Actions actions = new Actions(driver);
    Header headerPage = new Header();
    Footer footerPage = new Footer();
    CommonElementsForAllVerticals common = new CommonElementsForAllVerticals();

    @FindBy(css = ".offers-list-row .offer-online")
    private WebElement getCreditBtn;

    @FindBy(css = ".form-offers-small .form-one")
    private WebElement formOffer;

    @FindBy(xpath = "//a[contains(text(), 'Частным клиентам')]")
    private WebElement privateClientsBread;

    @FindBy(xpath = "//li/span[contains(text(), 'Займы онлайн')]")
    private WebElement privateClientsMFOBread;

    /*
     * форма с отправленным смс
     */
    @FindBy(xpath = "//form[contains(@class, 'form-confirm')][./div[contains(text(), 'Вам было отправлено СМС сообщение с кодом подтверждения')]]")
    private WebElement formSms;

    @FindBy(xpath = "//div[@class='ui-input-new']/input[@placeholder=\"+7 (___)___-__-__\"]")
    private WebElement smsInputField;

    @FindBy(xpath = "//button[./span[contains(text(), 'Подтвердить')]]")
    private WebElement confirmBtn;

    @FindBy(xpath = "//a[contains(text(), 'Отправить код повторно')]")
    private WebElement askCodeAgainBtn;

    @FindBy(xpath = "//input[@placeholder=\"____\"]")
    private WebElement codeField;
    /*
     *форма с отправленным смс окончена
     */

    /*
     * форма с подтвержденным кодом из смс approvedSms
     */
    @FindBy(xpath = "//div[contains(text(), 'Укажите данные для определения вероятности выдачи')]")
    private WebElement approvedSmsTitile;

    @FindBy(xpath = "//label[./div[contains(text(), 'Фамилия')]]/div[2]/input")
    private WebElement approvedSmsTitileLatNameField;

    @FindBy(xpath = "//label[./div[contains(text(), 'Отчество')]]/div[2]/input")
    private WebElement approvedSmsMiddlenameField;

    @FindBy(xpath = "//label[./div[contains(text(), 'Серия и номер паспорта')]]/div[2]/input")
    private WebElement approvedSmsSerialNumberField;

    @FindBy(xpath = "//label[./div[contains(text(), 'Имя')]]/div[2]/input")
    private WebElement approvedSmsNameField;

    @FindBy(xpath = "//label[./div[contains(text(), 'Дата рождения')]]/div[2]/input")
    private WebElement approvedSmsBirthField;

    @FindBy(xpath = "//label[./div[contains(text(), 'Дата выдачи паспорта')]]/div[2]/input")
    private WebElement approvedSmsDateOfPasportField;

    @FindBy(xpath = "//button[./span[contains(text(), 'Далее')]]")
    private WebElement approvedSmsBtn;
    /*
     * форма с подтвержденным кодом из смс окончена
     */

    public final List<WebElement> elements;
    private final List<WebElement> personalOffer;


    public MicroCreditsPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        PageFactory.initElements(driver, common);
        elements = Arrays.asList(getCreditBtn, formOffer, common.logo, common.rating, common.title, common.payPerDay,
                common.time, common.neededRating, common.license, privateClientsBread, privateClientsMFOBread);
        headerPage.getMainHeader();
        footerPage.getFooter();
        personalOffer = Arrays.asList(common.personalOfferContainer, common.giftPic, common.personalOfferField,
                common.makeOfferBtn, common.ifYouText, common.agreeLink);
    }

    public void onMicroCreditsPage(){
        driver.get(PagesUrls.privateMicroCreditsPageUrl());
        TestContext.checkRedirectUrl = PagesUrls.privateMicroCreditsPageUrl();
    }

    public void pageIsDisplyed() {
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(elements);
        scrollTo(common.personalOfferContainer);
        allElementsAreVisible(personalOffer);
        allElementsAreVisible(footerPage.getFooter());
        Header.checkBreadCrumbs(3);
    }

    public Boolean offersOnPageMore10(){
        return driver.findElements(By.cssSelector(".offers-list-row .offer-item__wrapper")).size() > 10;
    }

    public void sendForm() {
        common.makeOfferBtn.click();
    }

    public Boolean seeErrorText() {
        try {
            WebElement element = driver.findElement(By.xpath("//div[contains(@class, 'input-error') and contains(text(), 'Поле обязательно для заполнения')]"));
            waitForVisibility(element);
        } catch (Exception ignored) {

        }
        return false;
    }

    public void typeIncorrectNumber() {
        typeIntoField(UserData.incorrectPhoneNumber, common.personalOfferField);
    }

    public void typeIncorrectCode() {
        openNewTab();
        switchToTheSecondTab();
        driver.get(PagesUrls.smsServerLink2().get("smsServer1"));
        TestContext.smsServerValueUrl = PagesUrls.smsServerLink2().get("smsServer1");
        waitForPageLoaded(PagesUrls.smsServerLink2().get("smsServer1"));
        String xPath = String.format("//tr[./td[contains(text(), '%s')]]/td[contains(text(), 'Код подтверждения')]", UserData.getFormatNumber());
        try {
            WebElement element = driver.findElement(By.xpath(xPath));
            waitForVisibility(element);
            getSmsText(element);
        } catch (Exception e) {
            driver.get(PagesUrls.smsServerLink2().get("smsServer2"));
            TestContext.smsServerValueUrl = PagesUrls.smsServerLink2().get("smsServer2");
            waitForPageLoaded(PagesUrls.smsServerLink2().get("smsServer2"));
            String xPath1 = String.format("//tr[./td[contains(text(), '%s')]]/td[contains(text(), 'Код подтверждения')]", UserData.getFormatNumber());
            WebElement element1 = driver.findElement(By.xpath(xPath1));
            getSmsText(element1);
        }

    }

    private void getSmsText(WebElement element) {
        String smsCode = element.getText();
        TestContext.smsText = smsCode;
        smsCode = smsCode.replaceAll("[^0-9]", "");
        smsCode = smsCode.substring(0, smsCode.length() - 2);
        TestContext.smsCode = smsCode;
        int smsCodeChangeToIncorrect = Integer.parseInt(smsCode) + 1;
        smsCode = Integer.toString(smsCodeChangeToIncorrect);
        switchToTheFirstTab();
        typeIntoField(smsCode, codeField);
        codeField.click();
        confirmBtn.click();
    }

    public void askCodeAgain() {
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        askCodeAgainBtn.click();
    }

    public void typePreviousCode() {
        for (int i = 0; i < 6; i++)
            actions.sendKeys(codeField, Keys.BACK_SPACE).perform();
        typeIntoField(TestContext.smsCode, codeField);
    }

    public void typeCorrectCode() {
        switchToTheSecondTab();
        refreshPage();
        tryGetNewCodeFromFirstServer();
        switchToTheFirstTab();
        for (int i = 0; i < 10; i++)
            actions.sendKeys(codeField, Keys.BACK_SPACE).perform();
        typeIntoField(TestContext.smsCode, codeField);
        confirmBtn.click();
    }

    private void tryGetNewCodeFromFirstServer() {
        WebElement element;
        try {
            String xPath2 = String.format("//tr[./td[contains(text(), '%s')]][2]/td[contains(text(), 'Код подтверждения')]", UserData.getFormatNumber());
            String xPath1 = String.format("//tr[./td[contains(text(), '%s')]]/td[contains(text(), 'Код подтверждения')]", UserData.getFormatNumber());
            WebElement element2 = driver.findElement(By.xpath(xPath2));
            waitForVisibility(element2);
            element = driver.findElement(By.xpath(xPath1));
            waitForVisibility(element);
            String smsCode = element.getText();
            smsCode = smsCode.replaceAll("[^0-9]", "");
            smsCode = smsCode.substring(0, smsCode.length() - 2);
            TestContext.smsCode = smsCode;
        } catch (Exception e) {
            if (TestContext.smsServerValueUrl.equals(PagesUrls.smsServerLink2().get("smsServer1"))) {
                driver.get(PagesUrls.smsServerLink2().get("smsServer2"));
            } else {
                driver.get(PagesUrls.smsServerLink2().get("smsServer1"));
            }
            String xPath = String.format("//tr[./td[contains(text(), '%s')]]/td[contains(text(), 'Код подтверждения')]", UserData.getFormatNumber());
            element = driver.findElement(By.xpath(xPath));
            waitForVisibility(element);
            String smsCode = element.getText();
            smsCode = smsCode.replaceAll("[^0-9]", "");
            smsCode = smsCode.substring(0, smsCode.length() - 2);
            TestContext.smsCode = smsCode;
        }
    }


    public void sendFormWithCorrectNumber() {
        typeIntoField(UserData.correctPhoneNumber, common.personalOfferField);
        sendForm();
    }

    public void smsHasBeenSent() {
        final List<WebElement> smsForm = Arrays.asList(formSms, confirmBtn);
        allElementsAreVisible(smsForm);
    }

    public void approvedSmsFormIsDisplayed() {
        final List<WebElement> approvedSmsForm = Arrays.asList(approvedSmsTitile, approvedSmsTitileLatNameField,
                approvedSmsMiddlenameField, approvedSmsSerialNumberField, approvedSmsNameField, approvedSmsBirthField,
                approvedSmsDateOfPasportField, approvedSmsBtn);
        allElementsAreVisible(approvedSmsForm);
    }
}
