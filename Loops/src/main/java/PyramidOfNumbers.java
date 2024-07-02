import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isFinished = false;

        int currentNumber = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                if (currentNumber > n) {
                    isFinished = true;
                    break;
                }
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            if (isFinished) {
                break;
            }
            System.out.println();
        }
    }
}
