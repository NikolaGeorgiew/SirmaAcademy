import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = "";
            String age = "";
            for (int j = 0; j < input.length; j++) {
                String el = input[j];
                if (el.startsWith("@") && el.endsWith("|")) {
                    name = el.substring(1, el.length() - 1);
                } else if (el.startsWith("#") && el.endsWith("*")) {
                    age = el.substring(1, el.length() - 1);
                }

            }
            System.out.printf("%s is %s years old.%n", name, age);
        }
    }
}
