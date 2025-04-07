package com.xworkz.inheritance.internal;

public class Aprilla extends Bike{
    public void drive(Bike bike){
        bike.car();
        if(bike  instanceof Aprilla){
            Aprilla aprilla = (Aprilla) bike;
            aprilla.ditch();
        }
    }
    public void ditch(){
        System.out.println("Running ditchin aprilla");
    }
}
