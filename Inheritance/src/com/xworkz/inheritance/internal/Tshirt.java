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
     public void stitch1(){
        System.out.println("Running stitch1");
    }
     public void stitch2(){
        System.out.println("Running stitch2");
    }
     public void stitch3(){
        System.out.println("Running stitch3");
    }

}
