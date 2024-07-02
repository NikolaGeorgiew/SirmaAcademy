import java.util.Scanner;

public class PseudoFibonacciSequenceSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int a = 0;
        int b = 1;

        for (int i = 0; i <= n; i++) {
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(sum);
    }
}
