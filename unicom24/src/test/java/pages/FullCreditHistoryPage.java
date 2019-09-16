package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class FullCreditHistoryPage extends Base {

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

    @FindBy(css = ".ui-report-exquifax-content .ui-report-exquifax-content-block")
    private WebElement reportImg;

    @FindBy(css = "a .ui-btn.font__base.yellow")
    private WebElement downLoadReportBtn;

    @FindBy(xpath = "//span[contains(text(), 'Новый запрос')]")
    private WebElement newReportCreate;

    public final List<WebElement> elements;

    public FullCreditHistoryPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(getReport, pageTitle, historyTitle, history);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(elements);
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
    }
}
