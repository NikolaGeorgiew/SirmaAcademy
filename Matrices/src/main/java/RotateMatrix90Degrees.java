import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix90Degrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = dimensions[0];
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int[] matrixRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = matrixRow;
        }

        //Traverse each cycle
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                //Swap elements of each cycle
                //in clockwise direction
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1- i][n - 1 - j];
                matrix[n - 1- i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
