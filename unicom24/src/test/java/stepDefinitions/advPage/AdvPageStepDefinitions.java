package stepDefinitions.advPage;

import base.Base;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import pages.AdvCabinet.AdvPage;

public class AdvPageStepDefinitions extends Base {

    private final AdvPage advPage = new AdvPage();

    @Дано("отображается личный кабинет Банков и Рекламодателей")
    public void cabinetOfBanksAndAdvIsDisplayed(){
        advPage.pageIsDisplayed();
    }

    @Тогда("^банкир нажимает на вкладку Отчеты$")
    public void bankirReportsClick() {
        advPage.reportsTabClick();
    }

    @Когда("^пользователь разлогинивается$")
    public void userDropMenuClick(){
        advPage.dropMenuClick();
        advPage.dropMenuLogOutClick();
    }

}
