import java.util.Arrays;
import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];
        int sum = 0;

        for (int r = 0; r < rows; r++) {
            int[] matrixRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[r] = matrixRow;
        }

        for (int i = 0; i < rows; i++) {
            sum+= matrix[i][i];
        }

        for (int i = 0; i < rows; i++) {
            sum += matrix[rows - 1 - i][i];
        }

        System.out.println(sum);
    }
}
