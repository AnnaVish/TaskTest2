package stepDefinitions;

import cucumber.api.java.ru.Тогда;
import pages.mock.MailCatcher;

public class MockPageStepDefenitions {

    private final MailCatcher mailCatcher = new MailCatcher();

    @Тогда("^пользователь переходит по ссылке из письма$")
    public void getEmailAndOpenLink() {
        mailCatcher.changePasswordByEmail();
    }
}
