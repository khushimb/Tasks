package com.xworkz.inheritance.internal;

public class Shirt extends Cloth{

    public Shirt(){
        System.out.println("Running no arg const shirt");
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
