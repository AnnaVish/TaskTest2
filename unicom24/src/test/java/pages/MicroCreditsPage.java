package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class MicroCreditsPage extends TestBase {

    @FindBy(id = "mikrozajmy_offerid2001336_img")
    private WebElement  zaymerLogo;

    @FindBy(id = "mikrozajmy_offerid2001336_btn")
    private WebElement  zaymerBtn;

    @FindBy(id = "mikrozajmy_offerid2001340_img")
    private WebElement  kapustaLogo;

    @FindBy(id = "mikrozajmy_offerid2001340_btn")
    private WebElement kapustaBtn;

    public final List<WebElement> elements;

    public MicroCreditsPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(zaymerLogo, zaymerBtn, kapustaLogo, kapustaBtn);
    }

    public void pageIsDisplyed() {
        allElementsAreVisible(elements);
    }
}
