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
    public void insert()
    {
        System.out.println("Running insert method in Shape");
    }
    public void half()
    {
        System.out.println("Running half method in half");
    }
    public void full()
    {
        System.out.println("Running full method in Shape");
    }
    public void semi()
    {
        System.out.println("Running semi method in Shape");
    }


}
