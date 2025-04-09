package com.xworkz.ObjectToString.internal;

public class Project {
    private String title;
    private String deadline;
    private String manager;

    public Project(String title, String deadline, String manager) {
        this.title = title;
        this.deadline = deadline;
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Title:" + title + " Deadline:" + deadline + " Manager:" + manager;
    }
}

