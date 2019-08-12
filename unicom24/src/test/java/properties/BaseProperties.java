package properties;

public class BaseProperties {
    static String baseDir = System.getProperty("user.dir");
    public static String driverDir = baseDir + "/src/drivers/chromedriver.exe";
    public static String driverDirLinux = baseDir + "/src/drivers/chromedriver";
    public static String pictureDir = baseDir + "/src/test/java/pics/344.jpg";
}
