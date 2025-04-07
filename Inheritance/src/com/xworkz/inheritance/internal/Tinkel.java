package com.xworkz.inheritance.internal;

public class Tinkel extends Comic{
    public void read(Comic comic){
        comic.read();
        if(comic instanceof Tinkel){
            Tinkel tinkel = (Tinkel) comic;
            tinkel.funny();
        }
    }
    public void funny(){
        System.out.println("Running funny in tinkel");
    }
}
