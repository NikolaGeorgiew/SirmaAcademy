import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExtractANonDecreasingSubsequenceFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int currentBiggest = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int currentNumb = arr[i];
            if (currentNumb >= currentBiggest) {
                currentBiggest = currentNumb;
                list.add(currentBiggest);
            }
        }
        for (int el :
                list) {
            System.out.print(el + " ");
        }
    }
}
