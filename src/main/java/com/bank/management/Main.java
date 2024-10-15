package com.bank.management;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount("John Doe", 1000.0);

        Account account = bank.getAccount("John Doe");
        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(300);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}
