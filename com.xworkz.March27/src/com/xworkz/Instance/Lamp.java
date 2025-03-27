package com.xworkz.Instance;
import com.xworkz.association.Warranty;

public class Lamp {

    private String color;
    private String brand;
    private Warranty warranty;

    public void light(String color,String brand){
        this.color=color;
        this.brand=brand;
        System.out.println("Running light of color in Lamp :"+color);
        System.out.println("Running light of brand in Lamp :"+brand);


    }



}
