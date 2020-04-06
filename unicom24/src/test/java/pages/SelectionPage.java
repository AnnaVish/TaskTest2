/*
Данная страница не является уникальной.
На момент написания существует для кредитов, микрозаймов и ипотеки (автокредитов нет, другие не проверял)
Везде отличается несколькими словами (так ак это страница - форма)
Поэтому страница прописывается унифицированно
 */
package pages;

import TestContext.TestContext;
import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pages.commonElementsForAllPages.UserData;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class SelectionPage extends Base {
    Header headerPage = new Header();
    Footer footerPage = new Footer();

    @FindBy(xpath = "//h1[contains(text(), 'Персональный подбор')]")
    private WebElement selectionTitle;

    @FindBy(xpath = "//div[@class='form-offers-small-step-one']")
    private WebElement selectionForm;

    @FindBy(xpath = "//button[contains(text(), 'Подобрать')]")
    private WebElement selectionBTN;

    @FindBy(xpath = "//div[@class='ui-selection-step']")
    public WebElement selectionPreload;

    @FindBy(xpath = "//div[@class='ui-input-new']/input")
    private List<WebElement> selectionInputsForm;

    @FindBy(xpath = "//label[./div[contains(text(), 'Код из СМС')]]//input")
    private WebElement fieldForCodeFromSMS;

    @FindBy(xpath = "//button[contains(text(), 'Далее')]")
    private WebElement selectionNextBTN;

    private final List<WebElement>elements;

    public SelectionPage(){
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, footerPage);
        elements = Arrays.asList(selectionTitle, selectionForm, selectionBTN);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(elements);
        allElementsAreVisible(footerPage.getFooter());
        Assert.assertTrue(selectionInputsForm.size()==7);
    }

    public void selectionBTNClick(){
        selectionBTN.click();
    }

    public void onSelectionPage(){
        driver.get(PagesUrls.personalSelectionCreditPage());
    }

    public void selectionPreloadIsDisplayed(){
        waitForAjaxElementIsVisible(selectionPreload);
    }

    public void userDataTypeToInputs(){
        typeIntoField(UserData.names, selectionInputsForm.get(0));
        typeIntoField(UserData.names, selectionInputsForm.get(1));
        typeIntoField(UserData.names, selectionInputsForm.get(2));
        typeIntoField(UserData.birthDay, selectionInputsForm.get(3));
        typeIntoField(UserData.passportNumber, selectionInputsForm.get(4));
        typeIntoField(UserData.dateOfPasport, selectionInputsForm.get(5));
        selectionInputsForm.get(6).clear();
        typeIntoField(UserData.correctPhoneNumber, selectionInputsForm.get(6));
    }

    public void selectionNextBTNClick(){
        selectionNextBTN.click();
    }

    public void formForSMSCodeIsDisplayed(){
        waitForAjaxElementIsVisible(selectionNextBTN);
    }

    public void InputSMSCodeForSelection() {
        try {
            openNewTab();
            switchToTheSecondTab();
            for (int i = 0; i < 4; i++) {
                if (TestContext.passwordFromSms == null) {
                    try {
                        getPasswordSMSFromServer(PagesUrls.smsServerLink2().get("smsServer1"));
                    } catch (Exception e) {
                        getPasswordSMSFromServer(PagesUrls.smsServerLink2().get("smsServer2"));
                    }
                } else break;
            }
            driver.close();
            switchToTheFirstTab();
            clearField(fieldForCodeFromSMS);
            //typeIntoField(TestContext.passwordFromSms, passwordField); иногда теряет 1 символ
            // Повторение не ведомой хрени, заставляем селениум писать в поле ящик до тех пор пока не напишет правильно
            while (!fieldForCodeFromSMS.getAttribute("value").equals(TestContext.passwordFromSms)) {
                clearField(fieldForCodeFromSMS);
                typeIntoField(TestContext.passwordFromSms, fieldForCodeFromSMS);
            }
            selectionNextBTNClick();
            //waitForUrlContains(PagesUrls.baseUrl() + "/");
        }
        catch (Exception e) {
            openNewTab();
            switchToTheSecondTab();
            getPasswordSMSFromServer(PagesUrls.smsServerLink2().get("smsServer2"));
            driver.close();
            switchToTheFirstTab();
            clearField(fieldForCodeFromSMS);
            //typeIntoField(TestContext.passwordFromSms, passwordField); иногда теряет 1 символ
            // Повторение не ведомой хрени, заставляем селениум писать в поле ящик до тех пор пока не напишет правильно
            while (!fieldForCodeFromSMS.getAttribute("value").equals(TestContext.passwordFromSms)) {
                clearField(fieldForCodeFromSMS);
                typeIntoField(TestContext.passwordFromSms, fieldForCodeFromSMS);
            }

            selectionNextBTNClick();
            //waitForUrlContains(PagesUrls.baseUrl() + "/");
        }
    }

    public void getPasswordSMSFromServer(String url) {
        driver.get(url);
        String xPath = String.format("//tr[./td[contains(text(), '%s')]]/td[contains(text(), 'Код')]", UserData.getFormatNumber());
        TestContext.passwordFromSms = driver.findElement(By.xpath(xPath)).getText();
        TestContext.passwordFromSms = TestContext.passwordFromSms.replaceAll("[^0-9]", "");
        TestContext.passwordFromSms = TestContext.passwordFromSms.substring(0, TestContext.passwordFromSms.length() - 2);
        TestContext.smsServerValueUrl = driver.getCurrentUrl();
    }

}
