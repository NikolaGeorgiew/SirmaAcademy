import java.util.Arrays;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(", ");

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "." + arr[i]);
        }
    }
}
