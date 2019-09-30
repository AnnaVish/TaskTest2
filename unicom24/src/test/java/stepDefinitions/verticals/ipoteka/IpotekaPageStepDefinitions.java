package stepDefinitions.verticals.ipoteka;

import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import pages.verticals.ipoteka.IpotekaPage;

public class IpotekaPageStepDefinitions {

    private final IpotekaPage ipotekaPage = new IpotekaPage();

    @Тогда("^отображается страница Ипотека$")
    public void ipotekaPageIsDisplyaed() {
        ipotekaPage.pageIsDisplayed();
        Assert.assertTrue(ipotekaPage.offersOnPageEqual5());
    }
}
