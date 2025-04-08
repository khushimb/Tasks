package com.xworkz.inheritance.internal;

public class Apple extends Fruit{

    public Apple(){
        System.out.println("Running no arg const apple");
    }

    @Override
    public void eat(){
        System.out.println("Running eat");
    }

    @Override
    public void cut(){
        System.out.println("Running cut");
    }

 public void pick(){
        System.out.println("Running pick");
    }

 public void grow(){
        System.out.println("Running grow");
    }

 public void vomit(){
        System.out.println("Running vomit");
    }


}
