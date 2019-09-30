package pages.verticals.autoCredits;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pages.verticals.common.CommonElements;

import java.util.Arrays;
import java.util.List;

public class AutoCreditsDetailedPage extends Base {

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

    public final List<WebElement> elements;
    public final List<WebElement> header;
    private final List<WebElement> footer;

    public AutoCreditsDetailedPage(){
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        PageFactory.initElements(driver, commonElements);
        elements = Arrays.asList(commonElements.bankBlock, commonElements.headerOfBank, commonElements.rating,
                countCreditTitle, licenseOfCB, howMuchMoneyYouNeed,
                howMuchYouNeedInput, howMuchTimeYouNeed, howMuchTimeInput, percent, paymentPerMonth, getCreditBtn,
                schedualOfPayment, commonElements.offersTab, commonElements.conditionsTab, commonElements.documentsTab,
                commonElements.commentsTab, commonElements.aboutOrgTab, commonElements.bet, commonElements.sum,
                commonElements.time, commonElements.age, commonElements.beforeApproved);
        header = Arrays.asList(headerPage.logoLink, headerPage.privateCustomersLink, headerPage.forBusinessLink,
                headerPage.othersLink, headerPage.servicesLink,
                headerPage.creditsHeaderLink, headerPage.creditCardsHeaderLink, headerPage.autoCreditsHeaderLink,
                headerPage.ipotekaHeaderLink, headerPage.refinanceHeaderLink);
        footer = Arrays.asList(footerPage.footerContainer, footerPage.footerLeftSide, footerPage.appleAndGoogle,
                footerPage.footerSeoText, footerPage.becomePartnerLink, footerPage.becomeAgentLink, footerPage.cabinetOfBroker,
                footerPage.cabinetOfBank, footerPage.cabinetOfWebmaster, footerPage.oldCabinetOfBroker);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
        allElementsAreVisible(footer);
    }
}
