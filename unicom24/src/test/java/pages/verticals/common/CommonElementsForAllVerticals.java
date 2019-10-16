package pages.verticals.common;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonElementsForAllVerticals extends Base {

    @FindBy(css = "div.block-logo-top-img")
    public WebElement logo;

    @FindBy(css = "div.block-logo-rating")
    public WebElement rating;

    @FindBy(css = ".block-content-title a")
    public WebElement title;

    @FindBy(xpath = "//div[contains(text(), 'Ставка в год')]")
    public WebElement ratePerYear;

    @FindBy(xpath = "//div[contains(text(), 'Платеж в месяц')]")
    public WebElement payPerMonth;

    @FindBy(xpath = "//div[contains(text(), 'Время рассмотрения')]")
    public WebElement time;

    @FindBy(xpath = "//div[contains(text(), 'Требуемый рейтинг')]")
    public WebElement neededRating;

    @FindBy(xpath = "//div[contains(text(), 'Лицензия ЦБ')]")
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
