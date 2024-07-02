import java.util.Scanner;

public class ClimateZoneIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double latitude = Double.parseDouble(scanner.nextLine());
        String str = scanner.nextLine();
        String result = "";

        if (latitude > 66.5) {
            result = "Arctic Zone";
        } else if (latitude >= 23.5 && latitude <= 66.5) {
            result = "Temperate Zone";
        } else if (latitude > 0 && latitude < 23.5) {
            result = "Tropic Zone";
        } else if (latitude == 0) {
            result = "Equator";
        } else if (latitude < 0) {
            result = "Arctic Zone";
        }

        System.out.println(result);
    }
}
