import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hotel {
    private List<RoomType> roomTypes;
    private List<Room> rooms;
    private List<User> users;
    private User currentUser;

    public Hotel() {
        this.roomTypes = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.users = new ArrayList<>();
        initializeRoomTypes();
        initializeRooms();
    }

    private void initializeRooms() {
        rooms.add(new Room(101, getRoomTypeByName("Deluxe"), 150.00, 50.00, "available"));
        rooms.add(new Room(102, getRoomTypeByName("Deluxe"), 150.00, 50.00, "available"));
        rooms.add(new Room(201, getRoomTypeByName("Suite"), 300.00, 100.00, "available"));
        rooms.add(new Room(301, getRoomTypeByName("Single"), 75.00, 25.00, "available"));
        rooms.add(new Room(302, getRoomTypeByName("Double"), 100.00, 35.00, "available"));

    }

    private RoomType getRoomTypeByName(String typeName) {
        for (RoomType roomType : roomTypes) {
            if (roomType.getType().equals(typeName)) {
                return roomType;
            }
        }
        return null;
    }

    private void initializeRoomTypes() {
        roomTypes.add(new RoomType("Deluxe", Arrays.asList("Wi-Fi", "TV", "Mini Bar"), 2));
        roomTypes.add(new RoomType("Suite", Arrays.asList("Wi-Fi", "TV", "Mini Bar", "Jacuzzi"), 4));
        roomTypes.add(new RoomType("Single", Arrays.asList("Wi-Fi", "TV"), 1));
        roomTypes.add(new RoomType("Double", Arrays.asList("Wi-Fi", "TV"), 2));

    }

    public void registerUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("Username already exists.");
                return;
            }
        }
        users.add(new User(username,password));
        System.out.println("User registered successfully.");
    }

    public boolean loginUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                currentUser = user;
                return true;
            }
        }
        return false;
    }

    public void viewProfile() {
        if (currentUser != null) {
            System.out.println(currentUser);
        } else {
            System.out.println("No user is logged in.");
        }
    }

    public void bookRoom(int roomNumber) {
        Room room = findRoomByNumber(roomNumber);
        if (room != null && room.getStatus().equals("available")) {
            room.setStatus("booked");
            String bookingDetails = "Booked Room " + roomNumber + "(" + room.getRoomType().getType() + ")";
            currentUser.addBooking(bookingDetails);
            System.out.println(bookingDetails);
        } else {
            System.out.println("Room " + roomNumber + " is not available");
        }
    }

    private Room findRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    public void displayAvailableRooms() {
        for (Room room : rooms) {
            if (room.getStatus().equals("available")) {
                System.out.println(room);
            }
        }
    }

    public void cancelBooking(int roomNumber) {
         Room room = findRoomByNumber(roomNumber);
         if (room != null && room.getStatus().equals("booked")) {
             double cancellationFee = room.getCancellationFee();
             System.out.println("Cancellation fee: $" + cancellationFee);
             //Update room status to available
             room.setStatus("available");
             //Remove booking from user's profile
             String bookingDetails = "Booked Room " + roomNumber + "(" + room.getRoomType().getType() + ")";
             currentUser.removeBooking(bookingDetails);
             System.out.println("Booking for room " + roomNumber + " has been canceled.");
         } else {
             System.out.println("Room " + roomNumber + " is not booked.");
         }
    }

    public void displayRoomTypes() {
        for (RoomType roomType : roomTypes) {
            System.out.println(roomType);
        }
    }


    public List<RoomType> getRoomTypes() {
        return roomTypes;
    }

}
