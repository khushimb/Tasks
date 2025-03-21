package com.xworkz.tasks1;

public class Brush {

    Color color ;
    Brush(Color color){
        this.color=color;
    }
    void clean(){
        System.out.println("Running method clean in Brush class");
    }

    void scrub(){
        System.out.println("Running method scrub in Brush class");
    }
}

