package stepDefinitions.verticals.autoCredits;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import pages.verticals.autoCredits.AutoCreditsPage;

public class AutoCreditsPageStepDefinitions {

    private final AutoCreditsPage autoCreditsPage = new AutoCreditsPage();

    @Дано("^пользователь находится на странице Автокредиты$")
    public void onCreditsPage(){
        autoCreditsPage.onAutoCreditsPage();
    }

    @Тогда("^отображается страница Автокредиты$")
    public void autoCreditsPageIsDispyaed() {
        autoCreditsPage.pageIsDisplayed();
        Assert.assertTrue(autoCreditsPage.offersOnPageMore5());
    }
}
