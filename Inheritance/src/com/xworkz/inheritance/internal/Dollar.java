package com.xworkz.inheritance.internal;

public class Dollar extends Currency{

    public Dollar(){
        System.out.println("Running no arg const dollar");
    }

    @Override
    public void pay(){
        System.out.println("Running  pay");
    }
    @Override
    public void debt(){
        System.out.println("Running  debt");
    }
}
