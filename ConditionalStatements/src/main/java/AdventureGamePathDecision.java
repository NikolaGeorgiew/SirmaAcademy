import java.util.Scanner;

public class AdventureGamePathDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rightHand = scanner.nextLine();
        String leftHand = scanner.nextLine();

        String path = "";

        if (rightHand.equals("sword") || leftHand.equals("sword")) {
            if (rightHand.equals("shield") || leftHand.equals("shield")){
                path = "Path to the castle";
            } else {
                path = "Path to the forest";
            }
        } else if (rightHand.equals("map") || leftHand.equals("map")) {
            if (rightHand.equals("coins") || leftHand.equals("coins")) {
                path = "Go to the town";
            } else {
                path = "Camp";
            }
        } else {
            path = "Wander aimlessly.";
        }
        System.out.println(path);
    }
}
