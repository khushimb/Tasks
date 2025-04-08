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

     public void build1(){
        System.out.println("Running build1");
    }

     public void build2(){
        System.out.println("Running build2");
    }

     public void build3(){
        System.out.println("Running build3");
    }


}
