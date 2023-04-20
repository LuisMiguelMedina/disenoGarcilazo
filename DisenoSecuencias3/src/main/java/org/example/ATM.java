package org.example;

public class ATM {
    Bank theirBank = new Bank();
    public void withdrawCash(int accountNumber, double amount){
        double balance = theirBank.account.getBalance(accountNumber);
        if (amount <= balance){
            theirBank.debit(accountNumber, amount);
        }
    }
}
