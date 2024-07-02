import java.util.Scanner;

public class FaceOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        double face = 0;

        if (figure.equals("square")) {
            double n = Double.parseDouble(scanner.nextLine());
            face = n * n;
        } else if (figure.equals("rectangle")) {
            double n1 = Double.parseDouble(scanner.nextLine());
            double n2 = Double.parseDouble(scanner.nextLine());
            face = n1 * n2;
        } else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            face = Math.PI * r * r;
        } else if (figure.equals("triangle")) {
            double n = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            face = (n * h) / 2;
        }
        System.out.printf("%.2f", face);
    }
}
