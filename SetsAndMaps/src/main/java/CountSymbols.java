import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        TreeMap<Character, Integer> charactersCount = new TreeMap<>();

        for (char c : input.toCharArray()) {
            if (c != ' ') {
                charactersCount.put(c, charactersCount.getOrDefault(c, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charactersCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
