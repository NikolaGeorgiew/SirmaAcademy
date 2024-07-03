import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatedString(input,count));
    }

    public static String repeatedString(String input, int count) {
        String newString = "";
        for (int i = 1; i <= count; i++) {
            newString += input;
        }
        return newString;
    }
}
