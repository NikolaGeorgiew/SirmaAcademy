package Articles;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(",");
        String title = inputArr[0];
        String content = inputArr[1];
        String author = inputArr[2];
        Article article = new Article(title,content,author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String[] secondArr = scanner.nextLine().split(": ");
            String command = secondArr[0];
            String newContent = secondArr[1];
            if (command.equals("Edit")) {
                article.edit(newContent);
            } else if (command.equals("ChangeAuthor")) {
                article.changeAuthor(newContent);
            } else if (command.equals("Rename")) {
                article.rename(newContent);
            }
        }
        System.out.println(article);
    }
}
