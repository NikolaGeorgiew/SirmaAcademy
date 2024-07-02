import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        int numberOfCoins = 0;
        double changeInCoins = change * 100;

        while (Math.round(changeInCoins) > 0) {
            if (changeInCoins >= 200) {
                changeInCoins -= 200;
                numberOfCoins++;
            } else if (changeInCoins >= 100) {
                changeInCoins -= 100;
                numberOfCoins++;
            } else if (changeInCoins >= 50) {
                changeInCoins -= 50;
                numberOfCoins++;
            } else if (changeInCoins >= 20) {
                changeInCoins -= 20;
                numberOfCoins++;
            } else if (changeInCoins >= 10) {
                changeInCoins -= 10;
                numberOfCoins++;
            } else if (changeInCoins >= 5) {
                changeInCoins -= 5;
                numberOfCoins++;
            } else if (changeInCoins >= 2) {
                changeInCoins -= 2;
                numberOfCoins++;
            } else if (changeInCoins >= 1) {
                changeInCoins -= 1;
                numberOfCoins++;
            }
        }
        System.out.println(numberOfCoins);
    }
}
