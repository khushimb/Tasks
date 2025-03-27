package com.xworkz.association;

public class Battery {

    private String power;
    private int volts;

    public Battery(String power,int volts){
        this.power=power;
        this.volts=volts;
        System.out.println("Running const battery");
    }

    public void showBaterry(){
        System.out.println("Running method show battery");
    }




}
