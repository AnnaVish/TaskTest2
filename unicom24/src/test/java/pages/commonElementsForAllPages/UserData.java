package pages.commonElementsForAllPages;

import java.util.Random;

public class UserData {

    public static String incorrectPhoneNumber = "1111111111";
    public static String unRegisteredUserPhone = "9111111114";
    public static String correctPhoneNumber = generatePhoneNumber();
    public static String phoneForChangePassword = "9200437169";

    private static int generateRandomInt() {
        double randomPhone = (int) (Math.random() * ((999999999 - 900000000) + 1) + 900000000);
        return (int) randomPhone;
    }

    private static String generatePhoneNumber() {
        return "9" + generateRandomInt();
    }

    public static String getFormatNumber() {
        return "7" + correctPhoneNumber;
    }

    public static String getFormatNumberPhoneForChangePassword() {
        return "7" + phoneForChangePassword;
    }
}
