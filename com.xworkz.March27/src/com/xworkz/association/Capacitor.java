package com.xworkz.association;

public class Capacitor {

    private String capacity;
    private String volts;

    public Capacitor(String capacity,String volts){
        this.capacity=capacity;
        this.volts=volts;
        System.out.println("Running const of capacitor");
    }

    public void showCapacitor(){
        System.out.println("Running method show capacitor");
    }
}
