package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import pages.RegisterPage;

public class RegisterStepDefinitions {

    private final RegisterPage registerPage = new RegisterPage();

    @Given("^пользователь нахоидится на странице авторизации$")
    public void onRegistrationPage() {
        registerPage.onAuthPage();
    }

    @Когда("^пользователь заполняет все поля, занятый email и отпарвляет форму$")
    public void fillAllFields(){
        registerPage.fillFildsWithTakenEmail();
    }

    @Тогда("^видна ошибка что адрес занят$")
    public void seeErrorMessage(){
        registerPage.seeErorMessage();
    }

}
