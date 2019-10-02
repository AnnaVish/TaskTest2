package pages.PartnerCabinetPage;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class RequestBinPage extends Base {

    @FindBy(css = "a[onclick=\"createBin()\"]")
    private WebElement createRequestBtn;

    @FindBy(css = "input.input-xxlarge")
    private WebElement input;

    private final List<WebElement>elements;

    public RequestBinPage(){
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(createRequestBtn, input);
    }

    public String getRequestBinUrl(){
        openNewTab();
        switchToTheSecondTab();
        driver.get("http://requestbin.net/");
        waitForVisibility(createRequestBtn);
        createRequestBtn.click();
        waitForVisibility(input);
        return input.getAttribute("value");
    }
}
