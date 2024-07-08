import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersAsStrings = scanner.nextLine().split(" ");
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String numbStr :
                numbersAsStrings) {
         double num = Double.parseDouble(numbStr);
         String formattedNum = String.format("%.1f", num);
         counts.put(formattedNum, counts.getOrDefault(formattedNum, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
