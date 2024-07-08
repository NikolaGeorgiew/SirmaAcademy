import java.util.Scanner;

public class PascalCaseSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("(?=[A-Z])");
        String result = String.join(", ", words);

        System.out.println(result);
    }
}
