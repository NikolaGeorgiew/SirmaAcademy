import java.util.ArrayList;
import java.util.Scanner;

public class PrintEveryNthElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(",");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i+=n) {
            list.add(arr[i]);
        }
        for (String el :
                list) {
            System.out.print(el + " ");

        }
    }
}
