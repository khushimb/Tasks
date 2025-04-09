package com.xworkz.ObjectToString.internal;

public class Shadow {
    private String intensity;
    private String color;
    private String direction;

    public Shadow(String intensity, String color, String direction) {
        this.intensity = intensity;
        this.color = color;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Intensity:" + intensity + " Color:" + color + " Direction:" + direction;
    }
}
