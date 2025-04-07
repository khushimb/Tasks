package com.xworkz.inheritance.internal;

public class Savingacc extends Account{

    public Savingacc(){
        System.out.println("Running no arg const savings account");
    }

    @Override
    public void close(){
        System.out.println("Running close");
    }
    @Override
    public void act(){
        System.out.println("Running act");
    }
}
