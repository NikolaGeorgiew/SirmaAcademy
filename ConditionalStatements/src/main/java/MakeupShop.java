import java.util.Scanner;

public class MakeupShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForRenovation = Double.parseDouble(scanner.nextLine());
        int powders = Integer.parseInt(scanner.nextLine());
        int lipsticks = Integer.parseInt(scanner.nextLine());
        int spirals = Integer.parseInt(scanner.nextLine());
        int shadows = Integer.parseInt(scanner.nextLine());
        int correctors = Integer.parseInt(scanner.nextLine());



        double sum = (powders * 2.60) + (lipsticks * 3) + (spirals * 4.10) + (shadows * 8.20) + (correctors * 2);
        int count = powders + lipsticks + spirals + shadows + correctors;

        if (count >= 50) {
            sum = sum * 0.75;
            sum = sum * 0.9;

        } else {
            sum = sum * 0.9;
        }

        if (sum >= priceForRenovation) {
            System.out.printf("Yes! %.2f lv left.", sum - priceForRenovation);
        } else {
            System.out.printf("Not enought money! %.2f lv needed.", Math.abs(priceForRenovation - sum));
        }
    }
}
