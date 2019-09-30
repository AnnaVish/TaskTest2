package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;
import pages.FullCreditHistoryPage;
import properties.BaseProperties;

import java.io.File;

public class FullCreditHistoryPageStepDefinitions extends Base {

    private final BaseProperties baseProperties = new BaseProperties();
    private final FullCreditHistoryPage fullCreditHistoryPage = new FullCreditHistoryPage();

    @Тогда("^отображается страница Полная кредитная история$")
    public void financialHealtPageIsDisplayed(){
        fullCreditHistoryPage.pageIsDisplayed();
    }

    @Тогда("^пользователь нажимает получить отчет - Полная кредитная история$")
    public void userClickGetReport(){
        fullCreditHistoryPage.getReportClick();
    }

    @Тогда("^пользователь видит что отчет по полной кредитной истории создался$")
    public void userSeeCreatedResult(){
        fullCreditHistoryPage.seeReportResult();
    }


    @Тогда("^пользователь скачивает отчет Полная кредитная история$")
    public void userDownloadReport(){
        fullCreditHistoryPage.downloadReport();
        Assert.assertTrue(folderSize(new File(baseProperties.createDownloadDirURL())) > 300000);
        Assert.assertEquals("pdf", getFileExtension(new File(baseProperties.createDownloadDirURL())));
    }
}
