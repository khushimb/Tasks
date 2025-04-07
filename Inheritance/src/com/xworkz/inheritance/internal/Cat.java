package com.xworkz.inheritance.internal;

public class Cat extends Pet{

    public Cat(){
        System.out.println("Running no arg const cat");
    }

    @Override
    public void smell(){
        System.out.println("Running smell");
    }
    @Override
    public void feed(){
        System.out.println("Running feed");
    }
}
