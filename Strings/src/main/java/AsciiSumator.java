import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);
        String randomString = scanner.nextLine();

        int sum = 0;

        for (char ch :
                randomString.toCharArray()) {
         if (ch >= char1 && ch <= char2) {
             sum += (int) ch;
         }
        }
        System.out.println(sum);
    }
}
