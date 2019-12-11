package pages;

import base.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.commonElementsForAllPages.Footer;
import pages.commonElementsForAllPages.Header;

import java.util.Arrays;
import java.util.List;

public class ComparePage extends Base {
    Header headerPage = new Header();
    Footer footerPage = new Footer();

    @FindBy(xpath = "//h1[contains(text(), 'Сравнение предложений')]")
    private WebElement pageTitle;

    @FindBy(xpath = "//div[@class='offers-compare-filters-extend-show-list-item-text' and contains(text(), 'Только различающиеся характеристики')]")
    private WebElement onlyDifferentCharacteristics;

    @FindBy(xpath = "//div[@class='offers-compare-filters-extend-show-list-item-text' and contains(text(), 'Все характеристики')]")
    private WebElement allCharacteristics;

    @FindBy(xpath = "//div[contains(text(), 'Нет предложений для сравнения')]")
    private WebElement noofferstext;

    private final List<WebElement>elements;

    public ComparePage(){
        PageFactory.initElements(driver, headerPage);
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, footerPage);
        elements = Arrays.asList(pageTitle, onlyDifferentCharacteristics, allCharacteristics, noofferstext);
    }

    public void pageIsDisplayed(){
        allElementsAreVisible(headerPage.getMainHeader());
        allElementsAreVisible(elements);
        allElementsAreVisible(footerPage.getFooter());
        int countOfCompareTabs = driver.findElements(By.cssSelector(".offers-compare-filters-list-item")).size();
        Assert.assertEquals(6, countOfCompareTabs);
    }

}
