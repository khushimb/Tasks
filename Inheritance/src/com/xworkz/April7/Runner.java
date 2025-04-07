package com.xworkz.April7;

public class Runner {
    public static void main(String[] args) {
        Rubber rubber = new Tyre();
        rubber.expand();

        Tyre tyre = new Tyre();
        tyre.expand();
        tyre.compress();

        Rubber rubber1 = new Rubber();
        rubber1.expand();

        MRFTyre mrfTyre= new MRFTyre();
        mrfTyre.expand();
        mrfTyre.compress();
        mrfTyre.radial();
        ArmyVehicle armyVehicle = new ArmyVehicle();
        armyVehicle.wheel(rubber);
        armyVehicle.wheel(tyre);
        armyVehicle.wheel(rubber1);
        armyVehicle.wheel(mrfTyre);


    }
}
