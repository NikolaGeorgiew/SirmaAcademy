public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int sum = i * j;
                System.out.printf("%d * %d = %d" , i, j, sum);
                sum = 0;
                System.out.println();
            }
        }
    }
}
