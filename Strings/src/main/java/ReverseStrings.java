import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                char symbol = input.charAt(i);
                stringBuilder.append(symbol);
            }
            System.out.println(input + " = " + stringBuilder.toString());
            input = scanner.nextLine();
        }
    }
}
