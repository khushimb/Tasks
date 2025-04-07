package com.xworkz.inheritance.internal;

public class Rat extends Animal{
    public void kill(Animal animal){
        animal.see();
        if(animal instanceof Rat){
            Rat rat = (Rat) animal;
            rat.beat();
        }
    }
    public void beat(){
        System.out.println("Running beat");
    }
}
