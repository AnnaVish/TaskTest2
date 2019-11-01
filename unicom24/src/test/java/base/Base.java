package base;

import org.checkerframework.checker.units.qual.C;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagesUrls.PagesUrls;
import properties.BaseProperties;

import java.io.File;
import java.util.*;

public abstract class Base {

    /**
     * Default timeout for waiting
     */
    private static final int ELEMENT_TIMEOUT_SECONDS = 20;

    protected static WebDriver driver;
    public JavascriptExecutor js = (JavascriptExecutor) driver;

    private static boolean isElementPresented(WebElement element) {
        try {
            element.getTagName();
            return true;
        } catch (Exception e) {

        }
        return false;
    }

    /**
     * @param element is element to check
     * @return true i element is visible, otherwise false
     */
    protected static Boolean isElementVisible(WebElement element) {
        if (!isElementPresented(element)) {
            return false;
        }

        WebDriverWait wait = new WebDriverWait(driver, 0);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Throwable th) {
            return false;
        }
        return true;
    }

    public void allElementsAreVisible(List<WebElement> elements) {
        for (WebElement webElement : elements) {
            waitForVisibility(webElement);
        }
    }

    protected void typeIntoField(String value, WebElement input) {
        input.clear();
        input.sendKeys(value);
    }

    protected void scrollTo(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    public static void waitForVisibility(WebElement element) {
        waitForVisibility(element, ELEMENT_TIMEOUT_SECONDS);
    }

    protected static void waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected static void waitForVisibility(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, ELEMENT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected static void waitForInvisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, ELEMENT_TIMEOUT_SECONDS);
        try {
            wait.until(elementIsNotVisible(element));
        } catch (NoSuchElementException | StaleElementReferenceException e) {
        }
    }

    protected static WebElement waitToBeClickable(By selector) {
        return new WebDriverWait(driver, ELEMENT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(selector));
    }

    protected static WebElement waitToBeClickable(WebElement webElement) {
        return new WebDriverWait(driver, ELEMENT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public static void waitForPageLoaded(String pagePartialUrl) {
        WebDriverWait wait = new WebDriverWait(driver, ELEMENT_TIMEOUT_SECONDS);
        wait.until(pageLoaded(pagePartialUrl));
    }

    protected static void waitForText(WebElement element, String text) {
        WebDriverWait wait = new WebDriverWait(driver, ELEMENT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    static ExpectedCondition<Boolean> pageLoaded(String pagePartialUrl) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return driver -> (js.executeScript("return window.location.href").toString().contains(pagePartialUrl) &&
                js.executeScript("return document.readyState").equals("complete"));
    }

    static ExpectedCondition<Boolean> elementIsNotVisible(final WebElement element) {
        return driver -> !element.isDisplayed();
    }

    public static void openNewTab() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open();");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public static void switchToTheFirstTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
    }

    public static void switchToTheSecondTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void closeTab() {
        driver.close();
    }

    public static void refreshPage() {
        driver.navigate().refresh();
    }

    public static long folderSize(File directory) {
        long length = 0;
        for (File file : directory.listFiles()) {
            if (file.isFile())
                length += file.length();
            else
                length += folderSize(file);
        }
        return length;
    }

    public static String getFileExtension(File directory) {
        File[] fileList = directory.listFiles();
        String fileName = fileList[0].getName();
        // если в имени файла есть точка и она не является первым символом в названии файла
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
            return fileName.substring(fileName.lastIndexOf(".") + 1);
            // в противном случае возвращаем заглушку, то есть расширение не найдено
        else return "";
    }

    public void waitForUrlContains(String url) {
        WebDriverWait wait = new WebDriverWait(driver, ELEMENT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.urlContains(url));
    }

    public void waitForUrlEquals(String url) {
        WebDriverWait wait = new WebDriverWait(driver, ELEMENT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.urlToBe(url));
    }

    public void waitForAjaxElementIsVisible(WebElement element) {
        try {
            waitForVisibility(element);
        } catch (NoSuchElementException e) {

        }
    }

    public WebElement waitForAjaxElementIsVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, ELEMENT_TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement element = driver.findElement(locator);
        waitForVisibility(element);
        return element;
    }
}
