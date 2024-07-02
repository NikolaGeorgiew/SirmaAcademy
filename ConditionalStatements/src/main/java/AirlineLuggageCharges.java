import java.util.Scanner;

public class AirlineLuggageCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = Integer.parseInt(scanner.nextLine());
        int dimensions = Integer.parseInt(scanner.nextLine());
        int diff = dimensions - 158;

        int sum = 0;
        if (weight > 50) {
            sum += 100;
        }

        if (diff >= 1 && diff <=20) {
            sum += 50;
            if (weight > 50) {
                sum += 50;
            }
        } else if (diff >= 21 && diff <= 50) {
            sum += 100;
            if (weight > 50) {
                sum += 50;
            }
        } else if (diff > 50) {
            sum += 200;
            if (weight > 50) {
                sum += 50;
            }
        }
        System.out.printf("$%d", sum);
    }
}
