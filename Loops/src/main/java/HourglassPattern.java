import java.util.Scanner;

public class HourglassPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //Upper part
        for (int i = 1; i <= n; i++) {
            //Printing spaces
            for (int spaces = 1; spaces < i; spaces++) {
                System.out.print(" ");
            }
            //Printing #
            for (int j = i; j <= n; j++) {
                if (j == i || j == n || i == 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Printing the lower part
        for (int i = n - 1; i >= 1 ; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                if (j == i || j == n || i == 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
