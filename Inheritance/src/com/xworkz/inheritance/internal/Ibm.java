package com.xworkz.inheritance.internal;

public class Ibm extends WashingMachine{
    public void wash(WashingMachine washingMachine){
        washingMachine.dry();
        if(washingMachine instanceof Ibm){
            Ibm ibm = (Ibm) washingMachine;
            ibm.dry();
        }
    }
    public void dry(){
        System.out.println("running dry in ibm");
    }
}
