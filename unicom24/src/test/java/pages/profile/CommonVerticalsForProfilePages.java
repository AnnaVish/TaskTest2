package pages.profile;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class CommonVerticalsForProfilePages extends Base {

    String verticalMenuWayForButtons = "//div[@class='menu-buttons']";

    @FindBy(xpath = "//a[@class='balance']")
    private WebElement balanceProfile;

    @FindBy(xpath = "balance__value']")
    private WebElement balanceValueProfile;

    public List<WebElement> commonElements() {
        return Arrays.asList(balanceProfile, balanceValueProfile);
    }

    public void verticalPageClick(String nameVerticalPage){
        String xPathWay = String.format(verticalMenuWayForButtons + "/a[contains(text(), '%s')]",  nameVerticalPage);
        WebElement targetElement = driver.findElement(By.xpath(xPathWay));
        targetElement.click();
    }

    public void compareNumberOfVerticalsOnPage(){
        int countVerticals = driver.findElements(By.xpath(verticalMenuWayForButtons)).size();
        Assert.assertEquals(countVerticals, 1); // увеличить число когда вертикалки заработают
    }
}
