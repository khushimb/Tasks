package com.xworkz.ObjectToString.internal;

public class Nav {
    private String home;
    private String about;
    private String contact;

    public Nav(String home, String about, String contact) {
        this.home = home;
        this.about = about;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Home:" + home + " About:" + about + " Contact:" + contact;
    }
}

