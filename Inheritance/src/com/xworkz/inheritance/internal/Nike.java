package com.xworkz.inheritance.internal;

public class Nike extends Brand{

    public Nike(){
        System.out.println("Running no arg const nike");
    }

    @Override
    public void buy(){
        System.out.println("Running buy");
    }
    @Override
    public void sell(){
        System.out.println("Running sell");
    }
}
