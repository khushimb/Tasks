package com.xworkz.ObjectToString.internal;

public class Rank {
    private String position;
    private String name;
    private String points;

    public Rank(String position, String name, String points) {
        this.position = position;
        this.name = name;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Position:" + position + " Name:" + name + " Points:" + points;
    }

    @Override
    public int hashCode() {
        return 52;
    }
}

