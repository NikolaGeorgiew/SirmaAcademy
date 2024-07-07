import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();
        while (true) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            }
            executeCommand(customList, command);
        }

    }

    private static void executeCommand(CustomList<String> customList, String command) {
        String[] tokens = command.split(" ");
        String action = tokens[0];

        switch (action) {
            case "Add":
                customList.add(tokens[1]);
                break;
            case "Remove":
                customList.remove(Integer.parseInt(tokens[1]));
                break;
            case "Contains":
                System.out.println(customList.contains(tokens[1]));
                break;
            case "Swap":
                customList.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                break;
            case "Greater":
                System.out.println(customList.countGreaterThan(tokens[1]));
                break;
            case "Max":
                System.out.println(customList.getMax());
                break;
            case "Min":
                System.out.println(customList.getMin());
                break;
            case "Print":
                customList.print();
                break;
        }
    }

    public static <T extends Comparable<T>> int countGreaterElements(List<Box<T>> list, Box<T> element) {
        int count = 0;
        for (Box<T> box : list) {
            if (box.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }
}
