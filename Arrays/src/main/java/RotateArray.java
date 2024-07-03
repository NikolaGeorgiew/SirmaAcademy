import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(",");
        int count = Integer.parseInt(scanner.nextLine());

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        for (int i = 1; i <= count; i++) {
                String last = list.get(list.size() - 1);
                list.remove(last);
                list.add(0, last);
        }

        for (String el :
                list) {
            System.out.print(el + " ") ;
        }
    }
}
