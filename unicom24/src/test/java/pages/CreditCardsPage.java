package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class CreditCardsPage extends TestBase {

    @FindBy(id = "kreditnye-karty_offerid2002059_img")
    private WebElement alfaCreditLogo;

    @FindBy(id = "kreditnye-karty_offerid2002059_btn")
    private WebElement alfaCreditBtn;

    @FindBy(id = "kreditnye-karty_offerid2002041_img")
    private WebElement vostochniyCreditLogo;

    @FindBy(id = "kreditnye-karty_offerid2002041_btn")
    private WebElement vostochniyCreditBtn;

    public final List<WebElement> elements;

    public CreditCardsPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(alfaCreditLogo, alfaCreditBtn, vostochniyCreditLogo, vostochniyCreditBtn);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
    }
}
