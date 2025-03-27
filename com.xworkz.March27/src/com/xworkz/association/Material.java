package com.xworkz.association;

public class Material{

    private String color;
    private String brand;

    public Material(String color,String brand){
        this.color=color;
        this.brand=brand;
        System.out.println("Running const material");
    }

    public void showMaterial(){
        System.out.println("Running method show Material");

    }
}
