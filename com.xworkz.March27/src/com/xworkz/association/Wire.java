package com.xworkz.association;

public class Wire {

    private Quality quality;

    public Wire(Quality quality){
        this.quality=quality;
        System.out.println("Running const wire");
    }

    public void showWire(){
        this.quality.showQuality();
        System.out.println("Running method show wire");
    }
}
