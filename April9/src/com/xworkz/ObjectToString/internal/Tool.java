package com.xworkz.ObjectToString.internal;

public class Tool {
    private String name;
    private String version;
    private String type;

    public Tool(String name, String version, String type) {
        this.name = name;
        this.version = version;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Version:" + version + " Type:" + type;
    }

    @Override
    public int hashCode() {
        return 789;
    }
}
