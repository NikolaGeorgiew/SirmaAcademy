import java.util.Scanner;

public class SumOfVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int sum = 0;

        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char symbol = arr[i];
            if (symbol == 'a') {
                sum += 1;
            } else if (symbol == 'e') {
                sum += 2;
            } else if (symbol == 'i') {
                sum += 3;
            } else if (symbol == 'o') {
                sum += 4;
            } else if (symbol == 'u') {
                sum += 5;
            }
        }
        System.out.println(sum);
    }
}
