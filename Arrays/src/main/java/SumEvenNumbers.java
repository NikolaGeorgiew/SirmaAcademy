import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrString = scanner.nextLine().split(",");
        int[] numArr = new int[arrString.length];
        int sum = 0;

        for (int i = 0; i < arrString.length; i++) {
            int number = Integer.parseInt(arrString[i]);
            numArr[i] = number;
        }

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                sum += numArr[i];
            }
        }
        System.out.println(sum);
    }
}
