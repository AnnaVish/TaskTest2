package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.Тогда;
import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import org.junit.Assert;
import pages.FinancialHealthPage;
import properties.BaseProperties;

import java.io.File;

public class FinancialHealthPageStepDefinitions extends Base {

    private final FinancialHealthPage financialHealthPage = new FinancialHealthPage();
    private final BaseProperties baseProperties = new BaseProperties();

    @Тогда("^отображается страница Рейтинг финансового здоровья$")
    public void financialHealtPageIsDisplayed(){
        financialHealthPage.pageIsDisplayed();
    }

    @Тогда("^пользователь нажимает получить отчет - Рейтинг финансового здоровья$")
    public void userClickGetReport(){
        financialHealthPage.getReportClick();
    }

    @Тогда("^пользователь видит что отчет по финансовому здоровью создался$")
    public void userSeeCreatedResult(){
        financialHealthPage.seeReportResult();
    }

    @Тогда("^пользователь скачивает отчет финансового здоровья$")
    public void userDownloadReport(){
        financialHealthPage.downloadReport();
        Assert.assertTrue(folderSize(new File(baseProperties.createDownloadDirURL())) > 150000);
        Assert.assertEquals("pdf", getFileExtension(new File(baseProperties.createDownloadDirURL())));
    }

    @Дано("^пользователь находится на странице Рейтинг финансового здоровья$")
    public void userOnFinancialHealthRatingPage(){
        financialHealthPage.onFinancialHealthRatingPage();
    }

    @Когда("^пользователь кликает на кнопку Узнать мой рейтинг$")
    public void userGetRatingBTNClick(){
        financialHealthPage.getMyRatingClick();
    }

    @Когда("^пользователь находится на странице Рейтинг финансового здоровья без авторизации$")
    public void userWithoutAuthOnFinancialHealthRatingPage(){
        financialHealthPage.pageIsDisplayedWithoutAuth();
    }
}
