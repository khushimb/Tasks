package com.xworkz.inheritance.internal;

public class Hammer extends Tool{

    public Hammer(){
        System.out.println("Running no arg const hammer");
    }


@Override
    public void screw(){
        System.out.println("Running screw");
    }

    @Override
    public void open(){
        System.out.println("Running open");
    }
}
