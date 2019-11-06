package stepDefinitions.webMaster;

import cucumber.api.java.ru.Тогда;
import pages.PartnerCabinetPage.settingsTab.SettingsTab;

public class SettingsTabStepDefinitions {

    private final SettingsTab settingsTab = new SettingsTab();

    @Тогда("^отображается страница настройки$")
    public void settingsTabPageIsDisplayed() {
        settingsTab.pageIsDisplayed();
    }
}
