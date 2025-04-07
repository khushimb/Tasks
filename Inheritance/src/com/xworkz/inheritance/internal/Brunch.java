package com.xworkz.inheritance.internal;

public class Brunch extends Meal{
    public void eat(Meal meal){
        meal.eat();
        if(meal instanceof Brunch){
            Brunch brunch = (Brunch) meal;
            brunch.drink();
        }
    }
    public void drink(){
        System.out.println("Running drink in brunch");
    }
}
