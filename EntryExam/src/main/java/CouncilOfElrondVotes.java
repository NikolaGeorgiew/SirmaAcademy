import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CouncilOfElrondVotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(", ");
        List<String> yesList = new ArrayList<>();
        List<String> noList = new ArrayList<>();
        List<String>  abstainList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Yes")) {
                yesList.add(arr[i]);
            } else if (arr[i].equals("No")) {
                noList.add(arr[i]);
            } else if (arr[i].equals("Abstain")) {
                abstainList.add(arr[i]);
            }
        }

        if (yesList.size() > noList.size()) {
            System.out.println("Yes");
        } else if (noList.size() > yesList.size()) {
            System.out.println("No");
        } else if (yesList.size() == 0 && noList.size() == 0 && abstainList.size() > 0){
            System.out.println("Abstain");
        } else {
            System.out.println("Tie");
        }

    }
}
