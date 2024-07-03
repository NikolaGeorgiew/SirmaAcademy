import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        signOfInteger(n);

    }

    public static void signOfInteger(int n) {
        if (n > 0) {
            System.out.printf("The number %d is positive.%n", n);
        } else if (n < 0) {
            System.out.printf("The number %d is negative.%n", n);
        } else {
            System.out.printf("The number %d is zero.%n", n);
        }
    }
}
