package hooks;

import testContext.TestContext;
import base.Base;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.asserts.SoftAssert;
import properties.BaseProperties;
import util.Browsers;
import util.WebDriverFactory;

import java.io.File;
import java.util.HashMap;

public class Hooks extends Base {

    Scenario scenario;

    private BaseProperties baseProperties = new BaseProperties();

    public static void deleteAllFilesFolder(String path) {
        for (File myFile : new File(path).listFiles())
            if (myFile.isFile()) myFile.delete();
    }

    @Before
    public void before(Scenario scenario) {
        System.out.println(scenario.getName());
        System.out.println(scenario.getSourceTagNames());
    }


    @Before
    public void setup() {
        baseProperties.createDownloadDirURL();
        HashMap<String,Object> chromePrefs = new HashMap<String, Object>();
        driver = WebDriverFactory.getDriver(Browsers.CHROME);
        if (SystemUtils.IS_OS_LINUX) {
            BaseProperties.createDownloadDir();
            chromePrefs.put("download.default_directory", baseProperties.createDownloadDirURL());
            deleteAllFilesFolder(baseProperties.createDownloadDirURL());

        } else {
            BaseProperties.createDownloadDir();
            chromePrefs.put("download.default_directory", baseProperties.createDownloadDirURL());
            deleteAllFilesFolder(baseProperties.createDownloadDirURL());
        }

        DesiredCapabilities capabilities = new DesiredCapabilities();

        ChromeOptions chromeOptions = new ChromeOptions();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        chromeOptions.setExperimentalOption("prefs", chromePrefs);
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--no-sandbox");
        driver.manage().window().maximize();
    }

    @Before
    public void setUpAssert() {
        sa = new SoftAssert();
    }

    @After
    public void test(){
        sa.assertAll();
        sa = new SoftAssert();
    }

    @After
    public void updateCountOfStart() {
        TestContext.countOfStart = 0;
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
