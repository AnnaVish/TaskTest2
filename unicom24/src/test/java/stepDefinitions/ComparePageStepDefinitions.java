package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import pages.ComparePage;

public class ComparePageStepDefinitions extends Base {
    private final ComparePage comparePage = new ComparePage();

    @Тогда("^отображается страница Сравнение$")
    public void comparePageIsDisplayed() {
        comparePage.pageIsDisplayed();
    }
    @И("^отображается \"([^\"]*)\" банков в сравнении")
    public void compareBanksCreditIsDisplayed(String countBanksCreditToCompare){
        comparePage.compareBanksCreditCompareIsDisplayed(countBanksCreditToCompare);
    }

    @Когда("^пользователь удаляет \"([^\"]*)\" банков из сравнения")
    public void removeBanksCreditsRemoveFromCompare(String countBanksRemoveFromCompare){
        comparePage.removeBanksFromCompareCreditsClick(countBanksRemoveFromCompare);
    }

}
