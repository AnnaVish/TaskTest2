package stepDefinitions;

import cucumber.api.java.ru.Тогда;
import pages.CreditCardsPage;

public class CreditCardsPageStepDefinitions {

    private final CreditCardsPage creditCardsPage = new CreditCardsPage();


    @Тогда("^отображается страница Кредитные карты$")
    public void creditCardsPageIsDisplayed() {
        creditCardsPage.pageIsDisplayed();
    }
}
