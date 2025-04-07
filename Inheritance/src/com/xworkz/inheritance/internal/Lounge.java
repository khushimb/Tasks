package com.xworkz.inheritance.internal;

public class Lounge extends Sky{
    public void see(Sky sky){
        sky.fall();
        if(sky instanceof Lounge){
            Lounge lounge= (Lounge) sky;
            lounge.watch();
        }
    }
    public void watch(){
        System.out.println("Running watch in lounge");
    }
}
