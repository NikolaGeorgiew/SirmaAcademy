package BankAccount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<BankAccount> list = new ArrayList<>();

        while (!input.equals("End")) {
            String[] inputArr = input.split(" ");
            String command = inputArr[0];

            if (command.equals("Create")) {
                BankAccount bankAccount = new BankAccount();
                list.add(bankAccount);
                System.out.printf("Account ID%s created%n", bankAccount.getId());

            } else if (command.equals("Deposit")) {
                int id = Integer.parseInt(inputArr[1]);
                double amount = Double.parseDouble(inputArr[2]);
                List<BankAccount> sorted = list.stream().filter(ba -> ba.getId() == id).toList();
                if (sorted.size() == 0) {
                    System.out.println("Account does not exist");
                } else {
                    sorted.get(0).deposit(amount);
                    System.out.printf("Deposited %.0f to ID%d%n", amount, id);
                }

            } else if (command.equals("SetInterest")) {
                double interestRate = Double.parseDouble(inputArr[1]);
                for (BankAccount bankAccount :
                        list) {
                    bankAccount.setInterestRate(interestRate);

                }
            } else if (command.equals("GetInterest")) {
                int id = Integer.parseInt(inputArr[1]);
                int years = Integer.parseInt(inputArr[2]);

                List<BankAccount> sorted = list.stream().filter(ba -> ba.getId() == id).toList();

                if (sorted.size() == 0) {
                    System.out.println("Account does not exist");
                } else {
                    System.out.printf("%.2f%n", sorted.get(0).getInterestRate(years));
                }
            }

            input = scanner.nextLine();
        }
    }
}
