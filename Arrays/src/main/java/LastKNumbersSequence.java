import java.util.Scanner;

public class LastKNumbersSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        int[] numArr = new int[n];

        numArr[0] = 1;


        for (int i = 1; i < numArr.length; i++) {
            int sum = 0;
            for (int j = i - 1; j >= 0 && j>= i - k; j--) {
                sum += numArr[j];
            }
            numArr[i] = sum;
        }

        for (int el :
                numArr) {
            System.out.print(el + " ");
        }
    }
}
