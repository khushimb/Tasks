package com.xworkz.inheritance.internal;

public class Jet extends Airplane{
    public void flyHigh(Airplane airplane){
        airplane.ticket();
        if(airplane instanceof Jet){
            Jet jet = (Jet)airplane;
            jet.collectBag();
        }
    }
    public void collectBag(){
        System.out.println("Running collect bag");
    }
}
