import java.util.Scanner;

public class AddressByAgeAndGender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String gender = scanner.nextLine();

        if (gender.equals("m")) {
            if (age < 16) {
                System.out.println("Master");
            } else if (age >= 16) {
                System.out.println("Mr.");
            }
        } else if (gender.equals("f")) {
            if (age < 16) {
                System.out.println("Miss");
            } else if (age >= 16) {
                System.out.println("Ms.");
            }
        }
    }
}
