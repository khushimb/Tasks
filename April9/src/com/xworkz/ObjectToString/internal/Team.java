package com.xworkz.ObjectToString.internal;

public class Team {
    private String name;
    private String members;
    private String leader;

    public Team(String name, String members, String leader) {
        this.name = name;
        this.members = members;
        this.leader = leader;
    }

    @Override
    public String toString() {
        return "Name:" + name + " Members:" + members + " Leader:" + leader;
    }
}

