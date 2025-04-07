package com.xworkz.inheritance.internal;

public class Tablet extends Device{

    public Tablet(){
        System.out.println("Running no arg const tablet");
    }

    @Override
    public void operate(){
        System.out.println("Running operate");
    }
    @Override
    public void destroy(){
        System.out.println("Running operate");
    }
}
