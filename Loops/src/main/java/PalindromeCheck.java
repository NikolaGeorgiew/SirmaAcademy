import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

//        StringBuilder builder = new StringBuilder(input);
//        String reversedInput = builder.reverse().toString();
//        if (input.equals(reversedInput)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
        String reversedString = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString += input.charAt(i);
        }

        if (input.equals(reversedString)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
