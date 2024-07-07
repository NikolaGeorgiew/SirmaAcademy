import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensionsA = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rowsA = dimensionsA[0];
        int colsA = dimensionsA[1];

        int[][] matrixA = new int[rowsA][colsA];

        for (int r = 0; r < rowsA; r++) {
            int[] matrixRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrixA[r] = matrixRow;
        }

        int[] dimensionsB = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rowsB = dimensionsB[0];
        int colsB = dimensionsB[1];
        int[][] matrixB = new int[rowsB][colsB];

        if (colsA != colsB || rowsA != rowsB) {
            System.out.println("not equal");
            return;
        }

        for (int r = 0; r < rowsB; r++) {
            int[] matrixRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrixB[r] = matrixRow;
        }

        for (int row = 0; row < rowsA; row++) {
            for (int col = 0; col <colsA; col++) {
                if (matrixA[row][col] != matrixB[row][col]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }
}
