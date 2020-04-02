package pages.mock;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.UserData;
import pagesUrls.PagesUrls;
import testContext.TestContext;

import java.util.HashMap;
import java.util.Map;


public class MailCatcher extends Base {
    @FindBy(xpath = "//li[@class='format tab html']")
    private WebElement htmlButton;

    @FindBy(xpath = "//li[@class='format tab source']")
    private WebElement sourceButton;

    @FindBy(xpath = "//a[contains(@href,'reset')]")
    private WebElement resetPasswordButton;

    public MailCatcher() {
        PageFactory.initElements(driver, this);
    }

    public void latestEmailByToAndSubjectClick() {
        String latestEmailByToAndSubject = String.format("//tr[1]//td[contains(text(),'%s')]/following-sibling::td[text()='Сброс пароля пользователя']", UserData.correctEmail);
        WebElement targetElement = driver.findElement(By.xpath(latestEmailByToAndSubject));
        targetElement.click();
        sourceButton.click();
        htmlButton.click();
        driver.switchTo().frame(0);
        waitForVisibility(resetPasswordButton);
        resetPasswordButton.click();
        driver.switchTo().defaultContent();
    }

    public static Map<String, String> emailServerLink() {
        Map<String, String> emailServer = new HashMap<>();
        if (PagesUrls.base.equals("pre-prod.vuaro.ru")) {
            emailServer.put("emailServer", "http://pre-prod-01.vuaro.ru:1080/");
            return emailServer;
        } else {
            emailServer.put("emailServer", "http://" + PagesUrls.base + ":1080");
            return emailServer;
        }
    }

    public void changePasswordByEmail() {
        openNewTab();
        switchToTheSecondTab();
        TestContext.emailServerLink = MailCatcher.emailServerLink().get("emailServer");
        driver.get(TestContext.emailServerLink);
        waitForPageLoaded(TestContext.emailServerLink);
        waitForVisibility(By.xpath("//tbody/tr[1]"));
        latestEmailByToAndSubjectClick();
    }
}