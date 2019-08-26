package stepDefinitions;

import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import pages.CreditsPage;

public class CreditsPageStepDefinitions {

    private final CreditsPage creditsPage = new CreditsPage();

    @Тогда("^отображается страница Кредиты$")
    public void creditsPageIsDisplayed() {
        creditsPage.pageIsDisplayed();
        Assert.assertTrue(creditsPage.offersOnPageEqual10());
    }
}
