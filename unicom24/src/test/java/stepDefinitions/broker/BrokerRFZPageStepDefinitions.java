package stepDefinitions.broker;

import base.Base;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import pages.BrokerCabinet.BrokerCabinetPage;
import pages.BrokerCabinet.BrokerRFZPage;

public class BrokerRFZPageStepDefinitions extends Base {

    private final BrokerRFZPage brokerRFZPage = new BrokerRFZPage();
    private final BrokerCabinetPage brokerCabinetPage = new BrokerCabinetPage();

    @Тогда("^отображается страница Рейтинг финансового здоровья в кабинете брокера$")
    public void rfzPageIsDisplayed() {
        brokerCabinetPage.myCustomersMouseOver();
        brokerRFZPage.pageIsDisplayed();
    }
}


