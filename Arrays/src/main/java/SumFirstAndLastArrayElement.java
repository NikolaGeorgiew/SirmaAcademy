import java.util.Arrays;
import java.util.Scanner;

public class SumFirstAndLastArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for (int i = 0; i < numArr.length; i++) {
            int currentNumb= numArr[i];
            if (numArr[0] == currentNumb) {
                sum+= currentNumb;
            } else if (numArr[numArr.length - 1] == currentNumb) {
                sum += currentNumb;
            }
        }
        System.out.println(sum);
    }
}
