import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if (n >= 90 && n <=100) {
            System.out.println("A");
        } else if (n >= 80 && n <= 89) {
            System.out.println("B");
        } else if (n >= 70 && n <= 79) {
            System.out.println("C");
        } else  if (n >= 60 && n <= 69) {
            System.out.println("D");
        } else if (n >= 0 && n <= 59) {
            System.out.println("F");
        }
    }
}
