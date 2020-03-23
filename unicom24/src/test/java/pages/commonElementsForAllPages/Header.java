package pages.commonElementsForAllPages;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class Header extends Base {

    /*
     *Хэдэр
     */
    @FindBy(css = "a.ui-app-header-logo-wrapper")
    public WebElement logoLink;

    @FindBy(css = "span.ui-app-header-logo-wrapper") //хэдэр только на главной span
    public WebElement logoSpan;

    @FindBy(xpath = "//span[contains(text(), 'Частным клиентам')]")
    public WebElement privateCustomersLink;

    @FindBy(xpath = "//span[contains(text(), 'Малому и среднему бизнесу')]")
    public WebElement forBusinessLink;

    @FindBy(xpath = "//span[contains(text(), 'Сервисы')]")
    public WebElement servicesLink;

    @FindBy(xpath = "//span[contains(text(), 'Прочее')]")
    public WebElement othersLink;

    @FindBy(xpath = "//span[contains(text(), 'Кредиты')]")
    public WebElement creditsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Кредитные карты')]")
    public WebElement creditCardsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Автокредиты')]")
    public WebElement autoCreditsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Ипотека')]")
    public WebElement ipotekaHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Микрозаймы')]")
    public WebElement microCreditsHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Рефинансирование')]")
    public WebElement refinanceHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Банки')]")
    public WebElement bankiHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'МФО')]")
    public WebElement mfoHeaderLink;

    public List<WebElement> getMainHeader() {
        return Arrays.asList(logoLink, privateCustomersLink, othersLink, servicesLink,
                creditsHeaderLink, creditCardsHeaderLink, autoCreditsHeaderLink, ipotekaHeaderLink, refinanceHeaderLink);
    }

    public List<WebElement> getMainHeaderOnMainPage() {
        return Arrays.asList(logoSpan, privateCustomersLink, othersLink, servicesLink,
                creditsHeaderLink, creditCardsHeaderLink, autoCreditsHeaderLink, ipotekaHeaderLink, refinanceHeaderLink);
    }

    /*
     *Хэдэр окончен
     */

    /*
     *Хэдэр вкладки прочее
     */
    public List<WebElement> othersHeaderLinks() {
        return Arrays.asList(bankiHeaderLink, mfoHeaderLink); //blogHeaderLink - нет на странице на 10.01.2020
    }
    /*
     *Хэдэр вкладки прочее окончен
     */

    /*
     *Хэдэр вкладки Сервисы
     */
    public List<WebElement> servicesHeaderLinks() {
        return Arrays.asList(logoLink, privateCustomersLink, othersLink, servicesLink, fullCreditHistoryHeaderLink,
                finanicialHealthHeaderLink);
    }
    /*
     *Хэдэр вкладки Сервисы
     */

    /*
     *Хэдэр страницы сервисы
     */


    @FindBy(xpath = "//span[contains(text(), 'Полная кредитная история')]")
    public WebElement fullCreditHistoryHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'Финансовое здоровье')]")
    public WebElement finanicialHealthHeaderLink;

    @FindBy(xpath = "//span[contains(text(), 'FICO')]")
    public WebElement ficioHeaderLink;

    /*
     *Хэдэр страницы сервисы окончен
     */

    /*
    *Хэдэр страницы малому и среднему бизнесу
     */
    @FindBy(xpath = "//span[contains(text(), 'Банковские гарантии')]")
    public WebElement bankGuaranteesLink;

    @FindBy(xpath = "//span[contains(text(), 'Расчетные счета')]")
    public WebElement settlementAccountLink;

    @FindBy(xpath = "//span[contains(text(), 'Кредиты малому и среднему бизнесу')]")
    public WebElement businessLoansLink;
    /*
     *Хэдэр страницы малому и среднему бизнесу
     */

    /*
     * Метод проверки отсутсвия ХК в вертикалях
     */
//    public static void breadcrumbsAreNotAppear() {
//        Assert.assertEquals(0, driver.findElements(By.cssSelector("ul.ui-breadcrumbs-list  li")).size());
//    }

    public static void checkBreadCrumbs(int countOfBreadCrumbs) {
        sa.assertEquals(countOfBreadCrumbs, driver.findElements(By.xpath("//ul[contains(@class, 'ui-breadcrumbs-list')]/li[not(contains(@class, 'ui-breadcrumbs-item-img'))][./*[contains(text(), '')]]")).size());
    }

    //проверка ХК в подробной странице микрозайма
    public static void checkBreadCrumbsMicroCreditsDetailedPage(int countOfBreadCrumbs) {
        sa.assertEquals(countOfBreadCrumbs, driver.findElements(By.cssSelector(".offer-detail-qiwi-breadcrumbs a")).size());
    }
}
