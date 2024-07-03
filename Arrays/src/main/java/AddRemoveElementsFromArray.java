import java.util.ArrayList;
import java.util.Scanner;

public class AddRemoveElementsFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] commands = scanner.nextLine().split(",");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("add")){
                if (list.size() == 0) {
                    list.add(1);
                } else {
                    int currentNumb = list.get(list.size() - 1);
                    list.add(currentNumb + 1);
                };
            } else if (commands[i].equals("remove")) {
                list.remove(list.size() - 1);
            }
        }
    }
}
