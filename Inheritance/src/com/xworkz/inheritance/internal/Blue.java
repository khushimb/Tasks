package com.xworkz.inheritance.internal;

public class Blue extends Color{

    public Blue(){
        System.out.println("Running no arg const blue");
    }

    @Override
    public void pink(){
        System.out.println("Running pink");
    }
    @Override
    public void green(){
        System.out.println("Running green");
    }
}
