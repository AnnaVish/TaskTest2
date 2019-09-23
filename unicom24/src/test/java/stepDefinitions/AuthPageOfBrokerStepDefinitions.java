package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.Тогда;
import pages.AuthPageOfBroker;

public class AuthPageOfBrokerStepDefinitions extends Base {

    private final AuthPageOfBroker authPageOfBroker = new AuthPageOfBroker();

    @Тогда("^отображается страница авторизации Личный кабинет Брокера и Агента$")
    public void authPageOfBrokerIsDisplayed(){
        authPageOfBroker.pageIsDisplayed();
    }
}
