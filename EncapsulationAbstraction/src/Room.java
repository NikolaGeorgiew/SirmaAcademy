public class Room {
    private int roomNumber;
    private RoomType roomType;
    private double pricePerNight;
    private double cancellationFee;
    private String status; //e.g. available, booked

    public Room(int roomNumber, RoomType roomType, double pricePerNight, double cancellationFee, String status) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.cancellationFee = cancellationFee;
        this.status = status;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public double getCancellationFee() {
        return cancellationFee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomType=" + roomType +
                ", pricePerNight=" + pricePerNight +
                ", cancellationFee=" + cancellationFee +
                ", status='" + status + '\'' +
                '}';
    }
}
