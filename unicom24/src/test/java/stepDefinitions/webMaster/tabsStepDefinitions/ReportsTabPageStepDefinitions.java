package stepDefinitions.webMaster.tabsStepDefinitions;

import base.Base;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import pages.PartnerCabinetPage.Tabs.ReportsTab.ReportsTabPage;
import pages.PartnerCabinetPage.Tabs.ReportsTab.Trafic.Detailed;
import pages.PartnerCabinetPage.Tabs.ReportsTab.Trafic.Summary;
import pages.PartnerCabinetPage.Tabs.ReportsTab.Trafic.TraficPage;
import pages.PartnerCabinetPage.Tabs.ReportsTab.Trafic.Union;

public class ReportsTabPageStepDefinitions extends Base {
    private final ReportsTabPage reportsTabPage = new ReportsTabPage();
    private final Summary summary = new Summary();
    private final Union union = new Union();
    private final Detailed detailed = new Detailed();
    TraficPage traficPage = new TraficPage();

    @Когда("^вебмастер выбирает \"([^\"]*)\" в отчетах$")
    public void webMasterReportsTrafficSelectMainFilter(String nameMainFilter) {
        traficPage.selectMainFilter(nameMainFilter);
    }

    @Тогда("^вебмастеру отображается результат выборки \"([^\"]*)\" в отчетах$")
    public void webMasterReportsTrafficMainFilterIsDisplayed(String nameMainFilter) {
        switch (nameMainFilter) {
            case ("Единый оффер"):
                union.pageIsDisplayed();
                break;
            case ("Детализированный"):
                detailed.pageIsDisplayed();
                break;
            case ("Сводный"):
                summary.pageIsDisplayed();
                break;
        }

    }
}
