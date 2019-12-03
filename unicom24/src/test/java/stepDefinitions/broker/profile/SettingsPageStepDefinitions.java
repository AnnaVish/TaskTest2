package stepDefinitions.broker.profile;

import cucumber.api.java.ru.Тогда;
import pages.BrokerCabinet.profile.SettingsPage;

public class SettingsPageStepDefinitions {

    private final SettingsPage settingsPage = new SettingsPage();

    @Тогда("^отображается страница Настройка в профиле$")
    public void settingsPageIsDisplayed() {
        settingsPage.pageIsDisplayed();
    }
}
