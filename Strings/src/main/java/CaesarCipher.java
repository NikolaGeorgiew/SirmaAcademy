import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder newText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            int symbolAsInt = (int) symbol;
            char newSymbol = (char) (symbolAsInt + 3);
            newText.append(newSymbol);
        }

        System.out.println(newText.toString());
    }
}
