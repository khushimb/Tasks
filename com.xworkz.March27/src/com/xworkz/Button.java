package com.xworkz;

import com.xworkz.association.Material;

public class Button {

    private Material material;

    public Button(Material material){
        this.material=material;
        System.out.println("Running const button");
    }

    public void showButton(){
        material.showMaterial();
        System.out.println("Running method show button");
    }
}
