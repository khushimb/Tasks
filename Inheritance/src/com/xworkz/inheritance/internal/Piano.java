package com.xworkz.inheritance.internal;

public class Piano extends Instrument{
    public void play(Instrument instrument){
        instrument.stop();
        if(instrument instanceof Piano){
            Piano piano = (Piano) instrument;
            piano.edit();
        }
    }
    public void edit(){
        System.out.println("Running edit in piano");
    }
}
