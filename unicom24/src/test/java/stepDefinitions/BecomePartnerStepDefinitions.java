package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.Тогда;
import pages.BecomePartnerPage;

public class BecomePartnerStepDefinitions extends Base {

    private final BecomePartnerPage becomePartner = new BecomePartnerPage();

    @Тогда("^отображается страница Стать партнером$")
    public void becomePartnerPageIsDisplayed(){
        becomePartner.pageIsDisplayed();
    }
}
