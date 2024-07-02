import java.util.Scanner;

public class ArchitecturealEraIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = Integer.parseInt(scanner.nextLine());
        String material = scanner.nextLine();
        String result = "";

        if (year < 500 && material.equals("stone")) {
            result = "Ancient";
        } else if (year >= 500 && year <= 1500 && material.equals("stone")) {
            result = "Medieval";
        } else if (year >= 1500 && year <= 1800 && material.equals("wood")) {
            result = "Colonial";
        } else if (year > 1800 && year <= 1900 && material.equals("steel")) {
            result = "Industrial";
        } else if (year > 1900 && material.equals("steel")) {
            result = "Modern";
        } else {
            result = "Uncertain";
        }

        System.out.println(result);
    }
}
