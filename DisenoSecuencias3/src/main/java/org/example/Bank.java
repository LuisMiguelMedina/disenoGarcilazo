package org.example;

public class Bank {
    Check theCheck = new Check();
    CheckingAccount account = new CheckingAccount();
    public void init(){
        double amount = theCheck.getAmount();
        double balance = account.getBalance();
        int checkNumber = theCheck.getNumber();
        if(balance >= amount){
            account.addDebitTransaction(checkNumber,amount);
            account.storePhotoOfCheck(theCheck);
        }else {
            account.addInsufficientFoundFree();
            account.noteReturnedCheck(theCheck);
            this.returnCheck(theCheck);
        }
    }
    public void returnCheck(Check theCheck){

    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.init();
    }
}
