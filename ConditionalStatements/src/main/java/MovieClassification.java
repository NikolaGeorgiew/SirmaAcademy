import java.util.Scanner;

public class MovieClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String result = "";

        if (age < 13) {
            result = "U-rated movies.";
        } else if (age >= 13 && age <=17) {
            result = "U and PG-13 rated movies";
        } else {
            result = "All movies";
        }
        System.out.println(result);
    }
}
