package com.xworkz.ObjectToString.internal;

public class Avatar {

    private int round;
    private int square;
    private int circle;


    public Avatar(int round,int square,int circle){
        this.round=round;
        this.square=square;
        this.circle=circle;

    }

    @Override
    public String toString(){
        return "Round:"+round+"Square:"+square+"Circle:"+circle;
    }
}
