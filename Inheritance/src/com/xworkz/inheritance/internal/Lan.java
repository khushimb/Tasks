package com.xworkz.inheritance.internal;

public class Lan extends Network{

    public Lan(){
        System.out.println("Running no arg const ");
    }

    @Override
    public void speed(){
        System.out.println("Running speed");
    }
    @Override
    public void slow(){
        System.out.println("Running speed");
    }
}
