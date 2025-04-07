package com.xworkz.inheritance.internal;

public class Dewars extends Whisky{
    public void drink(Whisky whisky){
        whisky.thirty();
        if(whisky instanceof Dewars){
            Dewars dewars = (Dewars) whisky;
            dewars.chug();
        }
    }
    public void chug(){
        System.out.println("Running chug in dewars");
    }
}
