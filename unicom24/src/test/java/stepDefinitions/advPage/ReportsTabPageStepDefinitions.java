package stepDefinitions.advPage;

import cucumber.api.java.ru.Дано;
import pages.AdvCabinet.ReportsTabPage;

public class ReportsTabPageStepDefinitions {

    private final ReportsTabPage reportsTabPage = new ReportsTabPage();

    @Дано("отображается страница отчетов Банков и Рекламодателей")
    public void reportsPageOfBanksAndAdvIsDisplayed() {
        reportsTabPage.pageIsDisplayed();
    }
}
