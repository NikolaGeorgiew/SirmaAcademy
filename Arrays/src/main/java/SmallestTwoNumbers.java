import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> list = new ArrayList<>();
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < numArr.length; i++) {
            int currentNumb = numArr[i];
            if (currentNumb < min1) {
                min2 = min1;
                min1 = currentNumb;
            } else if (currentNumb < min2) {
                min2 = currentNumb;
            }
        }
        System.out.println(min1 + " " + min2);
    }
}
