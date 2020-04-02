package stepDefinitions;

import cucumber.api.java.ru.Тогда;
import pages.mock.MailCatcher;
import pages.mock.SmsCatcher;

public class MockPageStepDefenitions {

    private final MailCatcher mailCatcher = new MailCatcher();
    private final SmsCatcher smsCatcher = new SmsCatcher();

    @Тогда("^пользователь переходит по ссылке из письма$")
    public void getEmailAndOpenLink() {
        mailCatcher.changePasswordByEmail();
    }

    @Тогда("^пользователь вводит пароль из смс и нажимает на \"([^\"]*)\"$")
    public void typePasswordAndClickBtn(String btn) {
        smsCatcher.typeCodeFromSmsServer(btn);
    }
}
