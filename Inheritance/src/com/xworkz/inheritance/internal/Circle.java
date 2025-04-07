package com.xworkz.inheritance.internal;

public class Circle extends Shape{

    public Circle(){
        System.out.println("Running no arg const circle");
    }

    @Override
    public void draw(){
        System.out.println("Running draw method in Shape");
    }

    @Override
    public void insert(){
        System.out.println("Running draw method in Shape");
    }
}
