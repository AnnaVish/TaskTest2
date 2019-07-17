package stepDefinitions;

import cucumber.api.java.ru.Тогда;
import pages.CreditReportsPage;

public class CreditReportsPageStepDeffinitios {

    private final CreditReportsPage creditReportsPage = new CreditReportsPage();


    @Тогда("^отображается страница Кредитные отчеты$")
    public void creditReportsPageIsDisplayed() {
        creditReportsPage.pageIsDisplayed();
    }

}
