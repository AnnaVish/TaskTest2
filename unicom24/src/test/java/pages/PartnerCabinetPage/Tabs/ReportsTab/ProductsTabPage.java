package pages.PartnerCabinetPage.Tabs.ReportsTab;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Header.HeaderPartnerCabinetPage;
import pages.PartnerCabinetPage.Tabs.ReportsTab.ReportsTabPage;

public class ProductsTabPage extends ReportsTabPage {
    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();

    @FindBy(xpath = "//div[./div[contains(text(), 'от')]]//input")
    private WebElement dateFrom;

    @FindBy(xpath = "//div[./div[contains(text(), 'до')]]//input")
    private WebElement dateTo;

    @FindBy(xpath = "//div[@class='buttons']//button[contains(text(), 'Показать')]")
    private WebElement displayBTN;

    @FindBy(xpath = "//div[@class='buttons']//button[contains(text(), 'Очистить')]")
    private WebElement clearBTN;

    public ProductsTabPage() {
        PageFactory.initElements(driver, this);
    }

    public void pageIsDisplayed() {
        super.pageIsDisplayed();
        waitForVisibility(displayBTN);
        waitForVisibility(clearBTN);
        waitForVisibility(dateTo);
        waitForVisibility(dateFrom);
    }
}
