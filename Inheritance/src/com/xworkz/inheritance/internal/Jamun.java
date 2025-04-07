package com.xworkz.inheritance.internal;

public class Jamun extends Sweet{
    public Jamun(){
        System.out.println("Running no arg const jamun");
    }

    @Override
    public void prepare(){
        System.out.println("Running prepare");
    }
    @Override
    public void fry(){
        System.out.println("Running fry");
    }
}
