import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            String el = arr[i];
            int n = el.length();
            for (int j = 1; j <= n; j++) {
                stringBuilder.append(el);
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
