package com.xworkz.ObjectToString.internal;

public class Comment {

    private String time;
    private int times;
    private String place;

    public Comment(String time, int times, String place) {
        this.time = time;
        this.times = times;
        this.place = place;

    }

    @Override
    public String toString() {
        return "Time:" + time + "Times:" + times + "Place:" + place;
    }

    @Override
    public int hashCode() {
        return 30;
    }
}
