package org.example;

public class CurrentAccount extends BankAccount {
    private float maximumWithdrawalAmount;

    public CurrentAccount(float balance, float minimumBalance, String accountHolderName, float maximumWithdrawalAmount) {
        super(balance, minimumBalance, accountHolderName);
        this.maximumWithdrawalAmount = maximumWithdrawalAmount;
    }

    @Override
    public void withdraw(float amount) throws Exception {
        if (amount > maximumWithdrawalAmount) {
            throw new Exception("Amount is above maximum withdrawal amount.");
        }

        super.withdraw(amount);
    }

    public float getMaximumWithdrawalAmount() {
        return maximumWithdrawalAmount;
    }

    public void setMaximumWithdrawalAmount(float maximumWithdrawalAmount) {
        this.maximumWithdrawalAmount = maximumWithdrawalAmount;
    }

    public String toString() {
        return getAccountHolderName() + "'s bank account has a balance of £" + getBalance() + ". The minimum balance is £" + getMinimumBalance() + " and the maximum withdrawal amount is £" + getMaximumWithdrawalAmount() + ".";
    }
}
