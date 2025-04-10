package com.xworkz.ObjectToString.internal;

public class Player {
    private String name;
    private String score;
    private String level;

    public Player(String name, String score, String level) {
        this.name = name;
        this.score = score;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Score:" + score + " Level:" + level;
    }

    @Override
    public int hashCode() {
        return 46;
    }
}

