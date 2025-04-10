package com.xworkz.ObjectToString.internal;

public class Location {
    private String country;
    private String state;
    private String city;

    public Location(String country, String state, String city) {
        this.country = country;
        this.state = state;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Country:" + country + " State:" + state + " City:" + city;
    }

    @Override
    public int hashCode() {
        return 36;
    }
}

