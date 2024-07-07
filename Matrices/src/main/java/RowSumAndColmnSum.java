import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RowSumAndColmnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = new int[rows][cols];
        List<Integer> rowSums = new ArrayList<>();
        List<Integer> colSums = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            int[] matrixRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = matrixRow;
        }

        for (int r = 0; r < rows; r++) {
            int rowSum = 0;
            for (int c = 0; c < cols; c++) {
                rowSum += matrix[r][c];
            }
            rowSums.add(rowSum);
        }

        for (int c = 0; c < cols; c++) {
            int colSum = 0;
            for (int r = 0; r < rows; r++) {
                colSum += matrix[r][c];
            }
            colSums.add(colSum);
        }

        System.out.print("Row Sums: ");
        for (int sum :
                rowSums) {
            if (sum != rowSums.get(rowSums.size() - 1)) {
                System.out.print(sum + ", ");
            } else {
                System.out.print(sum);
            }

        }
        System.out.println();
        System.out.print("Column Sums: ");
        for (int sum :
                colSums) {
            if (sum != colSums.get(colSums.size() - 1)) {
                System.out.print(sum + ", ");
            } else {
                System.out.print(sum);
            }

        }
    }
}
