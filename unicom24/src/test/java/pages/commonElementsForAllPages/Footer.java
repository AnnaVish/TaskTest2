package pages.commonElementsForAllPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Footer {

    /*
     *Футэр начался
     */
    @FindBy(css = ".container .footer-wrapper")
    public WebElement footerContainer;

    @FindBy(css = ".footer-wrapper .left-block")
    public WebElement footerLeftSide;

    @FindBy(css = ".footer-wrapper .left-block-item-mobile")
    public WebElement appleAndGoogle;

    @FindBy(css = ".footer-wrapper .right-block")
    public WebElement footerSeoText;

    @FindBy(xpath = "//div[./a]/a[contains(text(), 'Стать партнером')]")
    public WebElement becomePartnerLink;

    @FindBy(xpath = "//div[./a]/a[contains(text(), 'Стать агентом')]")
    public WebElement becomeAgentLink;

    @FindBy(xpath = "//div[./a]/a[contains(text(), 'Личный кабинет Брокера и Агента')]")
    public WebElement cabinetOfBroker;

    @FindBy(xpath = "//div[./a]/a[contains(text(), 'Личный кабинет Банков и Рекламодателей')]")
    public WebElement cabinetOfBank;

    @FindBy(xpath = "//div[./a]/a[contains(text(), 'Личный кабинет Вебмастеров')]")
    public WebElement cabinetOfWebmaster;

    @FindBy(xpath = "//div[./a]/a[contains(text(), 'Старый кабинет брокера и агента')]")
    public WebElement oldCabinetOfBroker;
    /*
     *Футэр окончен
     */

}
