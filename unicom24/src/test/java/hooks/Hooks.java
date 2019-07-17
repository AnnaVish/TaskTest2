package hooks;

import base.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import properties.BaseProperties;

public class Hooks extends TestBase {

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", BaseProperties.driverDir );
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
