import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashedHeadsets = 0;
        int trashedMice = 0;
        int trashedKeyboards = 0;
        int trashedDisplays = 0;

        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                trashedHeadsets++;
            }
            if (i % 3 == 0) {
                trashedMice++;
            }
            if (i % 6 == 0) {
                trashedKeyboards++;
                if (trashedKeyboards % 2 == 0) {
                    trashedDisplays++;
                }
            }
        }
        double totalSum = (trashedHeadsets * headsetPrice)
                + (trashedMice * mousePrice)
                + (trashedDisplays * displayPrice)
                + (trashedKeyboards * keyboardPrice);

        System.out.printf("Rage expenses: %.2f lv", totalSum);
    }
}
