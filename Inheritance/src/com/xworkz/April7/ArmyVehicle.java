package com.xworkz.April7;

public class ArmyVehicle extends MRFTyre {

    public void wheel(Rubber rubber){
        System.out.println("Running wheel");
        rubber.expand();
    }
}
