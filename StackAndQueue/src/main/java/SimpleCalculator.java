import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        int currentNumber = Integer.parseInt(input[0]);
        stack.push(currentNumber);

        for (int i = 1; i < input.length; i+=2) {
            String operator = input[i];
            int number = Integer.parseInt(input[i + 1]);

            if (operator.equals("+")) {
                stack.push(number);
            } else {
                stack.push(-number);
            }
        }
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}
