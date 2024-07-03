package CarConstructor;

import java.util.ArrayList;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] info = scanner.nextLine().split(" ");
            String brand = "unknown";
            String model = "unknown";
            int horsePower = -1;
            if (info.length == 1) {
                brand = info[0];
                Car car = new Car(brand, model, horsePower);
                cars.add(car);
            } else if (info.length == 2) {
                brand = info[0];
                model = info[1];
                Car car = new Car(brand,model,horsePower);
                cars.add(car);
            } else if (info.length == 3) {
                brand = info[0];
                model = info[1];
                horsePower = Integer.parseInt(info[2]);
                Car car = new Car(brand, model, horsePower);
                cars.add(car);
            }
        }

        for (Car car :
                cars) {
            System.out.printf("The car is: %s HP.%n", car.carInfo());
        }
    }
}
