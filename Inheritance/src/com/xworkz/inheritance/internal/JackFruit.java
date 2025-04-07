package com.xworkz.inheritance.internal;

public class JackFruit extends  Fruit{
    public void peal(Fruit fruit){
        fruit.eat();
        if(fruit instanceof JackFruit){
            JackFruit jackFruit = (JackFruit) fruit;
            jackFruit.eat();
        }
    }
    public void eat(){
        System.out.println("Running eat in jack fruit");
    }
}
