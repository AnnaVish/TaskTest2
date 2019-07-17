package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class AutoCreditsPage extends TestBase {

    @FindBy(id = "avtokredity_offerid2001958_img")
    private WebElement creditEuropaBankLogo;

    @FindBy(id = "avtokredity_offerid2001958_btn")
    private WebElement creditEuropaBankBtn;

    @FindBy(id = "avtokredity_offerid2002215_img")
    private WebElement europlanLogo;

    @FindBy(id = "avtokredity_offerid2002215_btn")
    private WebElement europlanBtn;

    public final List<WebElement> elements;

    public AutoCreditsPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(creditEuropaBankLogo, creditEuropaBankBtn, europlanLogo, europlanBtn);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
    }

}
