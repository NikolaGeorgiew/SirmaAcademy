import java.util.Scanner;

public class UniqueCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumberMax = Integer.parseInt(scanner.nextLine());
        int secondNumberMax = Integer.parseInt(scanner.nextLine());
        int thirdNumberMax = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();

        for (int firstDigit = 2; firstDigit <=firstNumberMax ; firstDigit+=2) {
            for (int secondDigit = 2; secondDigit <= secondNumberMax; secondDigit++) {
                if (secondDigit == 2 || secondDigit == 3 || secondDigit == 5 || secondDigit == 7) {
                    for (int thirdDigit = 2; thirdDigit <= thirdNumberMax; thirdDigit+=2) {
                        System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit);
                    }
                }
            }
        }
    }
}
