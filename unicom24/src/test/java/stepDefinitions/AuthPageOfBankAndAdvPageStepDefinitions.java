package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.Тогда;
import pages.AuthPageOfBankAndAdv;

public class AuthPageOfBankAndAdvPageStepDefinitions extends Base {

    AuthPageOfBankAndAdv authPageOfBankAndAdv = new AuthPageOfBankAndAdv();

    @Тогда("отображается страница авторизации Личный кабинет Банков и Рекламодателей")
    public void AuthPageOfBankAndAdvPageIsDisplayed(){
        authPageOfBankAndAdv.pageIsDisplayed();
    }
}
