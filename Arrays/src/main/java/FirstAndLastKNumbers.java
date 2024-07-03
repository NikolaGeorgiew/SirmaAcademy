import java.util.Scanner;

public class FirstAndLastKNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = scanner.nextLine().split(", ");

        for (int i = 0; i < n; i++) {
            if (arr[i].equals(arr[arr.length - 1])) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }

        }
        System.out.println();
        for (int i = arr.length - n; i < arr.length; i++) {
            if (arr[i].equals(arr[arr.length - 1])) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
