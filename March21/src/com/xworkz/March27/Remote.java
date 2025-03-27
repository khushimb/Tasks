package com.xworkz.March27;

public class Remote {

    private int buttons;
    private String color;

    public void press(int buttons,String color){
        this.buttons=buttons;
        this.color=color;
        System.out.println("Running buttons in method press in class remote :"+buttons);
        System.out.println("Running color in method press in class remote :"+color);
    }
}
