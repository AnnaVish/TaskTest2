package hooks;

import base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import properties.BaseProperties;

import java.util.HashMap;

public class Hooks extends Base {

    @Before
    public void setup() {
        if (SystemUtils.IS_OS_LINUX) {
            System.setProperty("webdriver.chrome.driver", BaseProperties.driverDirLinux );

        } else {
            System.setProperty("webdriver.chrome.driver", BaseProperties.driverDir);
        }
        HashMap<String,Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("plugins.always_open_pdf_externally", true);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs", chromePrefs);
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
