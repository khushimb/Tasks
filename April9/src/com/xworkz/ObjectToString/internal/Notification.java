package com.xworkz.ObjectToString.internal;

 public class Notification {
    private String title;
    private String message;
    private String type;

    public Notification(String title, String message, String type) {
        this.title = title;
        this.message = message;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Title:" + title + " Message:" + message + " Type:" + type;
    }
}
