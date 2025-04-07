package com.xworkz.inheritance.internal;

public class Door extends  Wood{
public Door(){
    System.out.println("Running no arg const door");
}

    @Override
    public void openDoor(){
        System.out.println("Running open door");
    }
    @Override
    public void closeDoor(){
        System.out.println("Running close door");
    }
}
