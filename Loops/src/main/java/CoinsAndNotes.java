import java.util.Scanner;

public class CoinsAndNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneLevCoin = Integer.parseInt(scanner.nextLine());
        int twoLevaCoin = Integer.parseInt(scanner.nextLine());
        int fiveBGN = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());


        for (int count1Lv = 0; count1Lv <= oneLevCoin ; count1Lv++) {
            for (int count2Lv = 0; count2Lv <= twoLevaCoin; count2Lv++) {
                for (int count5Lv = 0; count5Lv <= fiveBGN; count5Lv++) {
                    int total = count1Lv * 1 + count2Lv * 2 + count5Lv * 5;
                    if (total == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2lv. + %d * 5lv. = %d lv.%n", count1Lv, count2Lv, count5Lv, sum);
                    }
                }
            }
        }
    }
}
