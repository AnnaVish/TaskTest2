package stepDefinitions.broker.profile;

import cucumber.api.java.ru.Тогда;
import pages.BrokerCabinet.profile.CountPage;

public class CountPageStepDefinitions {

    private final CountPage countPage = new CountPage();

    @Тогда("^отображается страница Счет в профиле$")
    public void countPageIsDisplayed() {
        countPage.pageIsDisplayed();
    }
}
