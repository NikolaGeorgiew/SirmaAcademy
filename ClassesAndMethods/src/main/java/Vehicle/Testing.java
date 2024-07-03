package Vehicle;

public class Testing {
    public static void main(String[] args) {

        Engine engine = new Engine(350);
        Vehicle vehicle = new Vehicle("bmw", "e60", engine, 200);
        vehicle.drive(100);
        System.out.println(vehicle.getFuel());
    }
}
