package com.xworkz.ObjectToString.internal;

public class Feed {
    private String news;
    private String social;
    private String blog;

    public Feed(String news, String social, String blog) {
        this.news = news;
        this.social = social;
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "News:" + news + " Social:" + social + " Blog:" + blog;
    }

    @Override
    public int hashCode() {
        return 59;
    }
}

