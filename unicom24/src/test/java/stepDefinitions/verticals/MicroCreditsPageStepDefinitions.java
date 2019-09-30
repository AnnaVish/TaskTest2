package stepDefinitions.verticals;

import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import pages.verticals.MicroCreditsPage;

public class MicroCreditsPageStepDefinitions {

    private final MicroCreditsPage microCreditsPage = new MicroCreditsPage();

    @Тогда("^отображается страница Микрозаймы$")
    public void microCreditsIsDisplayed() {
        microCreditsPage.pageIsDisplyed();
        Assert.assertTrue(microCreditsPage.offersOnPageMore10());
    }
}
