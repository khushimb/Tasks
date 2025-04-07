package com.xworkz.inheritance.internal;

public class TableStand extends Light{
    public void keep(Light light){
        light.on();
        if(light instanceof TableStand){
            TableStand tableStand = (TableStand) light;
            tableStand.off();
        }
    }
    public void off(){
        System.out.println("Running off in table stand");
    }
}
