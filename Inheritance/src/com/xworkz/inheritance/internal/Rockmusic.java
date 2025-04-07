package com.xworkz.inheritance.internal;

public class Rockmusic extends Music{

    public Rockmusic(){
        System.out.println("Running Rock music");
    }

    @Override
    public void play(){
        System.out.println("Running play");
    }
    @Override
    public void stop(){
        System.out.println("Running stop");
    }
}
