package stepDefinitions.Auth;

import base.Base;
import cucumber.api.java.ru.Тогда;
import pages.Auth.AuthPageOfBroker;

public class AuthPageOfBrokerStepDefinitions extends Base {

    private final AuthPageOfBroker authPageOfBroker = new AuthPageOfBroker();

    @Тогда("^пользователь нахоидится на странице авторизации Брокера$")
    public void onBrokerAuthPage() {
        authPageOfBroker.onPage();
    }

    @Тогда("^отображается страница авторизации Личный кабинет Брокера и Агента$")
    public void authPageOfBrokerIsDisplayed(){
        authPageOfBroker.pageIsDisplayed();
    }

    @Тогда("^брокер авторизовывается$")
    public void brokerLogIn(){
        authPageOfBroker.brokerLogIn();
    }
}
