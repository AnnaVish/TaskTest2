package stepDefinitions;

import base.Base;
import cucumber.api.java.ru.Тогда;
import pages.FullCreditHistoryPage;

public class FullCreditHistoryPageStepDefinitions extends Base {

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
