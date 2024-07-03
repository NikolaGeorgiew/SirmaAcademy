import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(",");
        String[] secondArr = scanner.nextLine().split(",");
        int sum = 0;
        boolean isDifferent = false;
        int problemIndex = 0;

        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i].equals(secondArr[i])) {
                int currentNumb = Integer.parseInt(firstArr[i]);
                sum += currentNumb;
            } else {
                isDifferent = true;
                problemIndex = i;
                break;
            }
        }

        if (!isDifferent) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index", problemIndex);
        }
    }
}
