package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(100.0f, 0.0f, "Alice");
        BankAccount ba2 = new BankAccount(1425.40f, 0.0f, "Bob");
        BankAccount ba3 = new BankAccount(-203.2f, -500.0f, "Charlie");

        CurrentAccount ca1 = new CurrentAccount(100.0f, 0.0f, "Alice", 100.0f);
        CurrentAccount ca2 = new CurrentAccount(1425.40f, 0.0f, "Bob", 50.0f);
        CurrentAccount ca3 = new CurrentAccount(-203.2f, -500.0f, "Charlie", 500.0f);

        SavingsAccount sa1 = new SavingsAccount(100.0f, 0.0f, "Alice", 3.4f);
        SavingsAccount sa2 = new SavingsAccount(1425.40f, 0.0f, "Bob", 1.2f);
        SavingsAccount sa3 = new SavingsAccount(203.2f, 0.0f, "Charlie", 5.3f);

        BankAccount[] accounts = {ba1, ba2, ba3, ca1, ca2, ca3, sa1, sa2, sa3};

        for (BankAccount ba : accounts) {
            System.out.println(ba.toString());
        }
    }
}