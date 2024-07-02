import java.util.Scanner;

public class NewBuilding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int floor = floors; floor >= 1; floor--) {
            for (int room = 1; room <= rooms; room++) {
                String roomName = "";

                if (floor == floors) {
                    roomName = "L" + floor + (room - 1);
                } else if (floor % 2 == 0) {
                    roomName = "O" + floor + (room - 1);
                } else {
                    roomName = "A" + floor + (room - 1);
                }
                System.out.print(roomName + " ");
            }
            System.out.println();
        }
    }
}
