package com.xworkz.inheritance.internal;

public class Pigeon extends Bird {

    public Pigeon(){
        System.out.println("Running no arg const Pigeon");
    }


@Override
    public void fly(){
        System.out.println("Running fly");
    }

    @Override
    public void eat(){
        System.out.println("Running eat");
    }


}
