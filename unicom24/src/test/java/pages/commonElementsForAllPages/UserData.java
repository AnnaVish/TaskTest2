package pages.commonElementsForAllPages;

import java.util.Random;

public class UserData {

    public static String incorrectPhoneNumber = "1111111111";
    public static String correctPhoneNumber = generatePhoneNumber();

    private static int generateRandomInt() {
        Random random = new Random();
        return random.nextInt(999999999);
    }

    private static String generatePhoneNumber() {
        return "9" + generateRandomInt();
    }

    public static String getFormatNumber() {
        return "7" + correctPhoneNumber;
    }
}
