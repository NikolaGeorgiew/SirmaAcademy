import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        if (type.equals("int")){
            int n1 = Integer.parseInt(scanner.nextLine());
            int n2 = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(n1,n2));
        } else if (type.equals("char")) {
            char char1 = scanner.nextLine().charAt(0);
            char char2 = scanner.nextLine().charAt(0);
            System.out.println(getMax(char1, char2));
        } else if (type.equals("String")) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(getMax(str1,str2));
        }
    }
    public static int getMax(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else if (n2 > n1) {
            return n2;
        } else {
            return n1;
        }
    }
    public static char getMax(char ch1, char ch2) {
        if (ch1 > ch2) {
            return ch1;
        } else if (ch2 > ch1) {
            return ch2;
        } else {
            return ch1;
        }
    }
    public static String getMax(String str1, String str2) {
        if (str1.compareTo(str2) > 0) {
            return str1;
        } else if (str1.compareTo(str2) < 0) {
            return str2;
        } else {
            return str1;
        }
    }
}
