package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.Тогда;
import pages.AuthPageOfBrokerOld;

public class AuthPageOfBrokerOldStepDefinitions extends Base {

    private final AuthPageOfBrokerOld authPageOfBrokerOld = new AuthPageOfBrokerOld();

    @Тогда("^страница авторизации Старый кабинет брокера и агента отображается$")
    public void oldCabinetOfBrokerAuthPageIsDisplayed(){
        authPageOfBrokerOld.pageIsDisplayed();
    }
}
