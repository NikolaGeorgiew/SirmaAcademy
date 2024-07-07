import java.util.ArrayDeque;
import java.util.Scanner;

public class DocumentEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> undoStack = new ArrayDeque<>();
        ArrayDeque<String> redoStack = new ArrayDeque<>();
        StringBuilder currentText = new StringBuilder();

        while (!input.equals("End")) {
            if (input.startsWith("Insert(")) {
                undoStack.push(currentText.toString());
                String text = input.substring(8, input.length() - 2);
                currentText.append(text);
                System.out.println(currentText);
                redoStack.clear();
            } else if (input.equals("Undo()")) {
                if (!undoStack.isEmpty()) {
                    redoStack.push(currentText.toString());
                    currentText = new StringBuilder(undoStack.pop());
                    System.out.println(currentText);
                }
            } else if (input.equals("Redo()")) {
                undoStack.push(currentText.toString());
                currentText = new StringBuilder(redoStack.pop());
                System.out.println(currentText);
            }

            input = scanner.nextLine();
        }
    }
}
