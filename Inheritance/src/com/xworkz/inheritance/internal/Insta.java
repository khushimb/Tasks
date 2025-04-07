package com.xworkz.inheritance.internal;

public class Insta extends SocialMedia{
    public Insta(){
        System.out.println("Running no arg const insta");
    }

    @Override
    public void use(){
        System.out.println("Running use");
    }
    @Override
    public void block(){
        System.out.println("Running block");
    }
}
