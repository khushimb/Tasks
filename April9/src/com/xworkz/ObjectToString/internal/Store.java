package com.xworkz.ObjectToString.internal;

public class Store {
    private String name;
    private String location;
    private String openHours;

    public Store(String name, String location, String openHours) {
        this.name = name;
        this.location = location;
        this.openHours = openHours;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Location:" + location + " OpenHours:" + openHours;
    }

    @Override
    public int hashCode() {
        return 62;
    }
}

