import java.util.Arrays;
import java.util.Scanner;

public class MatrixBoundarySum {
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

        //Sum top row
        for (int i = 0; i < cols; i++) {
            sum += matrix[0][i];
        }
        //Sum bottom row
        for (int i = 0; i < cols; i++) {
            sum += matrix[rows - 1][i];
        }

        //Sum the left and right columns excluding corners
        for (int i = 1; i < rows - 1; i++) {
            sum += matrix[i][0]; // Left column
            sum += matrix[i][cols - 1]; // Right column
        }

        System.out.println(sum);
    }
}
