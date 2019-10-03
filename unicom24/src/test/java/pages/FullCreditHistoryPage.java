package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;

import java.util.Arrays;
import java.util.List;

public class FullCreditHistoryPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();

    @FindBy(css = ".row .ui-credit-report-header__price-round")
    private WebElement prive;

    @FindBy(xpath = "//button[./span[contains(text(), 'Получить отчет')]]")
    private WebElement getReport;

    @FindBy(xpath = "//h1[contains(text(), 'Полная кредитная история')]")
    private WebElement pageTitle;

    @FindBy(xpath = "//div[contains(text(), 'История запросов на кредитный отчет')]")
    private WebElement historyTitle;

    @FindBy(css = ".ui-credit-report-history-credit .ui-form-requests-history-credit_report__data-wrapper")
    private WebElement history;

    @FindBy(css = ".ui-report-default-content-block .ui-main-loader__container ")
    private WebElement reportImg;

    @FindBy(css = "a .ui-btn.font__base.yellow")
    private WebElement downLoadReportBtn;

    @FindBy(xpath = "//span[contains(text(), 'Новый запрос')]")
    private WebElement newReportCreate;

    public final List<WebElement> elements;
    public final List<WebElement> header;
    private final List<WebElement> footer;



    public FullCreditHistoryPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        elements = Arrays.asList(getReport, pageTitle, historyTitle, history);
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
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
        allElementsAreVisible(footer);
    }

    public void getReportClick(){
        getReport.click();
    }

    public void seeReportResult(){
        waitForVisibility(reportImg);
        waitForVisibility(downLoadReportBtn);
        waitForVisibility(newReportCreate);
    }

    public void downloadReport(){
        downLoadReportBtn.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
