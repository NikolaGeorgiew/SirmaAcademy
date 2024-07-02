import java.util.Scanner;

public class UniversityAdmissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = Integer.parseInt(scanner.nextLine());
        int extracurriculars = Integer.parseInt(scanner.nextLine());
        String isAdmitted = "";

        if (score >= 90) {
            isAdmitted = "Admitted";
        } else if (score >= 80 && score <= 89 && extracurriculars >= 2) {
            isAdmitted = "Admitted";
        } else {
            isAdmitted = "Not admitted";
        }
        System.out.println(isAdmitted);
    }
}
