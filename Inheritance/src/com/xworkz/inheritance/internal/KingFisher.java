package com.xworkz.inheritance.internal;

public class KingFisher extends Beer{
    public void getDrunk(Beer beer){
        beer.chug();
        if(beer instanceof KingFisher){
            KingFisher kingFisher = (KingFisher) beer;
            kingFisher.spill();
        }
    }
    public void spill(){
        System.out.println("Running spill in kingfisher");
    }
}
