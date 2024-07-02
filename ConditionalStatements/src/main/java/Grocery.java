import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double priceTea = 0;
        double priceWater = 0;
        double priceJuice = 0;
        double priceSweets = 0;
        double priceChips = 0;
        double result = 0;

        switch (city) {
            case "Sofia":
                if (product.equals("tea")) {
                    priceTea = 0.50;
                    result = quantity * priceTea;
                } else if (product.equals("water")) {
                    priceWater = 0.80;
                    result = quantity * priceWater;
                } else if (product.equals("juice")) {
                    priceJuice = 1.20;
                    result = quantity * priceJuice;
                } else if (product.equals("sweets")) {
                    priceSweets = 1.45;
                    result = quantity * priceSweets;
                } else if (product.equals("chips")) {
                    priceChips = 1.60;
                    result = quantity * priceChips;
                }
                break;
            case "Plovdiv":
                if (product.equals("tea")) {
                    priceTea = 0.40;
                    result = quantity * priceTea;
                } else if (product.equals("water")) {
                    priceWater = 0.70;
                    result = quantity * priceWater;
                } else if (product.equals("juice")) {
                    priceJuice = 1.15;
                    result = quantity * priceJuice;
                } else if (product.equals("sweets")) {
                    priceSweets = 1.30;
                    result = quantity * priceSweets;
                } else if (product.equals("chips")) {
                    priceChips = 1.50;
                    result = quantity * priceChips;
                }
                break;
            case "Varna":
                if (product.equals("tea")) {
                    priceTea = 0.45;
                    result = quantity * priceTea;
                } else if (product.equals("water")) {
                    priceWater = 0.70;
                    result = quantity * priceWater;
                } else if (product.equals("juice")) {
                    priceJuice = 1.10;
                    result = quantity * priceJuice;
                } else if (product.equals("sweets")) {
                    priceSweets = 1.35;
                    result = quantity * priceSweets;
                } else if (product.equals("chips")) {
                    priceChips = 1.55;
                    result = quantity * priceChips;
                }
                break;
        }

        System.out.printf("%.2f", result);
    }
}
