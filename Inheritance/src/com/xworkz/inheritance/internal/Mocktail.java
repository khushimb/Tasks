package com.xworkz.inheritance.internal;

public class Mocktail extends Drink{
    public void drink(Drink drink){
        drink.drinkTea();
        if(drink instanceof Mocktail){
            Mocktail mocktail = (Mocktail) drink;
            mocktail.chug();
        }
    }
    public void chug(){
        System.out.println("Running chug in mocktail");
    }
}
