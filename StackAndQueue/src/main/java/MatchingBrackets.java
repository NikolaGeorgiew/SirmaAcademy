import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);
            if (current == '(') {
                stack.push(i);
            } else if (current == ')') {
                int startIndex = stack.pop();
                String subExpression = expression.substring(startIndex, i + 1);
                System.out.println(subExpression);
            }
        }
    }
}
