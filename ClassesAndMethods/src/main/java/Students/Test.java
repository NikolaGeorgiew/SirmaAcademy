package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] inputArr = input.split(" ");
            String firstName = inputArr[0];
            String lastName = inputArr[1];
            int age = Integer.parseInt(inputArr[2]);
            String homeTown = inputArr[3];
            Student student = new Student(firstName, lastName, age, homeTown);
            students.add(student);

            input = scanner.nextLine();
        }
        String cityName = scanner.nextLine();

        for (Student student :
                students) {
            if (student.getHomeTown().equals(cityName)){
                System.out.println(student);
            }
        }
    }
}
