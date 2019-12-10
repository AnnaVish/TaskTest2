package stepDefinitions.broker;

import base.Base;
import cucumber.api.java.ru.Тогда;
import pages.BrokerCabinet.BrokerCabinetPage;
import pages.BrokerCabinet.BrokerFICOReportPage;

public class BrokerFICOReportPageStepDefinitions extends Base {

    private final BrokerFICOReportPage brokerFICOReportPage = new BrokerFICOReportPage();
    private final BrokerCabinetPage brokerCabinetPage = new BrokerCabinetPage();

    @Тогда("^отображается страница отчет FICO$")
    public void setBrokerFICOReportPageIsDisplayed() {
        brokerCabinetPage.myCustomersMouseOver();
        brokerFICOReportPage.pageIsDisplayed();
    }
}
