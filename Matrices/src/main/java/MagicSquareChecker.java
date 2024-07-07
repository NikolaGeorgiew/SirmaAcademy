import java.util.Arrays;
import java.util.Scanner;

public class MagicSquareChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = dimensions[0];
        int[][] matrix = new int[n][n];

        for (int r = 0; r < n; r++) {
            int[] matrixRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[r] = matrixRow;
        }

        if (isMagicSquare(matrix, n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static boolean isMagicSquare(int[][] matrix, int n) {
        int magicSum = 0;

        //Calculate the magic sum using the first row
        for (int c = 0; c < n; c++) {
            magicSum += matrix[0][c];
        }
        //Chek sums of all rows
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                return false;
            }
        }
        //Check sum of all columns
        for (int c = 0; c < n; c++) {
            int colSum = 0;
            for (int r = 0; r < n; r++) {
                colSum += matrix[r][c];
            }
            if (colSum != magicSum) {
                return false;
            }
        }
        //Check sum of the main diagonal(top-left to bottom right)
        int diag1Sum = 0;
        for (int i = 0; i < n; i++) {
            diag1Sum += matrix[i][i];
        }
        if (diag1Sum != magicSum) {
            return  false;
        }
        //Check sum of the other diagonal (bottom-left to top-right)
        int diag2Sum = 0;
        for (int i = 0; i < n; i++) {
            diag2Sum += matrix[i][n - 1 - i];
        }
        if (diag2Sum != magicSum) {
            return false;
        }
        //If all checks pass, the matrix is a magic square
        return true;
    }
}
