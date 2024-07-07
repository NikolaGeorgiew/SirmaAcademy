import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        List<Integer> firstDiagonal = new ArrayList<>();
        List<Integer> secondDiagonal = new ArrayList<>();

        for (int r = 0; r < n; r++) {
            int[] matrixRow = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[r] = matrixRow;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[n - 1 - i][i] + " ");
        }
        System.out.println();
    }
}
