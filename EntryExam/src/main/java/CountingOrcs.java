import java.util.Scanner;

public class CountingOrcs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());


        //purviq chas - 5
        //vtoriq chas - 7
        //tretiq chas - 9
        int sum = 0;

        for (int i = 1; i <= h; i++) {
            sum += n;
            n += m;
        }
        System.out.println(sum);
    }
}
