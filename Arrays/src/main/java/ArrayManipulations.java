import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>(Arrays.stream(scanner.nextLine().split(" ")).toList());
        String[] commands = scanner.nextLine().split(", ");

        for (int i = 0; i < commands.length; i++) {
            String command = commands[i].split(" ")[0];
            if (command.equals("Add")) {
                String number = commands[i].split(" ")[1];
                list.add(number);
//                String[] newArr = new String[arr.length + 1];
//                String number = commands[i].split(" ")[1];
//                for (int j = 0; j < arr.length; j++) {
//                    newArr[j] = arr[j];
//                }
//                newArr[newArr.length - 1] = number;
//                System.out.println();
            } else if (command.equals("Remove")) {
                String number = commands[i].split(" ")[1];
                list.remove(number);
            } else if (command.equals("RemoveAt")) {
                int index = Integer.parseInt(commands[i].split(" ")[1]);
                list.remove(index);
            } else if (command.equals("Insert")) {
                String number = commands[i].split(" ")[1];
                int index = Integer.parseInt(commands[i].split(" ")[2]);
                list.add(index,number);
            }
        }
        for (String el:
             list) {
            System.out.print(el + " ");
        }
    }
}
