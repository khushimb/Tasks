package com.xworkz.inheritance.internal;

public class Dosa extends Breakfast{
    public void eat(Breakfast breakfast){
        breakfast.eat();
        if(breakfast instanceof Dosa){
            Dosa dosa = (Dosa) breakfast;
            dosa.taste();
        }
    }
    public void taste(){
        System.out.println("Running taste in dosa");
    }
}
