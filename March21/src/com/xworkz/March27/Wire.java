package com.xworkz.March27;

public class Wire {

    private String quality;
    private String color;

    public void current(String quality,String color){
        this.quality=quality;
        this.color=color;
        System.out.println("Running quality in method current in class in wire :"+quality);
        System.out.println("Running color in method current in class in wire :"+color);

    }

}
