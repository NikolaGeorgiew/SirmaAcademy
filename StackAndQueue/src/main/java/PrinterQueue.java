import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!input.equals("print")) {
            if (input.equals("cancel") && !queue.isEmpty()) {
                String canceled = queue.poll();
                System.out.printf("Canceled %s%n", canceled);
            } else if (input.equals("cancel") && queue.isEmpty()) {
                System.out.println("StandBy");
            } else {
                queue.offer(input);
            }
            input = scanner.nextLine();
        }

        for (String el :
                queue) {
            System.out.println(el);
        }
    }
}
