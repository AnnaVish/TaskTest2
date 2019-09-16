package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class AutoCreditsPage extends Base {

    @FindBy(css = ".offers-list-row .offer-online")
    private WebElement getCreditBtn;

    @FindBy(css = ".form-offers-small .form-one")
    private WebElement formOffer;

    public final List<WebElement> elements;

    public AutoCreditsPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(getCreditBtn, formOffer);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
    }

    public Boolean offersOnPageMore5(){
        return driver.findElements(By.cssSelector(".offers-list-row .offer-item__wrapper")).size() > 5;
    }

}
