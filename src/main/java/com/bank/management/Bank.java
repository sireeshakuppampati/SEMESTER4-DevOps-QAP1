package com.bank.management;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    public void createAccount(String accountHolder, double initialBalance) {
        accounts.put(accountHolder, new Account(accountHolder, initialBalance));
    }

    public Account getAccount(String accountHolder) {
        return accounts.get(accountHolder);
    }

    public boolean accountExists(String accountHolder) {
        return accounts.containsKey(accountHolder);
    }
}
