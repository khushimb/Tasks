package com.xworkz.inheritance.internal;

public class Sunglasses extends Shades{
    public Sunglasses(){
        System.out.println("Running no arg const sun glasses");
    }

    @Override
    public void clean(){
        System.out.println("Running clean");
    }
    @Override
    public void wear(){
        System.out.println("Running wear");
    }
}
