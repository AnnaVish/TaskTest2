package pages.verticals.common;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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


}
