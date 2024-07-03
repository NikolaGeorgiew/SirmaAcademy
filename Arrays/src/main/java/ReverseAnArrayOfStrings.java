import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(",");
        String[] reversedArr =  new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArr[arr.length - 1 - i] = arr[i];
        }

        for (int i = 0; i < reversedArr.length; i++) {
            if (reversedArr[i].equals(reversedArr[reversedArr.length - 1])) {
                System.out.print(reversedArr[i]);
            } else {
                System.out.print(reversedArr[i] + " ");
            }
        }
    }
}
