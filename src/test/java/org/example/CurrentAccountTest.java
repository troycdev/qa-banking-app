package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CurrentAccountTest {
    CurrentAccount currentAccount;

    @Before
    public void setUp() {
        currentAccount = new CurrentAccount(0.0f, 0.0f, "Bob", 100.0f);
    }

    @Test
    public void withdrawTest() throws Exception {
        currentAccount.deposit(100f);
        currentAccount.withdraw(90.50f);
        Assert.assertEquals(currentAccount.getBalance(), 9.50f, 0.0);

        Exception ex = Assert.assertThrows(Exception.class, () -> currentAccount.withdraw(150.0f));
        Assert.assertEquals("Amount is above maximum withdrawal amount.", ex.getMessage());
    }

    @Test
    public void getMaximumWithdrawalAmountTest() {
        Assert.assertEquals(currentAccount.getMaximumWithdrawalAmount(), 100.0f, 0.0f);
    }

    @Test
    public void setMaximumWithdrawalAmountTest() {
        Assert.assertEquals(currentAccount.getMaximumWithdrawalAmount(), 100.0f, 0.0f);
        currentAccount.setMaximumWithdrawalAmount(150.0f);
        Assert.assertEquals(currentAccount.getMaximumWithdrawalAmount(), 150.0f, 0.0f);
    }
}
