package com.xworkz.inheritance.internal;

public class Architecture extends TajMahal{
    public void build(TajMahal tajMahal){
        tajMahal.build();
        if(tajMahal instanceof Architecture){
            Architecture architecture = (Architecture) tajMahal;
            architecture.destroy();
        }
    }
    public void destroy(){
        System.out.println("Running destroy in architecture");
    }
}
