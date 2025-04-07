package com.xworkz.inheritance.internal;

public class BlackHole extends SpaceObject{

    public BlackHole(){
        System.out.println("Running no arg const black hole");
    }

    @Override
    public void black(){
        System.out.println("Running black");
    }
    @Override
    public void hole() {
        System.out.println("Running hole");


    }
    }
