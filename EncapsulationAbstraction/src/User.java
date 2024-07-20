import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<String> bookingHistory;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.bookingHistory = new ArrayList<>();

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<String> getBookingHistory() {
        return bookingHistory;
    }

    public void addBooking(String bookingDetails) {
        bookingHistory.add(bookingDetails);
    }
    public void removeBooking(String bookingDetails) {
        bookingHistory.remove(bookingDetails);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", bookingHistory=" + bookingHistory +
                '}';
    }
}
