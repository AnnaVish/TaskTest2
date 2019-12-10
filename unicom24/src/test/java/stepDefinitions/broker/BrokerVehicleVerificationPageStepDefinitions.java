package stepDefinitions.broker;

import base.Base;
import cucumber.api.java.ru.Тогда;
import pages.BrokerCabinet.BrokerCabinetPage;
import pages.BrokerCabinet.BrokerVehicleVerificationPage;

public class BrokerVehicleVerificationPageStepDefinitions extends Base {

    private final BrokerVehicleVerificationPage brokerVehicleVerificationPage = new BrokerVehicleVerificationPage();
    private final BrokerCabinetPage brokerCabinetPage = new BrokerCabinetPage();

    @Тогда("^отображается страница Проверка автомобиля$")
    public void vehicleVerificationPageIsDisplayed(){
        brokerCabinetPage.myCustomersMouseOver();
        brokerVehicleVerificationPage.pageIsDisplayed();
    }
}
