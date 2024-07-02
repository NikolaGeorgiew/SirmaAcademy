import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = Integer.parseInt(scanner.nextLine());

        if (year % 4 == 0) {
            System.out.println("Its a leap year !");
        } else if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Its a leap year !");
        } else {
            System.out.println("Its not a leap year.");
        }
    }
}
