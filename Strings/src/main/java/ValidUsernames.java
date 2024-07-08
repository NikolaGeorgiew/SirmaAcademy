import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        List<String> validUsernames = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            String username = input[i];
            boolean isValid = true;
            if (username.length() >= 3 && username.length() <= 16) {
                for (int j = 0; j < username.length(); j++) {
                    char symbol = username.charAt(j);
                    if (!Character.isLetter(symbol) && !Character.isDigit(symbol) && symbol != '-' && symbol != '_') {
                        isValid = false;
                        break;
                    }
                }
                if (isValid) {
                    validUsernames.add(username);

                }
            }
        }

        for (String el :
                validUsernames) {
            System.out.println(el);
        }
    }
}
