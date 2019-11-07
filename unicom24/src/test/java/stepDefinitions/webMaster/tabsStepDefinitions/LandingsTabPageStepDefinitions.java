package stepDefinitions.webMaster.tabsStepDefinitions;

import cucumber.api.java.ru.Тогда;
import pages.PartnerCabinetPage.Tabs.LandingsTabPage;

public class LandingsTabPageStepDefinitions {

    private final LandingsTabPage landingsTabPage = new LandingsTabPage();

    @Тогда("^отображается страница Лендинги$")
    public void landingsTabPageIsDisplayed() {
        landingsTabPage.pageIsDisplayed();
    }
}
