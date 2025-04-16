package com.xworkz.classinter.internal;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Running eat");
    }

    @Override
    public void drink() {
        System.out.println("running drink");

    }

    @Override
    public void sleep() {
        System.out.println("running sleep");


    }
}
