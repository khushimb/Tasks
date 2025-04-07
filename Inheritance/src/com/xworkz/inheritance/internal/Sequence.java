package com.xworkz.inheritance.internal;

public class Sequence extends BoardGames{
    public void playIt(BoardGames boardGames){
        boardGames.play();
        if(boardGames instanceof Sequence){
            Sequence sequence = (Sequence) boardGames;
            sequence.stopPlaying();
        }
    }
    public void stopPlaying(){
        System.out.println("Running stop playing in sequence");
    }
}
