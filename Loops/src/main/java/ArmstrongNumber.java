import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sumOfDigits = String.valueOf(n).length();

        int sum = 0;
        int temp = n;

        for (int i = 1; i <= sumOfDigits; i++) {
            int digit = temp % 10;
            sum += Math.pow(digit, sumOfDigits);
            temp = temp / 10;
        }

        if (n == sum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

//        int sumOfDigits = 0;
//        int sum = 0;
//        int n1 = n;
//        int n2 = n;
//
//        while (n1 > 0) {
//            n1 = n1 / 10;
//            sumOfDigits ++;
//        }
//
//        for (int i = 1; i <= sumOfDigits ; i++) {
//            int eachDigit = n2 % 10;
//            sum += Math.pow(eachDigit, sumOfDigits);
//            n2 = n2 / 10;
//        }
//
//        if (n == sum) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
    }

}
