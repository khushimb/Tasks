package com.xworkz.inheritance.internal;

public class Wifi extends Network{
    public void search(Network network){
        network.speed();
        if(network instanceof Wifi){
            Wifi wifi = (Wifi) network;
            wifi.connect();
        }
    }
    public void connect(){
        System.out.println("Running connect in wifi");
    }
}
