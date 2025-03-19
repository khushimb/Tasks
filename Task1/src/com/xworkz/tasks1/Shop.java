package com.xworkz.tasks1;

public class Shop {
    void buy(RCB rcb){
        if(rcb != null){
            rcb.jersey();
            System.out.println("Buying Jersey from Shop");
        }else{
            System.out.println("Jersey sold out");
        }
    }
}
