import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaber = Double.parseDouble(scanner.nextLine());
        double robe = Double.parseDouble(scanner.nextLine());
        double belt = Double.parseDouble(scanner.nextLine());

        double beltFinalPrice = 0;
        double lightsaberFinalPrice = lightsaber * Math.ceil(students * 1.10);

        if (students >= 6 && students % 6 == 0) {
            int tempStudents = students;
            tempStudents = tempStudents - (tempStudents / 6);
            beltFinalPrice = (belt * tempStudents);
        } else {
            beltFinalPrice = students * belt;
        }

        double totalSum = lightsaberFinalPrice + (students * robe) + beltFinalPrice;

        if (totalSum <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            double diff = totalSum - budget;
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }
    }
}
