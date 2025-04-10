package com.xworkz.ObjectToString.internal;

public class Radio {
    private String frequency;
    private String channel;
    private String language;

    public Radio(String frequency, String channel, String language) {
        this.frequency = frequency;
        this.channel = channel;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Frequency:" + frequency + " Channel:" + channel + " Language:" + language;
    }

    @Override
    public int hashCode() {
        return 51;
    }
}

