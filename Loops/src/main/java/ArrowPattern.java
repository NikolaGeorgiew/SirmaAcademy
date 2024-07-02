import java.util.Scanner;

public class ArrowPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        //Part 1
        for (int i = 1; i <= n; i++) {
            //Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //Print asterisks with spaces
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Part 2
        int spaceCountForBlock = (n * 2 - n) / 2;
        for (int i = 1; i <= n; i++) {
            //Print spaces
            for (int j = 0; j < spaceCountForBlock; j++) {
                System.out.print(" ");
            }
            //Print asterisks
            for (int j = 1; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
