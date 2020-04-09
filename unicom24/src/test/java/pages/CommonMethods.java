package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.auth.AuthPage;

public class CommonMethods extends Base {
    public CommonMethods() {
        PageFactory.initElements(driver, this);
    }

    public void logIn(WebElement loginField, WebElement passwordField, WebElement entranceLink) {
        /*
         *Здесь происходит неведомая хрень - селениум путает буквы при вооде, строго на этой странице на сайте
         * пришлось обходить это циклом, что пока значение в поле не будет правильным, пиши заново
         */
        while (!loginField.getAttribute("value").equals(AuthPage.login)) {
            clearField(loginField);
            typeIntoField(AuthPage.login, loginField);
        }
        while (!passwordField.getAttribute("value").equals(AuthPage.password)) {
            clearField(passwordField);
            typeIntoField(AuthPage.password, passwordField);
        }
        entranceLink.click();
    }
}
