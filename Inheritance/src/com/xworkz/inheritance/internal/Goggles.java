package com.xworkz.inheritance.internal;

public class Goggles extends Specs {
    public Goggles(){
        System.out.println("Running no arg const goggles");
    }

    @Override
    public void wear(){
        System.out.println("Running wear");
    }
    @Override
    public void remove(){
        System.out.println("Running remove");
    }
}
