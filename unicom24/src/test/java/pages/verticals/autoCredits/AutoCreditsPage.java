package pages.verticals.autoCredits;

import TestContext.TestContext;
import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;
import pages.verticals.common.CommonElementsForAllVerticals;
import pagesUrls.PagesUrls;

import java.util.Arrays;
import java.util.List;

public class AutoCreditsPage extends Base {

    Header headerPage = new Header();
    Footer footerPage = new Footer();
    CommonElementsForAllVerticals common = new CommonElementsForAllVerticals();


    //@FindBy(css = ".offers-list-row .offer-online") - отсутствует на странице на период 10.01.2020
    //private WebElement getCreditBtn;

    @FindBy(css = ".form-offers-small .form-one")
    private WebElement formOffer;

    @FindBy(xpath = "//button[@class='filters-btns__btn filters-btns__reset default medium']")
    private WebElement btnResetToDefault; // Кнопка Сбросить в боди страницы

    /*
    // h2 элементы начало
    @FindBy(xpath = "//h2[contains(text(), 'Автокредит: преимущества оформления кредита на автомобиль')]")
    private WebElement h2Seo1;

    @FindBy(xpath = "//h2/strong[contains(text(), 'Основные виды автокредита')]")
    private WebElement h2Seo2;

    @FindBy(xpath = "//h2/strong[contains(text(), 'Основные требования при оформлении автокредитов')]")
    private WebElement h2Seo3;

    @FindBy(xpath = "//h2/strong[contains(text(), 'Популярные условия автокредита')]")
    private WebElement h2Seo4;

    @FindBy(xpath = "//h2/strong[contains(text(), 'Как получить автокредит?')]")
    private WebElement h2Seo5;
    // h2 элементы конец */

    @FindBy(xpath = "//div[@class='col-12']/h2")
    private List<WebElement> h2SeoElements;

    public final List<WebElement> elements;
    //public final List<WebElement> h2Elements;

    public AutoCreditsPage() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, footerPage);
        PageFactory.initElements(driver, common);
        elements = Arrays.asList(//getCreditBtn,
                formOffer, common.logo,
                //common.rating,
                common.title,
                //common.ratePerYear, common.payPerMonth, common.time, common.neededPaying,
                //common.license,
                btnResetToDefault
                );
        //h2Elements = Arrays.asList(h2Seo1, h2Seo2, h2Seo3, h2Seo4, h2Seo5);
    }

    public void onAutoCreditsPage(){
        driver.get(PagesUrls.privateAutoCreditsPageUrl());
        TestContext.checkRedirectUrl = PagesUrls.privateAutoCreditsPageUrl();
    }

    public void pageIsDisplayed() {
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(elements);
        allElementsAreVisible(footerPage.getFooter());
        Header.checkBreadCrumbs(2);
    }

    public Boolean offersOnPageMore0(){
        return driver.findElements(By.xpath("//div[@class='offer-item-new wrapper']")).size() > 0;
    }

    public Boolean checkH2SeoElements(){
        return h2SeoElements.size() == 5;
    }

}
