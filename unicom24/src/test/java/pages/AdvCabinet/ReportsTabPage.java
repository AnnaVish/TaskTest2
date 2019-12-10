package pages.AdvCabinet;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.AdvCabinet.Header.HeaderAdvPage;

import java.util.Arrays;
import java.util.List;

public class ReportsTabPage extends Base {

    private final HeaderAdvPage header = new HeaderAdvPage();

    @FindBy(xpath = "//div[contains(text(), 'Отчеты')]")
    private WebElement reportsTitle;

    @FindBy(xpath = "//div[./div[./div[./div[contains(text(), 'Экспертиза')]]]]/div[2]/div[contains(text(), 'Получить отчет')]")
    private WebElement expertizeGetReportBtn;

    @FindBy(xpath = "//div[./div[./div[./div[contains(text(), 'ФССП')]]]]/div[2]/div[contains(text(), 'Получить отчет')]")
    private WebElement fsspGetReportBtn;

    @FindBy(xpath = "//div[./div[./div[./div[contains(text(), 'ОКБ')]]]]/div[2]/div[contains(text(), 'Получить отчет')]")
    private WebElement okbGetReportBtn;

    @FindBy(xpath = "//div[./div[./div[./div[contains(text(), 'ФМС')]]]]/div[2]/div[contains(text(), 'Получить отчет')]")
    private WebElement fmsGetReportBtn;

    private final List<WebElement> elements;

    public ReportsTabPage() {
        PageFactory.initElements(driver, header);
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(reportsTitle, expertizeGetReportBtn, fsspGetReportBtn, okbGetReportBtn, fmsGetReportBtn);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(header.getAdvHeader());
        allElementsAreVisible(elements);
    }
}
