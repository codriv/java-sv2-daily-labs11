package day04;

public class Validators {

    public static void checkString(String name, String message) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(message + " can not be null or empty!");
        }
    }
}
