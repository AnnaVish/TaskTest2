package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.Тогда;
import pages.PartnerCabinetPage.PartnerCabinetPage;

public class PartnerCabinetPageStepDefinitions extends Base {

    private final PartnerCabinetPage partnerCabinetPage = new PartnerCabinetPage();

    @Тогда("^отображается личный кабинет Вебмастера$")
    public void cabinetOfWebMasterIsDisplayed(){
        partnerCabinetPage.pageIsDisplayed();
    }
}
