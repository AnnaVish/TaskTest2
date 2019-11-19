package pages.banki;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;

import java.util.Arrays;
import java.util.List;

public class DetailBankPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();

    @FindBy(xpath = "//a[@class='ui-card-offer-cards-item']")
    private WebElement activeOffer;

    @FindBy(xpath = "//div[contains(@class, 'ui-forms-bank-detail-header-bottom ')]/a[2]")
    private WebElement feedBackBtn;

    @FindBy(css = ".ui-forms-bank-detail-review")
    private WebElement feedBack;

    public final List<WebElement> elements;

    public DetailBankPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        elements = Arrays.asList(activeOffer, feedBackBtn);
        headerPage.getMainHeader();
        footerPage.getFooter();

    }

    public void pageIsDisplayed() {
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(elements);
        allElementsAreVisible(footerPage.getFooter());
    }

    public void clickFeedBack() {
        waitForVisibility(feedBackBtn);
        waitToBeClickable(feedBackBtn);
        feedBackBtn.click();
    }

    public void checkCountOfFeedBack() {
        waitForAjaxElementIsVisible(feedBack);
        String countOfFeedbackText = driver.findElement(By.xpath("//div[contains(@class, 'ui-forms-bank-detail-header-bottom ')]/a[2]/span")).getText();
        int countOfFeedbackValue = Integer.parseInt(countOfFeedbackText);
        int actualCountOfFeedBack = driver.findElements(By.cssSelector(".ui-forms-bank-detail-review")).size();
        Assert.assertEquals(countOfFeedbackValue, actualCountOfFeedBack);
    }
}
