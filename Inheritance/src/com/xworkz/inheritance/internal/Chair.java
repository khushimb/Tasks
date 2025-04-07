package com.xworkz.inheritance.internal;

public class Chair extends Furniture{

    public Chair(){
        System.out.println("running no arg const chair");
    }

@Override
    public void move(){
        System.out.println("Running move");
    }

    @Override
    public void build(){
        System.out.println("Running build");
    }

}
