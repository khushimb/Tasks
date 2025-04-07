package com.xworkz.inheritance.internal;

public class Vehicle extends Car {

    public Vehicle(){
        System.out.println("Running vehicle no const ");
    }
    @Override
    public void drive(){
        System.out.println("Running drive method in Car");
    }

    @Override
    public void park(){
        System.out.println("Running park method in Car");
    }


}
