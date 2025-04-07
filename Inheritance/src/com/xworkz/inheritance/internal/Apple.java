package com.xworkz.inheritance.internal;

public class Apple extends Fruit{

    public Apple(){
        System.out.println("Running no arg const apple");
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
