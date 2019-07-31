package hooks;

import base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import properties.BaseProperties;

public class Hooks extends Base {

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
