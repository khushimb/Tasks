package com.xworkz.ObjectToString.internal;

public class SubTitle {
    private String language;
    private String format;
    private String file;

    public SubTitle(String language, String format, String file) {
        this.language = language;
        this.format = format;
        this.file = file;
    }

    @Override
    public String toString() {
        return "Language:" + language + " Format:" + format + " File:" + file;
    }
}

