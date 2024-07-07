import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] commands = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numArr = Arrays.stream(scanner.nextLine().split("\s+")).mapToInt(Integer::parseInt).toArray();
        int n = commands[0];
        int s = commands[1];
        int x = commands[2];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        boolean isFound = false;

        for (int i = 0; i < numArr.length; i++) {
            stack.push(numArr[i]);
        }

        while (s > 0) {
            stack.pop();
            s--;
        }
        for (int el :
                stack) {
            if (el == x) {
                isFound = true;
                break;
            }
        }
        if (!isFound && !stack.isEmpty()) {
            int currentMin = Integer.MAX_VALUE;
            for (int el :
                    stack) {
                if (el <= currentMin) {
                    currentMin = el;
                }
            }
            System.out.println(currentMin);
        }
        if (isFound) {
            System.out.println("true");
        }
        if (stack.isEmpty()) {
            System.out.println("0");
        }
    }
}
