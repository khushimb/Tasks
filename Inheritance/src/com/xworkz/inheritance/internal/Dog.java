package com.xworkz.inheritance.internal;

public class Dog extends Animal{

    public Dog(){
        System.out.println("Running dog no arg const");
    }

    @Override
    public void see() {

        System.out.println("Running see method in animal");
    }
    @Override
    public void bark() {
        System.out.println("Running bark method in animal");

    }



}
