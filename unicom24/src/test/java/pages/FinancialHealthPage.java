package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class FinancialHealthPage extends Base {
    /*
     *Хэдэр
     */
    @FindBy(css = "a.ui-app-header-logo-wrapper ")
    private WebElement logoLink;

    @FindBy(xpath = "//span[contains(text(), 'Частным клиентам')]")
    private WebElement privateCustomersLink;

    @FindBy(xpath = "//span[contains(text(), 'Малому и среднему бизнесу')]")
    private WebElement forBusinessLink;

    @FindBy(xpath = "//span[contains(text(), 'Сервисы')]")
    private WebElement servicesLink;

    @FindBy(xpath = "//span[contains(text(), 'Прочее')]")
    private WebElement othersLink;

    @FindBy(xpath = "//span[contains(text(), 'Кредиты')]")
    private WebElement creditsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Кредитные карты')]")
    private WebElement creditCardsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Автокредиты')]")
    private WebElement autoCreditsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Ипотека')]")
    private WebElement ipotekaHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Микрозаймы')]")
    private WebElement microCreditsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Рефинансирование')]")
    private WebElement refinanceHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Банки')]")
    private WebElement bankiHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'МФО')]")
    private WebElement mfoHeaderLink;

    /*
     *Хэдэр окончен
     */

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
    public final List<WebElement> header;

    public FinancialHealthPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(getReport, pageTitle, historyTitle, history);
        header = Arrays.asList(logoLink, privateCustomersLink, forBusinessLink, othersLink, servicesLink,
                creditsHeaderLink, creditCardsHeaderLink, autoCreditsHeaderLink, ipotekaHeaderLink, refinanceHeaderLink);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(header);
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
