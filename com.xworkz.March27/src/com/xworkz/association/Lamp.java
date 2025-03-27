package com.xworkz.association;

public class Lamp {

    private Warranty warranty;

    public Lamp(Warranty warranty){
        this.warranty=warranty;
        System.out.println("Running lamp const");
    }

    public void showlamp(){
       this.warranty.showwarranty();
        System.out.println("Running show lamp method");
    }
}
