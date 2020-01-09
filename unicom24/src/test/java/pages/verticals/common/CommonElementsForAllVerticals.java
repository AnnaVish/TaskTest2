package pages.verticals.common;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonElementsForAllVerticals extends Base {

    /*
    * Тута будут массивы
     */
    @FindBys({
            @FindBy(xpath = "//div[@class='button__wrapper']//span[contains(text(), 'Добавить в сравнение')]")
    })
    public List<WebElement> btnBankCreditAddToCompare;

    @FindBys({
            @FindBy(xpath = "//div[@class='offer-item-new wrapper']")
    })
    public List<WebElement> countOffersOnPage;

    @FindBys({
            @FindBy(xpath = "//div[@class='offers-compare-table-offer-header-controls-remove']")
    })
    public List<WebElement> btnBankCreditRemoveFromCompare;
    /*
    *Тута уже не будут массивы
     */
    @FindBy(xpath = "//a[@class='ui-app-header-logo-wrapper nuxt-link-active']")
    public WebElement logo;

    @FindBy(xpath = "//div[@class='rating']")
    public WebElement rating;

    @FindBy(xpath = "//a[@class='font__color-blue nuxt-link-active']")
    public WebElement title;

    @FindBy(xpath = "//div[contains(text(), 'Ставка в год')]")
    public WebElement ratePerYear;

    @FindBy(xpath = "//div[contains(text(), 'Платеж в месяц')]")
    public WebElement payPerMonth;

    @FindBy(xpath = "//div[contains(text(), 'Время рассмотрения')]")
    public WebElement time;

    @FindBy(xpath = "//div[contains(text(), 'Платеж в месяц')]")
    public WebElement neededPaying;

    @FindBy(xpath = "//div[@class='license hide-xxs']")
    public WebElement license;
    /*
    * Кредиты окончены
     */

    /*
    * отдельно для кредитных карт
     */

    @FindBy(xpath = "//div[contains(text(), 'Кредитный лимит')]")
    public WebElement creditLimit;

    @FindBy(xpath = "//div[contains(text(), 'Стоимость обслуживания')]")
    public WebElement cost;

    /*
     * отдельно для кредитных карт окончено
     */

    @FindBy(xpath = "//div[contains(text(), 'Переплата')]")
    public WebElement overpayment;

    @FindBy(xpath = "//div[contains(text(), 'Ставка в день')]")
    public WebElement payPerDay;

    /*
     *Персональный займ
     */
    @FindBy(css = ".container .form-one")
    public WebElement personalOfferContainer;

    @FindBy(css = "img[src=\"/_nuxt/img/201cb8d.png\"]")
    public WebElement giftPic;

    @FindBy(css = ".form-one .ui-input-new input")
    public WebElement personalOfferField;

    @FindBy(xpath = "//button[./span[contains(text(), 'Подобрать персональный займ')]]")
    public WebElement makeOfferBtn;

    @FindBy(xpath = "//div[contains(text(), 'Нажимая кнопку «Подобрать персональный займ»,  ')]")
    public WebElement ifYouText;

    @FindBy(xpath = "//a[@href=\"/media_files/agreement_registration/\" and contains(text(), 'вы соглашаетесь с условиями обработки данных')]")
    public WebElement agreeLink;
    /*
     *Персональный займ окончен
     */


}
