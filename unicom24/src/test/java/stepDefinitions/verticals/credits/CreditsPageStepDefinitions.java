package stepDefinitions.verticals.credits;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import pages.verticals.credits.CreditsPage;

public class CreditsPageStepDefinitions {

    private final CreditsPage creditsPage = new CreditsPage();

    @Тогда("^отображается страница Кредиты$")
    public void creditsPageIsDisplayed() {
        creditsPage.pageIsDisplayed();
        Assert.assertTrue(creditsPage.offersOnPageMore5());
    }

    @Тогда("^пользователь кликает на название банка$")
    public void userClickTitleOfBankClick(){
        creditsPage.titleOfBankClick();
    }

    @Дано("^пользователь нахоидится на странице Кредиты$")
    public void onCreditsPage(){
        creditsPage.onCreditsPage();
    }

    @Тогда("^пользователь проверяет что переходы работают$")
    public void userTestRedirects(){
        Assert.assertTrue(creditsPage.checkRedirects());
    }
}
