package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.Тогда;
import pages.BecomePartner;

public class BecomePartnerStepDefinitions extends Base {

    private final BecomePartner becomePartner = new BecomePartner();

    @Тогда("^отображается страница Стать партнером$")
    public void becomePartnerPageIsDisplayed(){
        becomePartner.pageIsDisplayed();
    }
}
