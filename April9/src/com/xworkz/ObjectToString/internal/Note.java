package com.xworkz.ObjectToString.internal;

public class Note {
    private String title;
    private String content;
    private String category;

    public Note(String title, String content, String category) {
        this.title = title;
        this.content = content;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Title:" + title + " Content:" + content + " Category:" + category;
    }

    @Override
    public int hashCode() {
        return 41;
    }
}

