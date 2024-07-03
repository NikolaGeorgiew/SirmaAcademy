import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProcessOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numArr.length; i++) {
            if (i % 2 != 0) {
                int currentNumb = numArr[i];
                list.add(currentNumb * 2);
            }
        }

        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
