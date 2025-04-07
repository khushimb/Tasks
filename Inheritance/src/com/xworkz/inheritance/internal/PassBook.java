package com.xworkz.inheritance.internal;

public class PassBook extends Account {
    public void checkBalance(Account account){
        account.act();
        if(account instanceof PassBook){
            PassBook passBook = (PassBook) account;
            passBook.withDraw();
        }
    }
    public void withDraw(){
        System.out.println("running with draw method");
    }


}
