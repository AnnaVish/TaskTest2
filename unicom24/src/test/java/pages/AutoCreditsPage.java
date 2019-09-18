package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class AutoCreditsPage extends Base {

    /*
     *Хэдэр
     */
    @FindBy(css = "a.ui-app-header-logo-wrapper ")
    private WebElement logoLink;

    @FindBy(xpath = "//span[contains(text(), 'Частным клиентам')]")
    private WebElement privateCustomersLink;

    @FindBy(xpath = "//span[contains(text(), 'Малому и среднему бизнесу')]")
    private WebElement forBusinessLink;

    @FindBy(xpath = "//span[contains(text(), 'Сервисы')]")
    private WebElement servicesLink;

    @FindBy(xpath = "//span[contains(text(), 'Прочее')]")
    private WebElement othersLink;

    @FindBy(xpath = "//span[contains(text(), 'Кредиты')]")
    private WebElement creditsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Кредитные карты')]")
    private WebElement creditCardsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Автокредиты')]")
    private WebElement autoCreditsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Ипотека')]")
    private WebElement ipotekaHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Микрозаймы')]")
    private WebElement microCreditsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Рефинансирование')]")
    private WebElement refinanceHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Банки')]")
    private WebElement bankiHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'МФО')]")
    private WebElement mfoHeaderLink;

    /*
     *Хэдэр окончен
     */

    @FindBy(css = ".offers-list-row .offer-online")
    private WebElement getCreditBtn;

    @FindBy(css = ".form-offers-small .form-one")
    private WebElement formOffer;

    public final List<WebElement> elements;
    public final List<WebElement> header;

    public AutoCreditsPage() {
        PageFactory.initElements(driver, this);
        elements = Arrays.asList(getCreditBtn, formOffer);
        header = Arrays.asList(logoLink, privateCustomersLink, forBusinessLink, othersLink, servicesLink,
                creditsHeaderLink, creditCardsHeaderLink, autoCreditsHeaderLink, ipotekaHeaderLink, refinanceHeaderLink);
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(header);
        allElementsAreVisible(elements);
    }

    public Boolean offersOnPageMore5(){
        return driver.findElements(By.cssSelector(".offers-list-row .offer-item__wrapper")).size() > 5;
    }

}
