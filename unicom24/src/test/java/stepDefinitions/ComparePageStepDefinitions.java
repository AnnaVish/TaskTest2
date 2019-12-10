package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.Тогда;
import pages.ComparePage;

public class ComparePageStepDefinitions extends Base {
    private final ComparePage comparePage = new ComparePage();

    @Тогда("^отображается страница Сравнение$")
    public void comparePageIsDisplayed() {
        comparePage.pageIsDisplayed();
    }


}
