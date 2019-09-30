package stepDefinitions.verticals;

import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import pages.verticals.AutoCreditsPage;

public class AutoCreditsPageStepDefinitions {

    private final AutoCreditsPage autoCreditsPage = new AutoCreditsPage();

    @Тогда("^отображается страница Автокредиты$")
    public void autoCreditsPageIsDispyaed() {
        autoCreditsPage.pageIsDisplayed();
        Assert.assertTrue(autoCreditsPage.offersOnPageMore5());
    }
}
