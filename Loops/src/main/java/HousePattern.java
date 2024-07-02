import java.util.Scanner;

public class HousePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //Print the roof
        for (int i = 0; i < (n / 2) + 1; i++) {
            //Print spaces
            for (int j = 0; j < (n / 2) - i; j++) {
                System.out.print(" ");
            }
            //Print asterisks
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Print the base of the house
        for (int i = 0; i < (n / 2) ; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
