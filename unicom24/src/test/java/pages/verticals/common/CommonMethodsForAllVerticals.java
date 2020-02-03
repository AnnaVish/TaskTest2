package pages.verticals.common;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;


public class CommonMethodsForAllVerticals extends Base{
    CommonElementsForAllVerticals commonElementsAll = new CommonElementsForAllVerticals();

    public CommonMethodsForAllVerticals() {
        PageFactory.initElements(driver, this);
        PageFactory.initElements(driver, commonElementsAll);
        commonElementsAll.getElementsForChangeCity();
    }

    public void userChangeLocationCity(String selectCity){ // Метод выбора на странице дефолтного (Москва) город
        commonElementsAll.spanForSelectLocationCity.click();
        waitForVisibility(commonElementsAll.spanLocationCity);
        String xPathWay = String.format("//span[contains(text(), '%s')]",  selectCity);
        commonElementsAll.spanLocationCity.findElement(By.xpath(xPathWay)).click();
        // Заплатка на ожидание обновления страницы и изменения оферов
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void userEnterToProFilePage(){
        waitForVisibility(commonElementsAll.nameForDropProfileMenuBTN);
        commonElementsAll.nameForDropProfileMenuBTN.click();
        waitForVisibility(commonElementsAll.enterProfileBTN);
        commonElementsAll.enterProfileBTN.click();
    }
}