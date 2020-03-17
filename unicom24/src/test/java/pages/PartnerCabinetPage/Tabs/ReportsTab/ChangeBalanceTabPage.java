package pages.PartnerCabinetPage.Tabs.ReportsTab;

import org.openqa.selenium.support.PageFactory;
import pages.PartnerCabinetPage.Header.HeaderPartnerCabinetPage;

public class ChangeBalanceTabPage extends ReportsTabPage {
    private final HeaderPartnerCabinetPage header = new HeaderPartnerCabinetPage();
    private final CommonElementsForAllReportsTabs commonElementsForAllReportsTabs = new CommonElementsForAllReportsTabs();


    public ChangeBalanceTabPage() {

        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, commonElementsForAllReportsTabs);
    }

    public void pageIsDisplayed() {
        super.pageIsDisplayed();
        allElementsAreVisible(commonElementsForAllReportsTabs.getHeaderReportsTabsMax());
    }
}
