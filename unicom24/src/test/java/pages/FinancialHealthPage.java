package pages;

import TestContext.TestContext;
import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class FinancialHealthPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();

    @FindBy(xpath = "//button[./span[contains(text(), 'Получить отчет')]]")
    private WebElement getReport;

    @FindBy(xpath = "//h1[@class='font__h1']")
    private WebElement pageTitle;

    //@FindBy(xpath = "//div[contains(text(), 'История запросов на рейтинг финансового здоровья')]")
    //private WebElement historyTitle;

    //@FindBy(css = ".ui-auto-requests-history .ui-form-requests-history-credit_report__data-wrapper")
    //private WebElement history;

    @FindBy(css = ".ui-report-default-content-block .ui-report-default-content-cover")
    private WebElement reportImg;

    @FindBy(css = ".report-result-default .ui-report-default-link")
    private WebElement downLoadReportBtn;

    @FindBy(xpath = "//span[contains(text(), 'Новый запрос')]")
    private WebElement newReportCreate;

    @FindBy(xpath = "//button[@class='about-rating-block__button ui-btn font__base yellow']")
    private WebElement getMyRating;

    @FindBy(css = ".report-photo__img")
    private WebElement ratingImg;

    public final List<WebElement> elements;
    public final List<WebElement> elementsWithoutAuth;


    public FinancialHealthPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        elements = Arrays.asList(getReport, pageTitle /*, historyTitle, history */);
        elementsWithoutAuth = Arrays.asList(getMyRating, pageTitle, ratingImg);
        headerPage.getMainHeader();
        footerPage.getFooter();
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(elements);
        allElementsAreVisible(footerPage.getFooter());
    }

    public void getReportClick() {
        getReport.click();
    }

    public void seeReportResult() {
        waitForVisibility(reportImg);
        waitForVisibility(downLoadReportBtn);
        waitForVisibility(newReportCreate);
    }

    public void downloadReport() {
        downLoadReportBtn.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void onFinancialHealthRatingPage(){
        driver.get(PagesUrls.financialHealthRatingPage());
        TestContext.checkRedirectUrl = PagesUrls.financialHealthRatingPage();
    }

    public void getMyRatingClick(){
        getMyRating.click();
    }

    public void pageIsDisplayedWithoutAuth(){
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(elementsWithoutAuth);
        allElementsAreVisible(footerPage.getFooter());
    }


}
