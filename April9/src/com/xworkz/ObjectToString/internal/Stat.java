package com.xworkz.ObjectToString.internal;

public class Stat {
    private String name;
    private String value;
    private String unit;

    public Stat(String name, String value, String unit) {
        this.name = name;
        this.value = value;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Value:" + value + " Unit:" + unit;
    }

    @Override
    public int hashCode() {
        return 59;
    }
}

