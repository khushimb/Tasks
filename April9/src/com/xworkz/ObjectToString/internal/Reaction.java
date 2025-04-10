package com.xworkz.ObjectToString.internal;

public class Reaction {
    private String emoji;
    private String count;
    private String user;

    public Reaction(String emoji, String count, String user) {
        this.emoji = emoji;
        this.count = count;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Emoji:" + emoji + " Count:" + count + " User:" + user;
    }

    @Override
    public int hashCode() {
        return 54;
    }
}

