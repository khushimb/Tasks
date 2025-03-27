package com.xworkz.March27;

public class Screw {

    private int counts;
    private String color;

    public void fix(int counts,String color){
        this.counts=counts;
        this.color=color;
        System.out.println("Running counts in method fix in class screw :"+counts);
        System.out.println("Running color in method fix in class screw :"+color);
    }
}
