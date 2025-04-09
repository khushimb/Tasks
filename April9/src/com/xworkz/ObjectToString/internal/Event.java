package com.xworkz.ObjectToString.internal;

public class Event {
    private String upcoming;
    private String current;
    private String past;

    public Event(String upcoming, String current, String past) {
        this.upcoming = upcoming;
        this.current = current;
        this.past = past;
    }

    @Override
    public String toString() {
        return "Upcoming:" + upcoming + " Current:" + current + " Past:" + past;
    }
}

