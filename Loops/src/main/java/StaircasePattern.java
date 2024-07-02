import java.util.Scanner;

public class StaircasePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("#");
        for (int i = 1; i <= n; i++) {
            for (int spaces = 2; spaces <= i; spaces++) {
                System.out.print(" ");
            }
            for (int hash = 0; hash <= i; hash++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
