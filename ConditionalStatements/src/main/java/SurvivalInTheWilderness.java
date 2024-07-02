import java.util.Scanner;

public class SurvivalInTheWilderness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String time = scanner.nextLine();
        String environment = scanner.nextLine();
        String items = scanner.nextLine();

        String result = "";

        switch (time) {
            case "day":
                if (environment.equals("forest")) {
                    if (items.equals("knife")) {
                        result = "Hunt for food";
                    } else if (items.equals("container")) {
                        result = "Collect berries";
                    } else {
                        result = "Explore";
                    }
                } else if (environment.equals("desert")) {
                    if (items.equals("hat")) {
                        result = "Search for water";
                    } else  {
                        result = "Find shade";
                    }
                }
                break;
            case "night":
                if (environment.equals("forest")) {
                    if (items.equals("firestarter")) {
                        result = "Make a campfire";
                    } else {
                        result = "Climb a tree";
                    }
                } else if (environment.equals("desert")) {
                    if (items.equals("blanket")) {
                        result = "Sleep";
                    } else {
                        result = "Keep moving to stay warm";
                    }
                }
                break;
        }
        System.out.println(result);
    }
}
