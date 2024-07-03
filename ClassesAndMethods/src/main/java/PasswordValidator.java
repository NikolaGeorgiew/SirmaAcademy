import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean isValid = passwordValidator(password);
        if (isValid) {
            System.out.println("Password is valid");
        }
    }
    public static boolean passwordValidator(String password) {
        boolean isValid = true;
        if (!isLengthValid(password)) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }
        if (!containsOnyLettersAndDigits(password)) {
            System.out.println("Password must contain only letters and digits");
            isValid = false;
        }
        if (!hasAtLeastTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }
        return isValid;
    }

    public static boolean isLengthValid(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }
    public static boolean containsOnyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }
    public static boolean hasAtLeastTwoDigits(String password) {
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
        }
        return digitCount >= 2;
    }
}
