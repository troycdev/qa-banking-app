package org.example;

public class BankAccount {
    private float balance;
    private float minimumBalance;
    private String accountHolderName;

    public BankAccount(float balance, float minimumBalance, String accountHolderName) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(float amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Cannot deposit a negative amount.");
        }

        balance += amount;
    }

    public void withdraw(float amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Cannot withdraw a negative amount.");
        }

        if (balance - amount < minimumBalance) {
            throw new Exception("Account balance would fall below minimum balance.");
        }

        balance -= amount;
    }

    public float getBalance() {
        return balance;
    }

    public float getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(float minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String toString() {
        return getAccountHolderName() + "'s bank account has a balance of " + getBalance() + ". The minimum balance is " + getMinimumBalance() + ".";
    }
}
