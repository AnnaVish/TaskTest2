package stepDefinitions.broker;

import base.Base;
import cucumber.api.java.ru.Тогда;
import pages.BrokerCabinet.BrokerCabinetPage;
import pages.BrokerCabinet.BrokerCreditRatingPage;

public class BrokerCreditRatingPageStepDefinitions extends Base {

    private final BrokerCreditRatingPage brokerCreditRatingPage = new BrokerCreditRatingPage();
    private final BrokerCabinetPage brokerCabinetPage = new BrokerCabinetPage();

    @Тогда("^отображается страница Кредитный рейтинг$")
    public void creditRatingPageIsDisplayed() {
        brokerCabinetPage.myCustomersMouseOver();
        brokerCreditRatingPage.pageIsDisplayed();
    }
}
