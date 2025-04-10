package com.xworkz.ObjectToString.internal;

public class Progress {
    private String task;
    private String percent;
    private String status;

    public Progress(String task, String percent, String status) {
        this.task = task;
        this.percent = percent;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task:" + task + " Percent:" + percent + " Status:" + status;
    }
    @Override
    public int hashCode() {
        return 41;
    }
}

