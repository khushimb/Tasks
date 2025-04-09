package com.xworkz.ObjectToString.internal;

public class Engine {
    private String fast;
    private String slow;
    private String idle;

    public Engine(String fast, String slow, String idle) {
        this.fast = fast;
        this.slow = slow;
        this.idle = idle;
    }

    @Override
    public String toString() {
        return "Fast:" + fast + " Slow:" + slow + " Idle:" + idle;
    }
}

