package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class FinancialHealthPage extends Base {

    @FindBy(xpath = "//button[./span[contains(text(), 'Получить отчет')]]")
    private WebElement getReport;

    @FindBy(xpath = "//h1[contains(text(), 'Рейтинг финансового здоровья')]")
    private WebElement pageTitle;

    @FindBy(xpath = "//div[contains(text(), 'История запросов на рейтинг финансового здоровья')]")
    private WebElement historyTitle;

    @FindBy(css = ".ui-auto-requests-history .ui-form-requests-history-credit_report__data-wrapper")
    private WebElement history;

    @FindBy(css = ".ui-report-default-content-block .ui-report-default-content-cover")
    private WebElement reportImg;

    @FindBy(css = ".report-result-default .ui-report-default-link")
    private WebElement downLoadReportBtn;

    @FindBy(xpath = "//span[contains(text(), 'Новый запрос')]")
    private WebElement newReportCreate;

    public final List<WebElement> elements;

    public FinancialHealthPage() {
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
