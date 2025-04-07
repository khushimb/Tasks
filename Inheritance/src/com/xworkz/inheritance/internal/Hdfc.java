package com.xworkz.inheritance.internal;

public class Hdfc extends Bank{

    public Hdfc(){
        System.out.println("Running no arg const hdfc");
    }

    @Override
    public void open(){
        System.out.println("Rning open");
    }
    @Override
    public void close(){
        System.out.println("Running close");
    }
}
