package stepDefinitions.verticals.autoCredits;

import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import pages.verticals.autoCredits.AutoCreditsPage;

public class AutoCreditsPageStepDefinitions {

    private final AutoCreditsPage autoCreditsPage = new AutoCreditsPage();

    @Тогда("^отображается страница Автокредиты$")
    public void autoCreditsPageIsDispyaed() {
        autoCreditsPage.pageIsDisplayed();
        Assert.assertTrue(autoCreditsPage.offersOnPageMore5());
    }
}
