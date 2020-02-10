package stepDefinitions.advPage;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import pages.AdvCabinet.ReportsTabPage;
import pages.AdvCabinet.ReportsPages.Reports;

public class ReportsTabPageStepDefinitions {

    private final ReportsTabPage reportsTabPage = new ReportsTabPage();
    private final Reports reports = new Reports();

    @Дано("^отображается страница отчетов Банков и Рекламодателей$")
    public void reportsPageOfBanksAndAdvIsDisplayed() {
        reportsTabPage.pageIsDisplayed();
    }

    @Когда("^банкир проверяет отображение страниц всех отчетов$")
    public void reportsPageReportsBTNClick(){
        reportsTabPage.reportsCheck();
    }
}
