import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();
        double result = 0;

        if (operation.equals("add")) {
            result = n1 + n2;
        } else if (operation.equals("subtract")){
            result = n1 - n2;
        } else if (operation.equals("divide")) {
            result = n1 / n2;
        } else if (operation.equals("multiply")) {
            result = n1 * n2;
        }

        DecimalFormat df = new DecimalFormat("0.##");
        String formattedResult = df.format(result);

        System.out.println(formattedResult);
    }
}
