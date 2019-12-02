package stepDefinitions.broker;

import cucumber.api.java.ru.Тогда;
import pages.BrokerCabinet.profile.ProfilePage;

public class ProfilePageStepDefinitions {

    private final ProfilePage profilePage = new ProfilePage();

    @Тогда("^отображается профиль$")
    public void profilePageIsDisplayed() {
        profilePage.pageIsDisplayed();
    }
}
