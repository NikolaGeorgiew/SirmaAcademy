import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                //Print top and last row of glasses
                //First Stars
                for (int stars = 1; stars <= 2 * n; stars++) {
                    System.out.print("*");
                }
                //Spaces
                for (int space = 1; space <= n; space++) {
                    System.out.print(" ");
                }
                //Second stars
                for (int stars = 1; stars <= 2 * n; stars++) {
                    System.out.print("*");
                }
                System.out.println();

            } else {
                System.out.print("*");
                for (int slashes = 1; slashes <= 2 * n - 2; slashes++) {
                    System.out.print("/");
                }
                System.out.print("*");
                //Checking for middle row
                if (i == (n + 1) / 2) {
                    for (int spaces = 1; spaces <= n; spaces++) {
                        System.out.print("|");
                    }
                } else {
                    for (int spaces = 1; spaces <= n; spaces++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
                for (int slashes = 1; slashes <= 2 * n - 2; slashes++) {
                    System.out.print("/");
                }
                System.out.print("*");
                System.out.println();
            }
        }
        
        
    }
}
