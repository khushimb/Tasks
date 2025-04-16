package com.xworkz.classinter.internal;

public class Circle implements Shape{
    @Override
    public void edit() {
        System.out.println("running edit");
    }

    @Override
    public void draw() {
        System.out.println("running draw");

    }

    @Override
    public void write() {
        System.out.println("running write");

    }
}
