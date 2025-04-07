package com.xworkz.inheritance.internal;

public class Crow extends Bird{
    public void flyHigh(Bird bird){
        bird.fly();
        if(bird instanceof Crow){
            Crow crow = (Crow) bird;
            crow.sleep();
        }
    }
    public void sleep(){
        System.out.println("Running sleep in crow");
    }
}
