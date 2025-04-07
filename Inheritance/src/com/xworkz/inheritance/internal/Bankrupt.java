package com.xworkz.inheritance.internal;

public class Bankrupt extends Bank{
    public void checkBalance(Bank bank){
        bank.open();
        if(bank instanceof Bankrupt){
            Bankrupt bankrupt = (Bankrupt) bank;
            bankrupt.checkStatus();
        }
    }
    public void checkStatus(){
        System.out.println("Running check status in bankrupt");
    }
}
