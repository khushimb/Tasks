package com.xworkz.ObjectToString.internal;

public class Link {
    private String href;
    private String text;
    private String target;

    public Link(String href, String text, String target) {
        this.href = href;
        this.text = text;
        this.target = target;
    }

    @Override
    public String toString() {
        return "Href:" + href + " Text:" + text + " Target:" + target;
    }

    @Override
    public int hashCode() {
        return 33;
    }
}
