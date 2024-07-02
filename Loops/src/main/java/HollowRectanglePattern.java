import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                //Row need to be first or last
                //Col need to be first or last
                if (row == 0 || row == rows - 1 || col == 0 || col == cols - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
