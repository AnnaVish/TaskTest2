package pages.AdvCabinet;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import pages.AdvCabinet.Header.HeaderAdvPage;

import java.util.Arrays;
import java.util.List;

public class ReportsTabPage extends Base {

    private final HeaderAdvPage header = new HeaderAdvPage();

    @FindBy(xpath = "//div[contains(text(), 'Отчеты')]")
    private WebElement reportsTitle;

    @FindBy(css = "div.reports-view-list")
    private WebElement offersList;

    @FindBys({
            @FindBy(css = "div.ds-report-list-item-wrapper")
    })
    private List<WebElement> offers;

    private final List<WebElement> elements;

    public ReportsTabPage() {
        PageFactory.initElements(driver, header);
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(reportsTitle, offersList);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(header.getAdvHeader());
        allElementsAreVisible(elements);
        Assert.assertEquals(offers.size(), 4);
    }

    public void clickOfferBtn(String nameOfOffer) {
        String xPath = String.format("//div[./div[./div[./div[./a[contains(text(), '%s')]]]]]//button", nameOfOffer);
        WebElement element = driver.findElement(By.xpath(xPath));
        waitForVisibility(element);
        element.click();
    }
}
