package com.xworkz.association;

public class Board {

    private Capacitor capacitor;

    public Board(Capacitor capacitor){
        this.capacitor=capacitor;
        System.out.println("Running const board");
    }

    public void showCapacitor(){
        this.capacitor.showCapacitor();
        System.out.println("Running method show capacitor");
    }
}
