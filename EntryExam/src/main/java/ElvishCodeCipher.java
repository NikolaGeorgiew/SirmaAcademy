import java.awt.print.Pageable;
import java.util.Scanner;

public class ElvishCodeCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.toCharArray()[i];
            int asciiCodeNewSymbol = (int) symbol;
            char newSymbol = (char) (asciiCodeNewSymbol - n);
            stringBuilder.append(newSymbol);
        }
        System.out.println(stringBuilder.toString());
    }
}
