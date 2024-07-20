import java.util.*;

public class RohanCavalryFormation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cavalriesArr = scanner.nextLine().split(", ");
        List<String> cavalries = new ArrayList<>(Arrays.asList(cavalriesArr));

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] commands = input.split(" ");
            if (commands[0].equals("destroy")) {
                int index = Integer.parseInt(commands[1]);
                if (ensureIndex(cavalries, index)) {
                    cavalries.remove(index);
                    printList(cavalries);
                    System.out.println();
                }
            } else if (commands[0].equals("swap")) {
                int index1 = Integer.parseInt(commands[1]);
                int index2 = Integer.parseInt(commands[2]);
                if (ensureIndex(cavalries, index1) && index1 != index2) {
                    if (ensureIndex(cavalries, index2)) {
                        Collections.swap(cavalries,index1,index2);
                        printList(cavalries);
                        System.out.println();
                    }
                }

            } else if (commands[0].equals("add")) {
                String newRider = commands[1];
                cavalries.add(newRider);
                printList(cavalries);
                System.out.println();
            } else if (commands[0].equals("insert")) {
                String newRider = commands[1];
                int index = Integer.parseInt(commands[2]);
                if (ensureIndex(cavalries, index)) {
                    cavalries.add(index,newRider);
                }
            } else if (commands[0].equals("center")) {
                int size = cavalries.size();
                if (size % 2 == 0) {
                    List<String> resultList = new ArrayList<>();
                    resultList.add(cavalries.get(size / 2 - 1));
                    resultList.add(cavalries.get(size / 2));
                    printList(resultList);
                    System.out.println();
                } else {
                    System.out.println(cavalries.get(size / 2));
                }

            }

            input = scanner.nextLine();
        }
    }
    public static void printList(List<String> list) {
        for (String el :
                list) {
            if (el.equals(list.get(list.size() - 1))) {
                System.out.print(el);
            } else {
                System.out.print(el + " ");
            }
        }
    }
    public static boolean ensureIndex(List<String> list, int index) {
        return index >= 0 && index < list.size();
    }

}
