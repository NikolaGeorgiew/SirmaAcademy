import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                if ((rows == 0 && cols == 0)
                        || (rows == 0 && cols == n - 1)
                        || (rows == n - 1 && cols == n - 1)
                        || (rows == n - 1 && cols == 0)) {
                    System.out.print("+");
                } else if (cols != 0 && cols != n - 1) {
                    System.out.print("-");
                } else {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}
