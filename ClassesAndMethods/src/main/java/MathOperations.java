import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int n2 = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calculator(n1,n2,operator));

    }
    public static double calculator(int n1, int n2, String operator) {
        if (operator.equals("/")){
            return n1 / n2;
        } else if (operator.equals("*")) {
            return  n1 * n2;
        } else if (operator.equals("+")) {
            return n1 + n2;
        } else {
            return n1 - n2;
        }
    }
}
