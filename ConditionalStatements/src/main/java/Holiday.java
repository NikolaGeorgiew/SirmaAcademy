import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String country = "";
        double amountSpend = 0;
        String typeOfHoliday = "";

        if (budget <= 100) {
            country = "Bulgaria";
            if (season.equals("summer")) {
                amountSpend = budget * 0.3;
                typeOfHoliday = "Camp";
            } else if (season.equals("winter")) {
                amountSpend = budget * 0.7;
                typeOfHoliday = "Hotel";
            }
        } else if (budget <= 1000) {
            country = "Europe";
            if (season.equals("summer")) {
                amountSpend = budget * 0.4;
                typeOfHoliday = "Camp";
            } else if (season.equals("winter")) {
                amountSpend = budget * 0.8;
                typeOfHoliday = "Hotel";
            }
        } else if (budget > 1000) {
            country = "Asia";
            amountSpend = budget * 0.9;
            typeOfHoliday = "Hotel";
        }

        System.out.printf("Somewhere in %s", country);
        System.out.println();
        System.out.printf("%s - %.2f", typeOfHoliday, amountSpend);

    }
}
