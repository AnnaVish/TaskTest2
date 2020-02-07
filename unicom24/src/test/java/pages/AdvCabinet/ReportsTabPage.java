package pages.AdvCabinet;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import pages.AdvCabinet.Header.HeaderAdvPage;
import pages.AdvCabinet.ReportsPages.Reports;

import java.util.Arrays;
import java.util.List;

public class ReportsTabPage extends Base {

    private final HeaderAdvPage header = new HeaderAdvPage();
    private final Reports reports = new Reports();
    private final AdvPage advPage = new AdvPage();

    @FindBy(xpath = "//div[contains(text(), 'Отчеты')]")
    private WebElement reportsTitle;

    @FindBy(css = "div.reports-view-list")
    private WebElement offersList;

    @FindBys({
            @FindBy(css = "div.ds-report-list-item-wrapper")
    })
    private List<WebElement> reportOrders;

    @FindBys({
            @FindBy(xpath = "//div[@class='ds-report-list-item-left-text-name']/a")
    })
    private List<WebElement> reportOrdersTitleText;

    private final List<WebElement> elements;

    public ReportsTabPage() {
        PageFactory.initElements(driver, header);
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(reportsTitle, offersList);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(header.getAdvHeader());
        allElementsAreVisible(elements);
        Assert.assertEquals(reportOrdersTitleText.size(), 4);
    }

    public void reportsCheck() {
        int countReportOrders = reportOrders.size();
        for (int i = 0; i < countReportOrders; i++) {
            String nameOfReport = reportOrdersTitleText.get(i).getText();
            ordersCheck(nameOfReport);
            reports.pageIsDisplayed();
            reports.reportPageCheck(nameOfReport);
            advPage.reportsTabClick();
            pageIsDisplayed();
        }
    }

    public void ordersCheck(String nameOfReport){
        String xPath = String.format("//a[contains(text(), '%s')]/../../../..//button", nameOfReport);
        WebElement element = driver.findElement(By.xpath(xPath));
        waitForVisibility(element);
        element.click();
    }
}
