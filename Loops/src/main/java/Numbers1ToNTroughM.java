import java.util.Scanner;

public class Numbers1ToNTroughM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i+= m) {
            System.out.println(i);
        }
    }
}
