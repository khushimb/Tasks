package com.xworkz.Instance;

public class Button {

    private int count;
    private String color;

    public void buttonUp(int count,String color){
        this.count=count;
        this.color=color;
        System.out.println("Running count in buttonUP method in button class :"+count);
        System.out.println("Running color in buttonUP method in button class :"+color);


    }
}
