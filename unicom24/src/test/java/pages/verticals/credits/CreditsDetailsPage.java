package pages.verticals.credits;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pages.verticals.common.CommonElements;

import java.util.Arrays;
import java.util.List;

public class CreditsDetailsPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();
    CommonElements commonElements = new CommonElements();

    @FindBy(xpath = "//div[contains(text(), 'Лицезния ЦБ')]")
    private WebElement licenseOfCB;

    @FindBy(xpath = "//span[contains(text(), 'Расчет кредита')]")
    private WebElement countCreditTitle;

    @FindBy(xpath = "//span[contains(text(), 'Какая сумма вам нужна')]")
    private WebElement howMuchMoneyYouNeed;

    @FindBy(xpath = "//div[./div[./span[contains(text(), 'Какая сумма вам нужна')]]]/div[2]/input")
    private WebElement howMuchYouNeedInput;

    @FindBy(xpath = "//span[contains(text(), 'На какой срок')]")
    private WebElement howMuchTimeYouNeed;

    @FindBy(xpath = "//div[./div[./span[contains(text(), 'На какой срок')]]]/div[2]/input")
    private WebElement howMuchTimeInput;

    @FindBy(xpath = "//div[@class='rate']/div[contains(text(), 'Ставка')]")
    private WebElement percent;

    @FindBy(xpath = "//div[contains(text(), 'Ежемесячный платеж')]")
    private WebElement paymentPerMonth;

    @FindBy(xpath = "//button[./span[contains(text(), 'Получить кредит')]]")
    private WebElement getCreditBtn;

    @FindBy(xpath = "//a[contains(text(), 'График платежей')]")
    private WebElement schedualOfPayment;

    @FindBy(xpath = "//a[contains(text(), 'Частным клиентам')]")
    private WebElement privateClientsBread;

    @FindBy(xpath = "//li/span[contains(text(), 'Кредиты')]")
    private WebElement privateClientsCreditsBread;

    public final List<WebElement> elements;
    public final List<WebElement> header;
    private final List<WebElement> footer;

    public CreditsDetailsPage(){
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        PageFactory.initElements(driver, commonElements);
        elements = Arrays.asList(commonElements.bankBlock, commonElements.headerOfBank, commonElements.rating,
                countCreditTitle, licenseOfCB, howMuchMoneyYouNeed,
                howMuchYouNeedInput, howMuchTimeYouNeed, howMuchTimeInput, percent, paymentPerMonth, getCreditBtn,
                schedualOfPayment, commonElements.offersTab, commonElements.conditionsTab, commonElements.documentsTab,
                commonElements.commentsTab, commonElements.aboutOrgTab, commonElements.bet, commonElements.sum,
                commonElements.time, commonElements.age, commonElements.beforeApproved, privateClientsBread,
                privateClientsCreditsBread);
        header = Arrays.asList(headerPage.logoLink, headerPage.privateCustomersLink, headerPage.forBusinessLink,
                headerPage.othersLink, headerPage.servicesLink,
                headerPage.creditsHeaderLink, headerPage.creditCardsHeaderLink, headerPage.autoCreditsHeaderLink,
                headerPage.ipotekaHeaderLink, headerPage.refinanceHeaderLink);
        footer = Arrays.asList(footerPage.footerContainer, footerPage.footerLeftSide, footerPage.appleAndGoogle,
                footerPage.footerSeoText, footerPage.becomePartnerLink, footerPage.becomeAgentLink, footerPage.cabinetOfBroker,
                footerPage.cabinetOfBank, footerPage.cabinetOfWebmaster, footerPage.oldCabinetOfBroker,
                footerPage.copyright, footerPage.copyrightText, footerPage.becomeAgentDown, footerPage.becomePartnerDown,
                footerPage.personalData, footerPage.mail, footerPage.map, footerPage.adress);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(elements);
        allElementsAreVisible(header);
        allElementsAreVisible(footer);
        Assert.assertEquals(3, driver.findElements(By.cssSelector("ul.ui-breadcrumbs-list  li")).size());
    }
}
