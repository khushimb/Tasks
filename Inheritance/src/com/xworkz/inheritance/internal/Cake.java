package com.xworkz.inheritance.internal;

public class Cake extends Dessert{

    public Cake(){
        System.out.println("Running no arg const cake");
    }

    @Override
    public void eat(){
        System.out.println("Running eat");
    }
    @Override
    public void cut(){
        System.out.println("Running cut");
    }
}
