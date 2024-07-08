import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int startIndexFile = 0;
        int startIndexExtension = 0;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol == '\\') {
                startIndexFile = i;
            }

            if (symbol == '.') {
                startIndexExtension = i;
            }
        }
        String fileName = input.substring(startIndexFile + 1, startIndexExtension);
        String extension = input.substring(startIndexExtension, input.length());

        System.out.println("File name: " + fileName);
        System.out.println("File extension " + extension);
    }
}
