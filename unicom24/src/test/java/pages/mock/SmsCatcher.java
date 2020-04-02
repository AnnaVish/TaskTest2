package pages.mock;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.UserData;


public class SmsCatcher extends Base {
    @FindBy(xpath = "//li[@class='format tab html']")
    private WebElement htmlButton;

    @FindBy(xpath = "//li[@class='format tab source']")
    private WebElement sourceButton;

    @FindBy(xpath = "//a[contains(@href,'reset')]")
    private WebElement resetPasswordButton;

    public SmsCatcher() {
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
}