package com.xworkz.inheritance.internal;

public class Slipper extends Footwear{
    public Slipper(){
        System.out.println("Running no arg const Slipper");
    }

    @Override
    public void wearing(){
        System.out.println("Running wearing");
    }
    @Override
    public void removing(){
        System.out.println("Running removing");
    }

}
