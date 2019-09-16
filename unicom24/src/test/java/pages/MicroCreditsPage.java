package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class MicroCreditsPage extends Base {

    @FindBy(css = ".offers-list-row .offer-online")
    private WebElement getCreditBtn;

    @FindBy(css = ".form-offers-small .form-one")
    private WebElement formOffer;

    public final List<WebElement> elements;

    public MicroCreditsPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(getCreditBtn, formOffer);
    }

    public void pageIsDisplyed() {
        allElementsAreVisible(elements);
    }

    public Boolean offersOnPageMore10(){
        return driver.findElements(By.cssSelector(".offers-list-row .offer-item__wrapper")).size() > 10;
    }
}
