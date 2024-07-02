import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int countDigits = Integer.toString(n).length();

        for (int i = 1; i <= countDigits ; i++) {
            int currentNumb = (n % 10);
            if (currentNumb == 0) {
                System.out.print("ZERO");

            }
            for (int j = 1; j <= currentNumb; j++) {
                int asciiSymbol = currentNumb + 33;
                char symbol = (char) asciiSymbol;
                    System.out.print(symbol);
            }
            System.out.println();
            n = n / 10;
        }
    }
}
