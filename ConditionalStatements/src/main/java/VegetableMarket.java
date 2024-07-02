import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String vegetable = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double result = 0;
        boolean isError = false;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (vegetable.equals("tomato")) {
                    result = quantity * 2.50;
                } else if (vegetable.equals("onion")) {
                    result = quantity * 1.20;
                } else if (vegetable.equals("lettuce")) {
                    result = quantity * 0.85;
                } else if (vegetable.equals("cucumber")) {
                    result = quantity * 1.45;
                } else if (vegetable.equals("pepper")){
                    result = quantity * 5.50;
                } else {
                    isError = true;
                    System.out.println("Error");
                }
                break;
            case "Saturday":
            case "Sunday":
                if (vegetable.equals("tomato")) {
                    result = quantity * 2.80;
                } else if (vegetable.equals("onion")) {
                    result = quantity * 1.30;
                } else if (vegetable.equals("lettuce")) {
                    result = quantity * 0.85;
                } else if (vegetable.equals("cucumber")) {
                    result = quantity * 1.75;
                } else if (vegetable.equals("pepper")){
                    result = quantity * 3.50;
                } else {
                    isError = true;
                    System.out.println("Error");
                }
                break;
            default:
                isError = true;
                System.out.println("Error");
                break;
        }
        if (!isError){
            System.out.printf("%.2f", result);
        }
    }
}
