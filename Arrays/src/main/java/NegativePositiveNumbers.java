import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NegativePositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] newArr = new int[numArr.length];
        int negativeIndex = 0;
        int positiveIndex = numArr.length - 1;

        for (int num :
                numArr) {
            if (num < 0) {
                newArr[negativeIndex++] = num;
            } else {
                newArr[positiveIndex--] = num;
            }
            }

        int start = negativeIndex;
        int end = numArr.length - 1;

        while (start < end) {
            int temp = newArr[start];
            newArr[start] = newArr[end];
            newArr[end] = temp;
            start++;
            end--;
        }

        for (int el:
             newArr) {
            System.out.println(el);
        }

//        for (int i = 0; i < numArr.length; i++) {
//            int currentFirst = newArr[0];
//            int currentLast = newArr[newArr.length - 1];
//            if (numArr[i] < 0) {
//                newArr[0] = numArr[i];
//            } else if (numArr[i] >= 0) {
//                 newArr[newArr.length - 1] = numArr[i];
//            }
//        }
//        System.out.println();
    }
}
