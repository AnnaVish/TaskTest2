package pages.PartnerCabinetPage.postbackTab;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Header.HeaderPartnerCabinetPage;
import pages.PartnerCabinetPage.RequestBinPage;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PostbackTabPage extends Base {

    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();
    private final RequestBinPage requestBinPage = new RequestBinPage();

    /*
    * Тестовые данные
     */
    private String offerId = "OfferIdTest";
    private String offerName = "OfferNameTest";
    private String clickId = "ClickIdTest";

    private String offerIdValue = "22547";
    private String offerNameValue = "TestName";
    private String clickIdValue = "888";
    /*
     * Тестовые данные окончены
     */

    @FindBy(xpath = "//div[contains(text(), 'Постбек')]")
    private WebElement postBackTitle;

    @FindBy(css = ".ui-postback-table-self")
    private WebElement postbackTable;

    @FindBy(xpath = "//div[contains(text(), 'Создать')]")
    private WebElement createPostBackBtn;

    @FindBy(css = ".ui-postback-form")
    private WebElement uiPostBackForm;

    @FindBy(xpath = "//div[@class='ui-postback-form-name']/input")
    private WebElement nameOfPostbackInput;

    @FindBy(xpath = "//div[contains(text(), 'Post')]")
    private WebElement typePostBtn;

    @FindBy(xpath = "//div[contains(text(), 'Get')]")
    private WebElement typeGetBtn;

    @FindBy(xpath = "//label[contains(text(), 'В работе')]")
    private WebElement inProgressCheck;

    @FindBy(xpath = "//label[contains(text(), 'Подтвержден')]")
    private WebElement approvedCheck;

    @FindBy(xpath = "//label[contains(text(), 'Отклонен')]")
    private WebElement deniedCheck;

    @FindBy(xpath = "//label[contains(text(), 'Выдача')]")
    private WebElement extraditionCheck;

    @FindBy(xpath = "//label[contains(text(), 'Заявка')]")
    private WebElement issueCheck;

    @FindBy(xpath = "//label[contains(text(), 'Одобрение')]")
    private WebElement approvalCheck;

    @FindBy(xpath = "//label[contains(text(), 'Повторная выдача')]")
    private WebElement secondExtradition;

    @FindBy(xpath = "//label[contains(text(), 'переход')]")
    private WebElement transitionCheck;

    @FindBy(xpath = "//div[./div[contains(text(), 'Базовая ссылка')]]/input")
    private WebElement baseUrlInput;

    @FindBy(xpath = "//div[contains(@class, 'ui-postback-form ng-scope')]/div[10]/div/input[@type='text'][1]")
    private WebElement offerIdNameOfParametrInput;

    @FindBy(xpath = "//div[contains(@class, 'ui-postback-form ng-scope')]/div[10]/div/input[@type='text'][2]")
    private WebElement offerIdValueOfParametrInput;

    @FindBy(xpath = "//div[contains(@class, 'ui-postback-form ng-scope')]/div[11]/div/input[@type='text'][1]")
    private WebElement offerNameNameOfParametrInput;

    @FindBy(xpath = "//div[contains(@class, 'ui-postback-form ng-scope')]/div[11]/div/input[@type='text'][2]")
    private WebElement offerNameValueOfParametrInput;

    @FindBy(xpath = "//div[contains(@class, 'ui-postback-form ng-scope')]/div[12]/div/input[@type='text'][1]")
    private WebElement clickIdNameOfParametrInput;

    @FindBy(xpath = "//div[contains(@class, 'ui-postback-form ng-scope')]/div[12]/div/input[@type='text'][2]")
    private WebElement clickIdValueOfParametrInput;

    @FindBy(css = "textarea.ui-landings-ticket-connection-ui-textarea-target")
    private WebElement mainTextArea;

    @FindBy(css = ".ui-report-table-tooltip-display img")
    private WebElement copyBtn;

    private final List<WebElement> headerPartnerCabinetPage;
    private final List<WebElement>elements;

    public PostbackTabPage(){
        PageFactory.initElements(driver, header);
        PageFactory.initElements(driver, this);
        headerPartnerCabinetPage = Arrays.asList(header.headerContainer, header.logo, header.logoTitle, header.balance,
                header.getMoney, header.patentialMoney, header.moneyOfAllTime, header.getMoneyForAllTime,
                header.logOutBtn, header.ringBtn, header.statisticLinck, header.offersLink, header.lendingsLink,
                header.productsLink, header.postBacksLick, header.helpLink, header.settingsLink,
                header.staticticImg, header.statisticTitle);
        elements = Arrays.asList(postBackTitle, postbackTable, createPostBackBtn, uiPostBackForm, nameOfPostbackInput,
                typePostBtn, typeGetBtn, inProgressCheck, approvedCheck, deniedCheck, extraditionCheck, issueCheck,
                approvalCheck, secondExtradition, transitionCheck, baseUrlInput, offerIdNameOfParametrInput,
                offerIdValueOfParametrInput, offerNameNameOfParametrInput, offerNameValueOfParametrInput,
                clickIdNameOfParametrInput, clickIdValueOfParametrInput, mainTextArea, copyBtn);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(headerPartnerCabinetPage);
        allElementsAreVisible(elements);
    }



    public void fillFields() throws IOException, UnsupportedFlavorException {
        String baseUrl = requestBinPage.getRequestBinUrl();
        switchToTheFirstTab();
        typeIntoField(offerId, offerIdNameOfParametrInput);
        typeIntoField(offerIdValue, offerIdValueOfParametrInput);
        typeIntoField(offerName, offerNameNameOfParametrInput);
        typeIntoField(offerNameValue, offerNameValueOfParametrInput);
        typeIntoField(clickId, clickIdNameOfParametrInput);
        typeIntoField(clickIdValue, clickIdValueOfParametrInput);
        typeIntoField(baseUrl, baseUrlInput);
        copyBtn.click();
        String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        driver.get(myText);
    }

    public void checkIsPostbackDone(){
        switchToTheSecondTab();
        refreshPage();
        String xpathClickID = String.format("//p[./strong[contains(text(), '%s')]][contains(text(), '%s')]", this.clickId, this.clickIdValue);
        waitForVisibility(driver.findElement(By.xpath(xpathClickID)));
        String xpathName = String.format("//p[./strong[contains(text(), '%s')]][contains(text(), '%s')]", this.offerName, this.offerNameValue);
        waitForVisibility(driver.findElement(By.xpath(xpathName)));
        String xpathId = String.format("//p[./strong[contains(text(), '%s')]][contains(text(), '%s')]", this.offerId, this.offerIdValue);
        waitForVisibility(driver.findElement(By.xpath(xpathId)));
    }


}
