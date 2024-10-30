package org.example;

public class SavingsAccount extends BankAccount {
    private float interestRate;

    public SavingsAccount(float balance, float minimumBalance, String accountHolderName, float interestRate) {
        super(balance, minimumBalance, accountHolderName);
        this.interestRate = interestRate;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public String toString() {
        return getAccountHolderName() + "'s bank account has a balance of £" + getBalance() + ". The minimum balance is £" + getMinimumBalance() + " and the interest rate is " + getInterestRate() + "%.";
    }
}