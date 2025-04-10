package com.xworkz.ObjectToString.internal;

public class Post {
    private String author;
    private String content;
    private String date;

    public Post(String author, String content, String date) {
        this.author = author;
        this.content = content;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Author:" + author + " Content:" + content + " Date:" + date;
    }

    @Override
    public int hashCode() {
        return 47;
    }
}
