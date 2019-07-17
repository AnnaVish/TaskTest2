package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class CreditsPage extends TestBase {
    @FindBy(id = "kredity_offerid2002039_img")
    private WebElement homeCreditLogo;

    @FindBy(id = "kredity_offerid2002039_btn")
    private WebElement homeCreditBtn;

    @FindBy(id = "kredity_offerid2002078_img")
    private WebElement promSvyazBankLogo;

    @FindBy(id = "kredity_offerid2002078_btn")
    private WebElement promSvyazBankBtn;

    @FindBy(id = "kredity_offerid2002040_img")
    private WebElement vostochiniyBankLogo;

    @FindBy(id = "kredity_offerid2002040_btn")
    private WebElement vostochiniyBankBtn;

    @FindBy(id = "kredity_offerid2002057_img")
    private WebElement alfaBankLogo;

    @FindBy(id = "kredity_offerid2002057_btn")
    private WebElement alfaBankBtn;

    @FindBy(id = "kredity_offerid2000967_img")
    private WebElement sovkomBankLogo;

    @FindBy(id = "kredity_offerid2000967_btn")
    private WebElement sovkomBankBtn;

    @FindBy(id = "kredity_offerid2002195_btn")
    private WebElement sovkomBankLargeSummBtn;

    @FindBy(id = "kredity_offerid2000968_img")
    private WebElement renesansLogo;

    @FindBy(id = "kredity_offerid2000968_btn")
    private WebElement renesansBtn;

    @FindBy(id = "kredity_offerid2001385_img")
    private WebElement otkritieLogo;

    @FindBy(id = "kredity_offerid2001385_btn")
    private WebElement otkritieBtn;

    @FindBy(id = "kredity_offerid2002183_img")
    private WebElement interpromLogo;

    @FindBy(id = "kredity_offerid2002183_btn")
    private WebElement interpromBtn;

    @FindBy(id = "kredity_offerid2002205_img")
    private WebElement raiffaisenLogo;

    @FindBy(id = "kredity_offerid2002205_btn")
    private WebElement raiffaisenBtn;

    public final List<WebElement> elements;

    public CreditsPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(homeCreditLogo, homeCreditBtn, promSvyazBankLogo, promSvyazBankBtn, vostochiniyBankLogo,
                vostochiniyBankBtn, alfaBankLogo, alfaBankBtn, sovkomBankLogo, sovkomBankBtn, sovkomBankLargeSummBtn,
                renesansLogo, renesansBtn, otkritieLogo, otkritieBtn, interpromLogo, interpromBtn, raiffaisenLogo,
                raiffaisenBtn);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(elements);
    }
}
