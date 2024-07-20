import java.util.Scanner;

public class OrthancArchivesSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(", ");
        String item = scanner.nextLine();
        int firstOccurenceIndex = -1;
        int lastOccurenceIndex = -1;
        boolean isFound = false;

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i].equals(item) && !isFound) {
                firstOccurenceIndex = i;
                lastOccurenceIndex = firstOccurenceIndex;
                isFound = true;
            } else if (inputArr[i].equals(item) && isFound) {
                lastOccurenceIndex = i;
            }
        }
        if (!isFound) {
            System.out.println("Record not found");
        } else {
            System.out.println("First Occurrence: " + firstOccurenceIndex);
            System.out.println("Last Occurrence: " + lastOccurenceIndex);
        }
    }
}
