package com.xworkz.inheritance.internal;

public class Seeds extends Lotusseeds{
    public Seeds(){
        System.out.println("Running no arg const seeds");
    }

    @Override
    public void plant(){
        System.out.println("Running plant");
    }
    @Override
    public void takeOut(){
        System.out.println("Running takeout");
    }
}
