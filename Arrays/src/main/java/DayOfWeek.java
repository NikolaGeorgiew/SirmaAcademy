import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] days = {"Invalid day !", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (n >= 1 && n <= 7) {
            System.out.println(days[n]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
