package com.xworkz.inheritance.internal;

public class CleaningService extends Service{
    public CleaningService(){
        System.out.println("Running no arg const cleaning service");
    }


    @Override
    public void cleanRoom(){
        System.out.println("Running clean room");
    }
    @Override
    public void cleanHall(){
        System.out.println("Running clean room");
    }
}
