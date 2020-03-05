package stepDefinitions.webMaster.tabsStepDefinitions;

import base.Base;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import pages.PartnerCabinetPage.Tabs.ReportsTabPage;

public class ReportsTabPageStepDefinitions extends Base {
    private final ReportsTabPage reportsTabPage = new ReportsTabPage();

    @Когда("^вебмастер выбирает \"([^\"]*)\" в отчетах$")
    public void webMasterReportsTrafficSelectMainFilter(String nameMainFilter){
        reportsTabPage.selectMainFilter(nameMainFilter);
    }

    @Тогда("^вебмастеру отображается результат выборки \"([^\"]*)\" в отчетах$")
    public void webMasterReportsTrafficMainFilterIsDisplayed(String nameMainFilter){
        reportsTabPage.mainFilterIsDisplayed(nameMainFilter);
    }
}
