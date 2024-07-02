import java.util.Scanner;

public class EqualSumOfOddAndEvenPositions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        printEqualDigitSumNumbers(start, end);
    }

    private static void printEqualDigitSumNumbers(int start, int end) {
        boolean found = false;
        for (int i = start + 1; i < end; i++) {
            if (isEqualDigitSum(i)) {
                System.out.println(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("None");
        }
    }

    private static boolean isEqualDigitSum(int number) {
        String numStr = Integer.toString(number);
        int oddSum = 0, evenSum = 0;

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0'; // Convert char to integer
            if ((i + 1) % 2 == 0) {
                evenSum += digit; // Sum of digits in even positions
            } else {
                oddSum += digit; // Sum of digits in odd positions
            }
        }

        return oddSum == evenSum;
    }
}
