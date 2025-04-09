package com.xworkz.ObjectToString.internal;

public class Task {
    private String title;
    private String due;
    private String status;

    public Task(String title, String due, String status) {
        this.title = title;
        this.due = due;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Title:" + title + " Due:" + due + " Status:" + status;
    }
}

