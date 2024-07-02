import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginNumb = Integer.parseInt(scanner.nextLine());
        int endNumb = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int combinationNumber = 0;
        boolean isFound = false;

        for (int i = beginNumb; i <= endNumb; i++) {
            for (int j = beginNumb; j <= endNumb; j++) {
                int sum = i + j;
                combinationNumber++;
                if(sum == magicNumber) {
                    System.out.printf("Combination %d - (%d + %d = %d)", combinationNumber, i, j, sum);
                    isFound = true;
                    break;
                }
                sum = 0;
            }
            if (isFound) {
                break;
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", combinationNumber, magicNumber);
        }
    }
}
