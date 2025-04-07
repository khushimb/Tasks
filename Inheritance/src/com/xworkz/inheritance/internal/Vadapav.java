package com.xworkz.inheritance.internal;

public class Vadapav extends Snack{
    public Vadapav(){
        System.out.println("Running no arg const vadapav");
    }

    @Override
    public void tasty(){
        System.out.println("Running tasty");
    }
    @Override
    public void smell(){
        System.out.println("Running smell");
    }
}
