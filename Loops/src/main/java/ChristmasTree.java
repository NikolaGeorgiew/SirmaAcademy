import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }
            //Print left side of the tree
            for (int star = 0; star < i; star++) {
                System.out.print("*");
            }
            //Print separator
            System.out.print(" | ");
            //Print right side of the tree
            for (int star = 0; star < i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
