package stepDefinitions.verticals.microCredits;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import pages.verticals.microCredits.MicroCreditsPage;

public class MicroCreditsPageStepDefinitions {

    private final MicroCreditsPage microCreditsPage = new MicroCreditsPage();

    @Дано("^пользователь находится на странице Микрозаймы$")
    public void onCreditsPage(){
        microCreditsPage.onMicroCreditsPage();
    }

    @Тогда("^отображается страница Микрозаймы$")
    public void microCreditsIsDisplayed() {
        microCreditsPage.pageIsDisplyed();
        Assert.assertTrue(microCreditsPage.offersOnPageMore10());
    }
}
