package com.xworkz.ObjectToString.internal;

public class Timeline {
    private String event;
    private String time;
    private String description;

    public Timeline(String event, String time, String description) {
        this.event = event;
        this.time = time;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Event:" + event + " Time:" + time + " Description:" + description;
    }

    @Override
    public int hashCode() {
        return 345;
    }
}

