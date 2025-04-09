package com.xworkz.ObjectToString.internal;

public class Review {
    private String reviewer;
    private String comment;
    private String rating;

    public Review(String reviewer, String comment, String rating) {
        this.reviewer = reviewer;
        this.comment = comment;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Reviewer:" + reviewer + " Comment:" + comment + " Rating:" + rating;
    }
}

