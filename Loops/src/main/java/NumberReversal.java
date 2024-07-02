import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String newNumber = "";

        while (n > 0) {
            newNumber = newNumber + (n % 10);
            n = n / 10;
        }
        System.out.println(newNumber);
    }
}
