package com.xworkz.ObjectToString.internal;

public class Toast {
    private String message;
    private String duration;
    private String position;

    public Toast(String message, String duration, String position) {
        this.message = message;
        this.duration = duration;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Message:" + message + " Duration:" + duration + " Position:" + position;
    }

    @Override
    public int hashCode() {
        return 290;
    }
}

