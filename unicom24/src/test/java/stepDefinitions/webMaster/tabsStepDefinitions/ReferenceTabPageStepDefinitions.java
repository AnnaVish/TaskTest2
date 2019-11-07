package stepDefinitions.webMaster.tabsStepDefinitions;

import cucumber.api.java.ru.Дано;
import pages.PartnerCabinetPage.Tabs.ReferenceTabPage;

public class ReferenceTabPageStepDefinitions {

    ReferenceTabPage referenceTabPage = new ReferenceTabPage();

    @Дано("^отображается страница Справка$")
    public void referencePageIsDisplayed() {
        referenceTabPage.pageIsDisplayed();
    }
}
