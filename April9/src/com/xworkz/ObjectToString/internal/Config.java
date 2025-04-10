package com.xworkz.ObjectToString.internal;

public class Config {

    private String defalt;
    private String custom;
    private String reset;

    public Config(String defalt, String custom, String reset) {
        this.defalt = defalt;
        this.custom = custom;
        this.reset = reset;

    }

    @Override
    public String toString() {
        return "defalt:" + defalt + "Custom:" + custom + "Reset:" + reset;
    }

    @Override
    public int hashCode() {
        return 56;
    }
}
