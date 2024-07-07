import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] firstMatrix = new int[rows][cols];
        int[][] secondMatrix = new int[rows][cols];
        int[][] newMatrix = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            int[] matrixRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            firstMatrix[r] = matrixRow;
        }
        for (int r = 0; r < rows; r++) {
            int[] matrixRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            secondMatrix[r] = matrixRow;
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                newMatrix[r][c] = firstMatrix[r][c] + secondMatrix[r][c];
            }
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(newMatrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
