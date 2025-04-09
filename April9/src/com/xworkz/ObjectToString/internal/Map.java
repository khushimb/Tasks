package com.xworkz.ObjectToString.internal;

public class Map {
    private String latitude;
    private String longitude;
    private String zoom;

    public Map(String latitude, String longitude, String zoom) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.zoom = zoom;
    }

    @Override
    public String toString() {
        return "Latitude:" + latitude + " Longitude:" + longitude + " Zoom:" + zoom;
    }
}

