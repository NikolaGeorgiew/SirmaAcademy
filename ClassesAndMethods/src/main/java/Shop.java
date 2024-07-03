import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", calculatePrice(product,quantity));
    }

    public static double calculatePrice(String product, int quantity) {
        if (product.equals("coffee")){
            return 1.50 * quantity;
        } else if (product.equals("water")){
            return 1.00 * quantity;
        } else if (product.equals("coke")) {
            return 1.40 * quantity;
        } else {
            return 2.00 * quantity;
        }
    }
}
