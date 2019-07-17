package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class IpotekaPage extends TestBase {

    @FindBy(id = "ipoteka_offerid2002259_img")
    private WebElement  otkritieBankLogo;

    @FindBy(id = "ipoteka_offerid2002259_btn")
    private WebElement  otkritieBankBtn;

    @FindBy(id = "ipoteka_offerid2002278_img")
    private WebElement  finResurseLogo;

    @FindBy(id = "ipoteka_offerid2002278_btn")
    private WebElement  finResurseBtn;

    public final List<WebElement> elements;

    public IpotekaPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(otkritieBankLogo, otkritieBankBtn, finResurseLogo, finResurseBtn);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
    }
}
