package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SavingsAccountTest {
    SavingsAccount savingsAccount;

    @Before
    public void setUp() {
        savingsAccount = new SavingsAccount(0.0f, 0.0f, "Bob", 2.3f);
    }

    @Test
    public void getInterestRateTest() {
        Assert.assertEquals(savingsAccount.getInterestRate(), 2.3f, 0.0f);
    }

    @Test
    public void setInterestRateTest() {
        Assert.assertEquals(savingsAccount.getInterestRate(), 2.3f, 0.0f);
        savingsAccount.setInterestRate(0.5f);
        Assert.assertEquals(savingsAccount.getInterestRate(), 0.5f, 0.0f);
    }
}
