package pages.commonElementsForAllPages;

import java.util.Random;

public class UserData {

    public static String incorrectPhoneNumber = "1111111111";
    public static String unRegisteredUserPhone = "9111111114";
    public static String correctPhoneNumber = generatePhoneNumber();
    public static String phoneForChangePassword = "9960180967";
    public static String incorrectMail = "Test@tt";
    public static String unregisteredEmail = "Test@tt.mm";
    public static String correctEmail = "a.s.san.17.8.939@yandex.ru";

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

    public static String getPhoneForRegistration() {
        return "7" + phoneForChangePassword;
    }
}
