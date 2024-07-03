package BankAccount;

public class BankAccount {
    private static int accountCounter = 1;

    private int id;
    private double balance;
    private double interestRate = 0.02;

    public BankAccount() {
        this.id = accountCounter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void setInterestRate(double interest) {
        this.interestRate = interest;
    }

    public double getInterestRate(int years) {
        return this.balance * interestRate * years;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
