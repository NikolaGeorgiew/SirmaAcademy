import java.util.Scanner;

public class PyramidOfNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int currentNumber = 1;
        int row = 1;

        while (currentNumber <= n) {
            for (int i = 0; i < row; i++) {
                if (currentNumber > n) {
                    break;
                }
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            System.out.println();
            row++;

        }
    }
}
