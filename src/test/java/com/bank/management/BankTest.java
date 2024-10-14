package com.bank.management;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    @Test
    public void testCreateAccount() {
        Bank bank = new Bank();
        bank.createAccount("John Doe", 1000.0);
        assertTrue(bank.accountExists("John Doe"));
    }

    @Test
    public void testDeposit() {
        Bank bank = new Bank();
        bank.createAccount("John Doe", 1000.0);
        Account account = bank.getAccount("John Doe");
        account.deposit(500);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        Bank bank = new Bank();
        bank.createAccount("John Doe", 1000.0);
        Account account = bank.getAccount("John Doe");
        account.withdraw(400);
        assertEquals(600.0, account.getBalance());
    }
}
