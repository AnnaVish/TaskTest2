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

    @FindBy(xpath = "//div[contains(text(), '© Юником24, ')]")
    public WebElement copyright;

    @FindBy(xpath = "//div[contains(text(), 'Все права защищены.')]")
    public WebElement copyrightText;

    @FindBy(xpath = "//li/a[@href=\"/become-partner\" and contains(text(), 'Стать партнером')]")
    public WebElement becomePartnerDown;

    @FindBy(xpath = "//li/a[@href=\"/agent\" and contains(text(), 'Стать агентом')]")
    public WebElement becomeAgentDown;

    @FindBy(xpath = "//li/a[@href=\"/media_files/politika_opd/\" and contains(text(), 'Политика в области персональных данных')]")
    public WebElement personalData;

    @FindBy(xpath = "//li/a[@href=\"/karta-sajta\" and contains(text(), 'Карта сайта')]")
    public WebElement map;

    @FindBy(xpath = "//div[1]/a[@href=\"mailto:support@unicom24.ru\" and contains(text(), 'support@unicom24.ru')]")
    public WebElement mail;

    @FindBy(xpath = "//div[./div[1]/a[@href=\"mailto:support@unicom24.ru\" and contains(text(), 'support@unicom24.ru')]]/div/div[contains(text(), '109240, г. Москва, Котельническая наб., д.17')]")
    public WebElement adress;
    /*
     *Футэр окончен
     */

}
