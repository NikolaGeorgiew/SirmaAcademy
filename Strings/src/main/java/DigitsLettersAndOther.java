import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (Character.isLetter(symbol)) {
                letters.append(symbol);
            } else if (Character.isDigit(symbol)) {
                digits.append(symbol);
            } else {
                other.append(symbol);
            }
        }
        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(other.toString());
    }
}
