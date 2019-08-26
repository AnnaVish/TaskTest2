package stepDefinitions;

import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import pages.BankList;

public class AllBanksStepDefinitions {

    public final BankList bankList = new BankList();

    @Тогда("^пользователь нахоидится на странице Список банков$")
    public void bankListPage() {
        bankList.onAllBanksPage();
    }

    @Тогда("^отображается страница Все банки$")
    public void allBanksPageAreDisplayed() {
        bankList.bankListPageIsDisplayed();
        Assert.assertTrue(bankList.banksOnPageEqual5());
    }

    @Тогда("^пользователь вводит \"([^\"]*)\" в поле ввода$")
    public void fillFieldWithNameOfBank(String nameOfBank) {
        bankList.fillSearchInput(nameOfBank);
    }

    @И("^пользователь наживает на кнопку поиск$")
    public void searchBtnClicks() {
        bankList.searchBtnClick();
    }

    @Тогда("^на странице появляется ссылка на \"([^\"]*)\"$")
    public void seeBankLink(String bankNameLink) {
        bankList.seeBankNameLink(bankNameLink);
    }

}
