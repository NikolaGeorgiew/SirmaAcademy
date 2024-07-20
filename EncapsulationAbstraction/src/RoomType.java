import java.util.List;

public class RoomType {
    private String type;
    private List<String> amenities;
    private int maxOccupancy;

    public RoomType(String type, List<String> amenities, int maxOccupancy) {
        this.type = type;
        this.amenities = amenities;
        this.maxOccupancy = maxOccupancy;
    }

    public String getType() {
        return type;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "type='" + type + '\'' +
                ", amenities=" + amenities +
                ", maxOccupancy=" + maxOccupancy +
                '}';
    }
}
