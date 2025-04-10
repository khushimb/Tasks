package com.xworkz.ObjectToString.internal;

public class Panel {
    private String heading;
    private String body;
    private String status;

    public Panel(String heading, String body, String status) {
        this.heading = heading;
        this.body = body;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Heading:" + heading + " Body:" + body + " Status:" + status;
    }

    @Override
    public int hashCode() {
        return 43;
    }
}

