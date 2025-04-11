package com.xworkz.ObjectToString.internal;

import java.util.Objects;

public class Tshirt {

    private String brand;
    private char size;
    private String color;

    public Tshirt(String brand,char size,String color){
        this.brand=brand;
        this.size=size;
        this.color=color;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Tshirt) {
                System.out.println("ref is Tshirt ");
                Tshirt tshirt = this;
                Tshirt tshirt1 = (Tshirt) obj;
                if (tshirt.brand.equals(tshirt1.brand) && tshirt.size == tshirt1.size && tshirt.color.equals(tshirt1.color)) {
                    System.out.println("both Tshirts are same");
                    return true;
                }
            }
        }
return false;
    }



}
