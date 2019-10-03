package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.То;
import cucumber.api.java.ru.Тогда;
import pages.PartnerCabinetPage.PartnerCabinetPage;
import pages.PartnerCabinetPage.postbackTab.PostbackTabPage;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class PartnerCabinetPageStepDefinitions extends Base {

    private final PartnerCabinetPage partnerCabinetPage = new PartnerCabinetPage();
    private final PostbackTabPage postbackTabPage = new PostbackTabPage();

    @Тогда("^отображается личный кабинет Вебмастера$")
    public void cabinetOfWebMasterIsDisplayed(){
        partnerCabinetPage.pageIsDisplayed();
    }

    @То("^вебмастер кликает на вкладку Постбек$")
    public void webMasterClickPostbackTab(){
        partnerCabinetPage.postBackClick();
    }

    @То("^отображается страница Постбек$")
    public void postbakPageIsDisplayed(){
        postbackTabPage.pageIsDisplayed();
    }

    @То("^вебмастер подготавливает параметры для постбека$")
    public void prepareParameters(){
            postbackTabPage.fillFields();
    }

    @То("на странице постбека отображаются данные из параметров")
    public void checkPostBackData(){
        postbackTabPage.checkIsPostbackDone();
    }
}
