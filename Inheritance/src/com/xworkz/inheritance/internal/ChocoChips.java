package com.xworkz.inheritance.internal;

public class ChocoChips extends Candy{
    public void eat(Candy candy){
        candy.melt();
        if(candy instanceof ChocoChips){
            ChocoChips chocoChips = (ChocoChips) candy;
            chocoChips.taste();
        }
    }
    public void taste(){
        System.out.println("Running taste in chocochips");
    }
}
