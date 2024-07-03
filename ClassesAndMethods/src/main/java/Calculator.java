import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if (command.equals("add")){
            System.out.println(add(num1,num2));
        } else if (command.equals("multiply")){
            System.out.println(add(num1,num2));
        } else if (command.equals("subtract")) {
            System.out.println(subtract(num1,num2));
        } else if (command.equals("divide")){
            System.out.println(divide(num1,num2));
        }
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiply(int num1, int num2) {
        return  num1 * num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}
