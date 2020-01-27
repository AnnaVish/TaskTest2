package pages.PartnerCabinetPage.modalPages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class GiveMoney extends Base {

    @FindBy(xpath = "//div[@class='cash-modal-view']")
    private WebElement modalPageHowMuchMoney;

    @FindBy(xpath = "//div[@class='cash-modal-money-input-button cash-modal-money-input-button-left']")
    private WebElement modalPagePlusBTN;

    @FindBy(xpath = "//button[@class='cash-modal-button cash-modal-money-button']")
    private WebElement modalPageNextStepBTN;

    @FindBy(xpath= "//div[@class='cash-modal-buttons-wrap']/div[contains(text(), 'Расчетный счет')]")
    private WebElement modalPageFirstMethodBTN;

    @FindBy(xpath = "//button[@class='cash-modal-button cach-payment-method-button ng-scope']")
    private WebElement modalPageGiveMoneyBTN;

    @FindBy(xpath = "//div[@class='cach-payment-send-money']")
    private WebElement modalPageSuccessfulText;

    @FindBy(xpath = "//button[@class='cash-modal-button cach-payment-method-button']")
    private WebElement modalPageExitBTN;

    private final List<WebElement> elements;

    public GiveMoney(){
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(modalPageHowMuchMoney, modalPagePlusBTN, modalPageNextStepBTN);
    }

    public void modalPageIsDisplayed(){
        allElementsAreVisible(elements);
    }

    public void modalPagePlusBTNClick(){
        modalPagePlusBTN.click();
    }

    public void modalPageNextStepBTNClick(){
        modalPageNextStepBTN.click();
    }

    public void modalPageNextStepIsDisplayed(){
        waitForVisibility(modalPageFirstMethodBTN);
    }

    public void modalPageFirstMethodBTNClick(){
        modalPageFirstMethodBTN.click();
    }

    public void modalPageGiveMoneyBTNClick(){
        modalPageGiveMoneyBTN.click();
    }

    public void modalPageSuccessfulTextIsDisplayed(){
        waitForVisibility(modalPageSuccessfulText);
        waitForVisibility(modalPageExitBTN);
    }

    public void modalPageClose(){
        modalPageExitBTN.click();
    }
}
