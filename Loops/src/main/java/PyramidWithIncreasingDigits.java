import java.util.Scanner;

public class PyramidWithIncreasingDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            //Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            //Print increasing part
            for (int j = 0; j < i; j++) {
                System.out.print(i + j);
            }
            //Print decreasing part
            for (int j = i - 2; j >= 0 ; j--) {
                System.out.print(i + j);
            }
            System.out.println();
        }
    }
}
