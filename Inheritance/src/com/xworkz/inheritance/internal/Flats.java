package com.xworkz.inheritance.internal;

public class Flats extends Footwear{
    public void wear(Footwear footwear) {
        footwear.wearing();
        if (footwear instanceof Flats) {
            Flats flats = (Flats) footwear;
            flats.remove();
        }
    }
    public void remove(){
        System.out.println("Running remove in flats");
    }
}
