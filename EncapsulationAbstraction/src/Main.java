import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        boolean running = true;

        while (running) {
            System.out.println("===== Hotel Room Reservation System =====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. View Room Types");
            System.out.println("4. View Available Rooms");
            System.out.println("5. Book Room");
            System.out.println("6. Cancel Booking");
            System.out.println("7. View Profile");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter username: ");
                    String regUsername = scanner.nextLine();
                    System.out.println("Enter password: ");
                    String regPassword = scanner.nextLine();
                    hotel.registerUser(regUsername,regPassword);
                    break;
                case 2:
                    System.out.println("Enter username: ");
                    String logUsername = scanner.nextLine();
                    System.out.println("Enter password: ");
                    String logPassword = scanner.nextLine();
                    if (hotel.loginUser(logUsername, logPassword)) {
                        System.out.println("Login successful.");
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                    break;
                case 3:
                    hotel.displayRoomTypes();
                    break;
                case 4:
                    hotel.displayAvailableRooms();
                    break;
                case 5:
                    System.out.println("Enter room number to book: ");
                    int bookRoomNumber = Integer.parseInt(scanner.nextLine());
                    hotel.bookRoom(bookRoomNumber);
                    break;
                case 6:
                    System.out.println("Enter room number to cancel booking: ");
                    int cancelRoomNumber = Integer.parseInt(scanner.nextLine());
                    hotel.cancelBooking(cancelRoomNumber);
                    break;
                case 7:
                    hotel.viewProfile();
                    break;
                case 8:
                    System.out.println("Exiting the system. Goodbye !");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
