package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.FinancialHealthPage;

public class FinancialHealthPageStepDefinitions extends Base {

    private final FinancialHealthPage financialHealthPage = new FinancialHealthPage();

    @Тогда("^отображается страница Рейтинг финансового здоровья$")
    public void financialHealtPageIsDisplayed(){
        financialHealthPage.pageIsDisplayed();
    }


    @Тогда("^пользователь видит что отчет создался$")
    public void userSeeCreatedResult(){
        financialHealthPage.seeReportResult();
    }

    @Тогда("^пользователь скачивает отчет финансового здоровья$")
    public void userDownloadReport(){
        financialHealthPage.downloadReport();
        openNewTab();
        switchToTheSecondTab();
//        driver.get("chrome://downloads");
//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'credit-rating')]"));
//        waitForVisibility(element);
    }
}
