package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
    BankAccount bankAccount;

    @Before
    public void setUp() {
        bankAccount = new BankAccount(0.0f, 0.0f, "Bob");
    }

    @Test
    public void depositTest() throws Exception {
        bankAccount.deposit(10.50f);
        Assert.assertEquals(bankAccount.getBalance(), 10.50f, 0.0);

        Exception ex1 = Assert.assertThrows(Exception.class, () -> bankAccount.deposit(-100.0f));
        Assert.assertEquals("Cannot deposit a negative amount.", ex1.getMessage());
    }

    @Test
    public void withdrawTest() throws Exception {
        bankAccount.deposit(100f);
        bankAccount.withdraw(90.50f);
        Assert.assertEquals(bankAccount.getBalance(), 9.50f, 0.0);

        Exception ex1 = Assert.assertThrows(Exception.class, () -> bankAccount.withdraw(-100.0f));
        Assert.assertEquals("Cannot withdraw a negative amount.", ex1.getMessage());

        Exception ex2 = Assert.assertThrows(Exception.class, () -> bankAccount.withdraw(100.0f));
        Assert.assertEquals("Account balance would fall below minimum balance.", ex2.getMessage());
    }

    @Test
    public void getBalanceTest() throws Exception {
        Assert.assertEquals(bankAccount.getBalance(), 0.0f, 0.0);
        bankAccount.deposit(100f);
        Assert.assertEquals(bankAccount.getBalance(), 100f, 0.0);
    }

    @Test
    public void getMinimumBalanceTest() {
        Assert.assertEquals(bankAccount.getMinimumBalance(), 0.0f, 0.0f);
    }

    @Test
    public void setMinimumBalanceTest() {
        Assert.assertEquals(bankAccount.getMinimumBalance(), 0.0f, 0.0f);
        bankAccount.setMinimumBalance(-10.0f);
        Assert.assertEquals(bankAccount.getMinimumBalance(), -10.0f, 0.0f);
    }

    @Test
    public void getAccountHolderNameTest() {
        Assert.assertEquals(bankAccount.getAccountHolderName(), "Bob");
    }

    @Test
    public void setAccountHolderNameTest() {
        Assert.assertEquals(bankAccount.getAccountHolderName(), "Bob");
        bankAccount.setAccountHolderName("Alice");
        Assert.assertEquals(bankAccount.getAccountHolderName(), "Alice");
    }
}
