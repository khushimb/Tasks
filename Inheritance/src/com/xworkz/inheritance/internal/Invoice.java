package com.xworkz.inheritance.internal;

public class Invoice extends Doc{
    public Invoice(){
        System.out.println("Running no arg invoice");
    }

    @Override
    public void read(){
        System.out.println("Running read");
    }
    @Override
    public void write(){
        System.out.println("Running write");
    }
}
