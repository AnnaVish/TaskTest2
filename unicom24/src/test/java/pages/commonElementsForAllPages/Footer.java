package pages.commonElementsForAllPages;

import TestContext.TestContext;
import base.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

import static base.Base.isElementVisible;

public class Footer extends Base {

    /*
     *Футэр начался
     */
    @FindBy(className = "app-footer")
    private WebElement footerContainer;

    @FindBy(css = ".app-footer .app-footer-main-content-logo ")
    private WebElement footerLogo;

    @FindBy(css = ".app-footer-main-links-title")
    private List<WebElement> footerTitles; //3 штука

    @FindBy(css = ".app-footer-main-links-list a")
    private List<WebElement> footerLinks; //12 штука

    @FindBy(css = ".app-footer-social-links-item")
    private List<WebElement> socialBtn; // 4

    @FindBy(css = ".app-footer-products-item")
    private List<WebElement> downLinks; // 5 штук

    @FindBy(className = "app-footer-extend")
    private WebElement footerText;

    @FindBy(xpath = "//a[./span[contains(text(), 'Стать партнером')]]")
    public WebElement becomePartnerLink;

    @FindBy(xpath = "//a[./span[contains(text(), 'Стать агентом')]]")
    public WebElement becomeAgentLink;

    /*
     *Футэр окончен
     */

    public List<WebElement> getFooter() {
        /* Здесь в трай кэч закоментирован код который убирает дурацкий попап "Расскажите о себе"
        его включают в админке,
        это аджакс элемент - проверка на него удлиняет тесты в два раза, поэтому если он выключен, то лучше даже
        не проверять. Раскомментировать если врубят.

        if(TestContext.countOfStart == 0) {
            try {
                waitForAjaxElementIsVisible(enpopElement);
                clickOnAjaxElement(enpopElement);
                TestContext.countOfStart++;
            } catch (Exception ignore) {

            }
        }
         */
        Assert.assertEquals(3, footerTitles.size());
        Assert.assertEquals(12, footerLinks.size());
        Assert.assertEquals(4, socialBtn.size());
        Assert.assertEquals(5, downLinks.size());
        return Arrays.asList(footerContainer, footerLogo, footerText, becomePartnerLink, becomeAgentLink);
    }


}
