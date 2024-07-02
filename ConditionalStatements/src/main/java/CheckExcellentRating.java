import java.util.Scanner;

public class CheckExcellentRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());

        if (n >= 5.50) {
            System.out.println("Excellent!");
        }
    }
}
