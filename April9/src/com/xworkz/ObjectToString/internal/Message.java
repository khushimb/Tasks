package com.xworkz.ObjectToString.internal;

public class Message {
    private String sender;
    private String content;
    private String time;

    public Message(String sender, String content, String time) {
        this.sender = sender;
        this.content = content;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Sender:" + sender + " Content:" + content + " Time:" + time;
    }
}

