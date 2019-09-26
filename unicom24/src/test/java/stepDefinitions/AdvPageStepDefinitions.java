package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.Дано;
import pages.AdvCabinet.AdvPage;

public class AdvPageStepDefinitions extends Base {

    private final AdvPage advPage = new AdvPage();

    @Дано("отображается личный кабинет Банков и Рекламодателей")
    public void cabinetOfBanksAndAdvIsDisplayed(){
        advPage.pageIsDisplayed();
    }
}
