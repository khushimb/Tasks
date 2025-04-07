package com.xworkz.inheritance.internal;

public class Helicopter extends Vehicle{
    public void fly(Vehicle vehicle){
        vehicle.park();
        if(vehicle instanceof Helicopter){
            Helicopter helicopter = (Helicopter) vehicle;
            helicopter.park();
        }
    }
    public void park(){
        System.out.println("Running park in helicopter");
    }
}
