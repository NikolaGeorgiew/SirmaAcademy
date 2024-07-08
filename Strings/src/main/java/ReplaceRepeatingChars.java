import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        char previousChar = input.charAt(0);
        result.append(previousChar);

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != previousChar) {
                result.append(currentChar);
                previousChar = currentChar;
            }
        }

        System.out.println(result.toString());
    }
}
