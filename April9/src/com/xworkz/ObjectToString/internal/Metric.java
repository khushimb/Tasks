package com.xworkz.ObjectToString.internal;

public class Metric {
    private String name;
    private String value;
    private String unit;

    public Metric(String name, String value, String unit) {
        this.name = name;
        this.value = value;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Value:" + value + " Unit:" + unit;
    }
}

