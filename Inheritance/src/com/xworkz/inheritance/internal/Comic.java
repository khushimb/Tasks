package com.xworkz.inheritance.internal;

public class Comic extends Books{
    public Comic(){
        System.out.println("Running no arg const comic");
    }

    @Override
    public void read(){
        System.out.println("Running read");
    }
    @Override
    public void tear(){
        System.out.println("Running tear");
    }
    public void roll(){
        System.out.println("Running roll");
    }
    public void write(){
        System.out.println("Running write");
    }
    public void author(){
        System.out.println("Running author");
    }

}
