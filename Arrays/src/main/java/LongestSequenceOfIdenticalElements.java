import java.util.Arrays;
import java.util.Scanner;

public class LongestSequenceOfIdenticalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxLength = 0;
        int currentLength = 1;
        int endIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            if (currentLength >= maxLength) {
                maxLength = currentLength;
                endIndex = i;
            }
        }
        int[] result = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            result[i] = arr[endIndex - maxLength + 1 + i];
        }

        for (int el :
                result) {
            System.out.print(el + " ");
        }

    }
}
