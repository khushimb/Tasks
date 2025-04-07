package com.xworkz.inheritance.internal;

public class Fever extends Disease{
    public void sweat(Disease disease){
        disease.takeTablet();
        if(disease instanceof Fever){
            Fever fever = (Fever) disease;
            fever.cold();
        }
    }
    public void cold(){
        System.out.println("Running cold in fever");
    }
}
