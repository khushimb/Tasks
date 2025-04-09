package com.xworkz.ObjectToString.internal;

public class Playlist {
    private String title;
    private String songs;
    private String owner;

    public Playlist(String title, String songs, String owner) {
        this.title = title;
        this.songs = songs;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Title:" + title + " Songs:" + songs + " Owner:" + owner;
    }
}

