package com.xworkz.March27;

public class Panel {

    private String brand;
    private int price;

    public void show(String brand,int price){
        this.brand=brand;
        this.price=price;
        System.out.println("Running brand in method show in class panel :"+brand);
        System.out.println("Running price in method show in class panel :"+price);
    }
}
