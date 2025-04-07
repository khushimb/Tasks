package com.xworkz.inheritance.internal;

public class HumanoidRobot extends Robot{

    public HumanoidRobot(){
        System.out.println("Running no arg const humanoid robot");
    }

    @Override
    public void walk(){
        System.out.println("Running walk");
    }
    @Override
    public void talk(){
        System.out.println("Running talk");
    }
}
