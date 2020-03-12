package pages.PartnerCabinetPage.Tabs.ReportsTab.Trafic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Union extends TraficPage {

    TraficPage traficPage = new TraficPage();

    @FindBy(xpath = "//div[@class='statistics-general-table']")
    private WebElement trafficUnionOfferTable;

    public Union() {
        PageFactory.initElements(driver, this);
    }

    public void pageIsDisplayed() {
        super.pageIsDisplayed();
        waitForVisibility(trafficUnionOfferTable);
    }
}