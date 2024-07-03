package CarInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] info = scanner.nextLine().split(" ");
            String brand = info[0];
            String model = info[1];
            int horsePower = Integer.parseInt(info[2]);
            Car car = new Car(brand, model, horsePower);
            cars.add(car);
        }
        for (Car car:
             cars) {
            System.out.printf("Info: %s%n", car.carInfo());

        }
    }

}
