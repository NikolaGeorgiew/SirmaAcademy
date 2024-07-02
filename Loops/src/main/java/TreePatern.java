import java.util.Scanner;

public class TreePatern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                for (int space = 0; space < n - 1; space++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            else {
                for (int space = 0; space < n - i - 1; space++) {
                    System.out.print(" ");
                }
                for (int star = 0; star < (2 * i + 1); star++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}
