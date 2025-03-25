package com.xworkz.practice1;

public class House {

    Box box = new Box();

    public void method(){
        box.display();
    }

    public void see(House box) {
        if (box != null) {
            System.out.println("Running see in box is not null");
        }

    }


    }