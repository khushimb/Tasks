package com.xworkz.March25;

import static com.xworkz.March25.Satellitetype.LEO;

public class ChooseSatellite {

    Satellite satellite = new Satellite();

    public void display(){
        System.out.println(satellite.getSatellitetype());
        satellite.setSatellitetype(LEO);
        System.out.println(satellite.getCost());
        satellite.setCost(80);
        System.out.println(satellite.getWeight());
        satellite.setWeight(40);
        System.out.println(satellite.getLoadCapacity());
        satellite.setWeight(30);
    }
}
