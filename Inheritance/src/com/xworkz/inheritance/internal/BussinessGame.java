package com.xworkz.inheritance.internal;

public class BussinessGame extends  BoardGames{
    public BussinessGame(){
        System.out.println("Running no arg const Bussiness game");
    }

    @Override
    public void play(){
        System.out.println("Running play");
    }
    @Override
    public void move(){
        System.out.println("Running move");
    }
}
