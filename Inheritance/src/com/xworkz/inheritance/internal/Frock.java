package com.xworkz.inheritance.internal;

public class Frock extends Dress{

    public Frock(){
        System.out.println("Running no arg const Frock");
    }

    @Override
    public void wear(){
        System.out.println("Running wear");
    }
    @Override
    public void tear(){
        System.out.println("Running tear");
    }
}
