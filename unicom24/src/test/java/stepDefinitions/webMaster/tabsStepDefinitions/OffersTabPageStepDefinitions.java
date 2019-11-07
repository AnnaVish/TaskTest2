package stepDefinitions.webMaster.tabsStepDefinitions;

import cucumber.api.java.ru.Тогда;
import pages.PartnerCabinetPage.Tabs.OffersTabPage;

public class OffersTabPageStepDefinitions {

    private final OffersTabPage offersTabPage = new OffersTabPage();

    @Тогда("^отображается страница Офферы$")
    public void offersTabPageIsDisplayed() {
        offersTabPage.pageIsDisplayed();
    }
}
