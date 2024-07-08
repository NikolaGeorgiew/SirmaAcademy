import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String largeNumber = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());

        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = largeNumber.length() - 1; i >= 0; i--) {
            int digit = largeNumber.charAt(i) - '0';
            int product = digit * multiplier + carry;
            result.append(product % 10);
            carry = product / 10;
        }

        if (carry != 0) {
            result.append(carry);
        }

        System.out.println(result.reverse().toString());
    }
}
