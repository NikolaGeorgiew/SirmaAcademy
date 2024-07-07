import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            int[] matrixRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[r] = matrixRow;
        }

        int maxSum = Integer.MIN_VALUE;
        int[][] maxSumMatrix = new int[2][2];

        for (int r = 0; r < rows - 1; r++) {
            for (int c = 0; c < cols - 1
                    ; c++) {
                int sum = matrix[r][c] + matrix[r][c + 1] + matrix[r + 1][c] + matrix[r + 1][c + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxSumMatrix[0][0] = matrix[r][c];
                    maxSumMatrix[0][1] = matrix[r][c + 1];
                    maxSumMatrix[1][0] = matrix[r + 1][c];
                    maxSumMatrix[1][1] = matrix[r + 1][c + 1];
                }
            }
        }

        System.out.println(maxSum);
        for (int r = 0; r < maxSumMatrix.length; r++) {
            for (int c = 0; c < maxSumMatrix.length; c++) {
                System.out.print(maxSumMatrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
