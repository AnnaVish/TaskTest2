package pages.mailCatcher;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.UserData;


public class MailCatcher extends Base {
//    @FindBy(xpath = "//a[@href='/messages/1.html']")
    @FindBy(xpath = "//li[@class='format tab html']")
    private WebElement htmlButton;

//    @FindBy(xpath = "//a[@href='/messages/1.source']")
    @FindBy(xpath = "//li[@class='format tab source']")
    private WebElement sourceButton;

    @FindBy(xpath = "//a[contains(@href,'reset')]")
    private WebElement resetPasswordButton;

    public MailCatcher() {
        PageFactory.initElements(driver, this);
    }

    public void latestEmailByToAndSubjectClick() throws InterruptedException {
        String latestEmailByToAndSubject = String.format("//tr[1]//td[contains(text(),'%s')]/following-sibling::td[text()='Сброс пароля пользователя']", UserData.correctEmail);
        waitForPageLoaded("http://develop-34.vuaro.ru:1080/");
        WebElement targetElement = driver.findElement(By.xpath(latestEmailByToAndSubject));
        targetElement.click();
        sourceButton.click();
        htmlButton.click();
        driver.switchTo().frame(0);
        waitForVisibility(resetPasswordButton);
        resetPasswordButton.click();
        driver.switchTo().defaultContent();
    }
}