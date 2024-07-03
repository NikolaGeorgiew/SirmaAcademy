import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] newArr = new int[n];
        int[] reversedArr = new int[n];
        int temp = n;

        for (int i = 0; i < arr.length; i++) {
            if (i == n) {
                break;
            }
            newArr[i] = arr[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            reversedArr[temp - 1] = newArr[i];
            temp = temp - 1;
        }


        for (int i = 0; i < reversedArr.length; i++) {
            if (reversedArr[i] == reversedArr.length - 1) {
                System.out.print(reversedArr[i]);
            } else {
                System.out.print(reversedArr[i] + " ");
            }

        }

    }
}
