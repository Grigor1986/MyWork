package oop.setterGetter;

import java.util.Scanner;

public class BankAccount {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        if (amount < 0 || amount > balance) {
            return;
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
        int inputAmount = scanner.nextInt();
        account.withdraw(inputAmount);
        System.out.println(account.getBalance());
    }
}
