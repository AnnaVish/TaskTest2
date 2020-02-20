package stepDefinitions.verticals.credits;

import base.Base;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import pages.verticals.common.CommonMethodsForAllVerticals;
import pages.verticals.credits.CreditsPage;

public class CreditsPageStepDefinitions extends Base {

    private final CreditsPage creditsPage = new CreditsPage();
    private final CommonMethodsForAllVerticals commonMethods = new CommonMethodsForAllVerticals();

    @Тогда("^отображается страница Кредиты$")
    public void creditsPageIsDisplayed() {
        creditsPage.pageIsDisplayed();
        Assert.assertTrue(creditsPage.offersOnPageMore0());
        Assert.assertTrue(creditsPage.checkH2SeoElements());
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
        Assert.assertTrue(driver.getCurrentUrl(), creditsPage.checkRedirects());
    }

    @И("^пользователь добавляет \"([^\"]*)\" банков в сравнение")
    public void userAddToCompareFirstBank(String numberOfBanksForAddToCompare){
        creditsPage.banksForAddToCompareCreditsClick(numberOfBanksForAddToCompare);
    }
    @И("^пользователь выбирает локацию \"([^\"]*)\"")
    public void userChangeLocation(String selectCity){
        commonMethods.userChangeLocationCity(selectCity);
    };
}
