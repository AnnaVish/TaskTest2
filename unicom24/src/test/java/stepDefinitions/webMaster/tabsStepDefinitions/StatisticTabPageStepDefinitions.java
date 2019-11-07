package stepDefinitions.webMaster.tabsStepDefinitions;

import cucumber.api.java.ru.Тогда;
import pages.PartnerCabinetPage.Tabs.StatisticTabPage;

public class StatisticTabPageStepDefinitions {

    private final StatisticTabPage statisticTabPage = new StatisticTabPage();

    @Тогда("отображается страница Статистика")
    public void statisticTabPagePageIsDisplayed() {
        statisticTabPage.pageIsDisplayed();
    }
}
