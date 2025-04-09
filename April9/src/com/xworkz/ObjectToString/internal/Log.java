package com.xworkz.ObjectToString.internal;

public class Log {
    private String level;
    private String message;
    private String timestamp;

    public Log(String level, String message, String timestamp) {
        this.level = level;
        this.message = message;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Level:" + level + " Message:" + message + " Timestamp:" + timestamp;
    }
}
