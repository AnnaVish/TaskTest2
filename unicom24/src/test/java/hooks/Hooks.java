package hooks;

import base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import properties.BaseProperties;

public class Hooks extends Base {

    @Before
    public void setup() {
        System.out.println(PagesUrls.mainPage);
        if (SystemUtils.IS_OS_LINUX) {
            System.setProperty("webdriver.chrome.driver", BaseProperties.driverDirLinux );

        } else {
            System.setProperty("webdriver.chrome.driver", BaseProperties.driverDir);
        }
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--no-sandbox");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
