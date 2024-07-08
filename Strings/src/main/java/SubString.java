import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String substringToMatch = scanner.nextLine();
        String input = scanner.nextLine();

        while (input.contains(substringToMatch)) {
            input = input.replace(substringToMatch, "");
        }

        System.out.println(input);
    }
}
