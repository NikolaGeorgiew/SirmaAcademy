import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = Integer.parseInt(scanner.nextLine());
        int factorial = 1;

        for (int i = n; i >= 1 ; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
