import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] commands = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = commands[0];
        int s = commands[1];
        int x = commands[2];

        System.out.println();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < numArr.length; i++) {
            if (i == n - 1) {
                break;
            }
            queue.offer(numArr[i]);
        }

        for (int i = 1; i <= s; i++) {
            queue.poll();
        }

        boolean isFound = false;

        for (int el :
                queue) {
            if (el == x) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("true");
        } else if (!isFound && !queue.isEmpty()){
            int currentMin = Integer.MAX_VALUE;
            for (int el :
                    queue) {
                if (el <= currentMin) {
                    currentMin = el;
                }
            }
            System.out.println(currentMin);
        } else {
            System.out.println("0");
        }
    }
}
