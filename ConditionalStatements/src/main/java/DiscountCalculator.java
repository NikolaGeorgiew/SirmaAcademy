import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String memberShipCard = scanner.nextLine();
        String result = "";

        if (age < 18) {
            result = "10% discount";
        } else if (age >= 18 && age <= 64) {
            if (memberShipCard.equals("Yes")) {
                result = "20% discount";
            } else {
                result = "10% discount";
            }
        } else if (age >= 65) {
            result = "30% discount";
        }
        System.out.println(result);
    }
}
