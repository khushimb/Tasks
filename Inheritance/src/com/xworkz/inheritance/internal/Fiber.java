package com.xworkz.inheritance.internal;

public class Fiber extends Chair{
    public void sit(Chair chair){
        chair.move();
        if(chair instanceof Fiber){
            Fiber fiber = (Fiber) chair;
            fiber.move();
        }
    }
    public void move(){
        System.out.println("Running move in fiber");
    }
}
