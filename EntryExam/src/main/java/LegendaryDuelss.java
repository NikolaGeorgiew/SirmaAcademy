import java.util.ArrayDeque;
import java.util.Scanner;

public class LegendaryDuelss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (isBalanced(input)) {
            System.out.println("Legendary");
        } else {
            System.out.println("Not Legendary");
        }

    }
    public static boolean isBalanced(String input) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean isClosing = false;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (symbol == '(' || symbol == '{' || (!isClosing && symbol == '!')) {
                stack.push(symbol);
                if (stack.peek() == '!') {
                    isClosing = true;
                }
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }
            char check;
            switch (symbol) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '!') {
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '!') {
                        return false;
                    }
                    break;
                case '!':
                    check = stack.pop();
                    isClosing = false;
                    if (check == '(' || check == '{') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
