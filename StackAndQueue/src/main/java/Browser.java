import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();
        String currentUrl = "no current URL";

        while (!input.equals("Home")){

            if (input.equals("back")) {
                if (stack.isEmpty()) {
                    System.out.println("no previous URL");
                } else {
                    currentUrl = stack.pop();
                    System.out.println(currentUrl);
                }
            } else {
                if (!currentUrl.equals("no current URL")) {
                    stack.push(currentUrl);
                }
                currentUrl = input;
                System.out.println(currentUrl);
            }


            input = scanner.nextLine();
        }
    }
}
