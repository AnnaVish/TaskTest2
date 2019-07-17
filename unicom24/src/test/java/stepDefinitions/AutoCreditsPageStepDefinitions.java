package stepDefinitions;

import cucumber.api.java.ru.Тогда;
import pages.AutoCreditsPage;

public class AutoCreditsPageStepDefinitions {

    private final AutoCreditsPage autoCreditsPage = new AutoCreditsPage();

    @Тогда("^отображается страница Автокредиты$")
    public void autoCreditsPageIsDispyaed() {
        autoCreditsPage.pageIsDisplayed();
    }
}
