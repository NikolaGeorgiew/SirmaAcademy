import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        ;
        int sum = 0;
        boolean isFinished = false;

        while (!isFinished) {
            int[] newArr = new int[numArr.length - 1];
            for (int i = 0; i < numArr.length; i++) {

                if (numArr[i] == numArr[numArr.length - 1]) {
                    break;
                }
                newArr[i] = numArr[i] + numArr[i + 1];
                if (numArr.length == 2) {
                    for (int j = 0; j < numArr.length; j++) {
                        sum += numArr[j];
                    }
                    isFinished = true;
                    break;
                }
            }
            numArr = newArr;
        }

        System.out.println(sum);
    }
}
