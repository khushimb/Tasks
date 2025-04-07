package com.xworkz.inheritance.internal;

public class Bitcoin extends Coin{
    public Bitcoin(){
        System.out.println("running no arg const bit coin");
    }

    @Override
    public void metalCoin(){
        System.out.println("Running metal coin");
    }
    @Override
    public void steelCoin(){
        System.out.println("Running steel coin");
    }
}
