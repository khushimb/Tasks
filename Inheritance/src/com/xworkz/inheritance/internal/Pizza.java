package com.xworkz.inheritance.internal;

public class Pizza extends Food{

    public Pizza(){
        System.out.println("Running no arg const pizza");
    }

    @Override
    public void eat(){
        System.out.println("Running eat");
    }
    @Override
    public void cook(){
        System.out.println("Running cook");
    }
}
