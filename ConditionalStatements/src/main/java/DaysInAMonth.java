import java.util.Scanner;

public class DaysInAMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = Integer.parseInt(scanner.nextLine());
        int result = 0;

        if (month == 1) {
            result = 31;
        } else if (month == 2) {
            result = 28;
        } else if (month == 3) {
            result = 31;
        } else if (month == 4) {
            result = 30;
        } else if (month == 5) {
            result = 31;
        } else if (month == 6) {
            result = 30;
        } else if (month == 7) {
            result = 31;
        } else if (month == 8) {
            result = 31;
        } else if (month == 9) {
            result = 30;
        } else if (month == 10) {
            result = 31;
        } else if (month == 11) {
            result = 30;
        } else if (month == 12) {
            result = 31;
        }
        System.out.println(result);
    }
}
