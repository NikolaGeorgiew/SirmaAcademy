import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, ArrayList<Double>> studentRecords = new TreeMap<>();
        for (int i = 1; i <= n; i++) {
            String[] info = scanner.nextLine().split(" ");
            String name = info[0];
            double grade = Double.parseDouble(info[1]);

            if (!studentRecords.containsKey(name)) {
                studentRecords.put(name, new ArrayList<>());
            }
            studentRecords.get(name).add(grade);
        }

        for (Map.Entry<String, ArrayList<Double>> entry : studentRecords.entrySet()) {
            String studentName = entry.getKey();
            ArrayList<Double> grades = entry.getValue();
            double average = grades.stream().mapToDouble(Double::doubleValue).average().orElse(0);

            System.out.print(studentName + " -> ");
            for (Double grade : grades) {
                System.out.print(String.format("%.2f", grade) + " ");
            }
            System.out.println(String.format("(avg: %.2f)", average));
        }
    }
}
