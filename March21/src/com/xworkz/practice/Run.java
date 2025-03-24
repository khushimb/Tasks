package com.xworkz.practice;
import com.xworkz.practice1.Cardboard;

public class Run {
    public static void main(String[] args) {
        Sheet sheet = new Sheet();
         sheet.display();
        System.out.println("Running main of Sheet");

        Cardboard cardboard = new Cardboard();
         cardboard.see();
        System.out.println("Running main of cardboard");

    }
}
