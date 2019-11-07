package stepDefinitions.webMaster.tabsStepDefinitions;

import cucumber.api.java.ru.Тогда;
import pages.PartnerCabinetPage.Tabs.SettingsTabPage;

public class SettingsTabStepDefinitions {

    private final SettingsTabPage settingsTabPage = new SettingsTabPage();

    @Тогда("^отображается страница настройки$")
    public void settingsTabPageIsDisplayed() {
        settingsTabPage.pageIsDisplayed();
    }
}
