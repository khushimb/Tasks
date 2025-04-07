package com.xworkz.inheritance.internal;

public class Tshirt extends Clothing{
    public Tshirt(){
        System.out.println("Running no arg const tshirt");
    }

    @Override
    public void wear(){
        System.out.println("Running wear");
    }
    @Override
    public void stitch(){
        System.out.println("Running stitch");
    }
}
