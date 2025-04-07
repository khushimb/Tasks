package com.xworkz.inheritance.internal;

public class Earrings extends Metal{
    public void wear(Metal metal){
        metal.fix();
        if(metal instanceof Earrings){
            Earrings earrings = (Earrings) metal;
            earrings.remove();
        }
    }
    public void remove(){
        System.out.println("Running remove in earrings");
    }
}
