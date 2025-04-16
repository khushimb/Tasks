package com.xworkz.classinter.internal;

public class Car implements Vehicle{
    @Override
    public void ride() {
        System.out.println("running ride");
    }

    @Override
    public void park() {
        System.out.println("running park");

    }

    @Override
    public void drive() {
        System.out.println("running drive");

    }
}
