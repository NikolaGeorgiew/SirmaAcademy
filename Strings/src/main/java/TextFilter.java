import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(" ");
        String text = scanner.nextLine();

        for (String bannedWord :
                bannedWords) {
         String replacement = "*".repeat(bannedWord.length());
         text = text.replaceAll("\\b" + bannedWord + "\\b", replacement);
        }

        System.out.println(text);
    }
}
