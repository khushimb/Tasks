package com.xworkz.inheritance.internal;

public class WoodStick extends Hammer{
    public void beat(Hammer hammer){
        hammer.screw();
        if(hammer instanceof WoodStick){
            WoodStick woodStick = (WoodStick) hammer;
            woodStick.method();
        }
    }
    public void method(){
        System.out.println("Running method in woodstick");
    }
}
