package pages.PartnerCabinetPage.Tabs.ReportsTab;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Header.HeaderPartnerCabinetPage;

import java.util.List;

public class LandingsAndAPI extends ReportsTabPage {
    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();

    @FindBy(xpath = "//div[./div[contains(text(), 'от')]]//input")
    private WebElement dateFrom;

    @FindBy(xpath = "//div[./div[contains(text(), 'до')]]//input")
    private WebElement dateTo;

    @FindBy(xpath = "//div[@class='buttons']//button[contains(text(), 'Показать')]")
    private WebElement displayBTN;

    @FindBy(xpath = "//div[@class='buttons']//button[contains(text(), 'Очистить')]")
    private WebElement clearBTN;

    @FindBy(xpath = "//div[@class='ds-button-group']//button")
    private List<WebElement> statisticBTNs;

    public LandingsAndAPI() {
        PageFactory.initElements(driver, this);
    }

    public void pageIsDisplayed() {
        super.pageIsDisplayed();
        waitForVisibility(displayBTN);
        waitForVisibility(clearBTN);
        waitForVisibility(dateTo);
        waitForVisibility(dateFrom);
        Assert.assertEquals(4, statisticBTNs.size());
    }
}
