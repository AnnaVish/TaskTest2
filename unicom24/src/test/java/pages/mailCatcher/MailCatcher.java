package pages.mailCatcher;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.Auth.AuthPage;
import pages.commonElementsForAllPages.UserData;
import pagesUrls.PagesUrls;


public class MailCatcher extends Base {
//    @FindBy(xpath = "//a[@href='/messages/1.html']")
    @FindBy(xpath = "//li[@class='format tab html']")
    private WebElement htmlButton;

//    @FindBy(xpath = "//a[@href='/messages/1.source']")
    @FindBy(xpath = "//li[@class='format tab source']")
    private WebElement sourceButton;

//    @FindBy(xpath = "//a[contains(@href,'reset')]")
    @FindBy(xpath = "//a[contains(@href,'reset')]")
    private WebElement resetPasswordButton;

    public void latestEmailByToAndSubjectClick() throws InterruptedException {
        String latestEmailByToAndSubject = String.format("//tr[1]//td[contains(text(),'%s')]/following-sibling::td[text()='Сброс пароля пользователя']", UserData.correctEmail);
        WebElement targetElement = driver.findElement(By.xpath(latestEmailByToAndSubject));
        targetElement.click();
        Thread.sleep(1000);


        driver.findElement(By.xpath("//li[@class='format tab source']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[@class='format tab html']")).click();
        Thread.sleep(1000);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//a[contains(@href,'reset')]")).click();
        waitForVisibility(By.xpath("//div[@class='ui-authorization-form ui-authorization-form-flex']"));
//        Thread.sleep(1000);
//        driver.switchTo().defaultContent();
//        sourceButton.click();
//        htmlButton.click();
//        Thread.sleep(1000);
//        resetPasswordButton.click();
    }
}