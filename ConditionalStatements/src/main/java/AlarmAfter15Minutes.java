import java.util.Scanner;

public class AlarmAfter15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 15;

        if (minutes >= 60) {
            hour += 1;
            minutes = minutes % 60;
        }

        if (hour >= 24) {
            hour = hour % 24;
        }

        String formattedMinutes = String.format("%02d", minutes);

        System.out.println(hour + ":" + formattedMinutes);
    }
}
