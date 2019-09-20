package stepDefinitions;

import base.Base;
import cucumber.api.java.uk.Дано;
import org.junit.Assert;
import pages.RefinancePage;

public class RefinancePageStepDefinitions extends Base {

    private final RefinancePage refinancePage = new RefinancePage();

    @Дано("^отображается страница Рефинансирование$")
    public void refinancePageIsDisplayed(){
        refinancePage.pageIsDisplayed();
        Assert.assertTrue(refinancePage.offersOnPageMoreOrEqual2());
    }
}