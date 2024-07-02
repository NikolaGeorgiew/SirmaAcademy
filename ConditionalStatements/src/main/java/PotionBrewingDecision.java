import java.util.Scanner;

public class PotionBrewingDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        String result = "";

        if (first.equals("herbs")) {
            if (second.equals("water")){
                result = "Health potion";
            } else if (second.equals("oil")) {
                result = "Stealth potion";
            } else {
                result = "Minor stamina potion";
            }
        } else if (first.equals("berries")) {
            if (second.equals("sugar")) {
                result = "Speed potion";
            } else {
                result = "Minor energy potion";
            }
        } else {
            result = "No potion";
        }

        System.out.println(result);
    }
}
