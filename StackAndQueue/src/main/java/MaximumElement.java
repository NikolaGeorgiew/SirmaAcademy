import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            int[] commands = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (commands[0] == 1) {
                int number = commands[1];
                stack.push(number);
            } else if (commands[0] == 2) {
                stack.pop();
            } else if (commands[0] == 3) {
                int currentMax = Integer.MIN_VALUE;
                for (int el :
                        stack) {
                    if (el > currentMax) {
                        currentMax = el;
                    }
                    }
                System.out.println(currentMax);
            }
        }
    }
}
