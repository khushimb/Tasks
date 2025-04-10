package com.xworkz.ObjectToString.internal;

public class Dialog {

    private String info;
    private String warning;
    private String error;

    public Dialog(String info, String warning, String error) {
        this.info = info;
        this.warning = warning;
        this.error = error;

    }

    @Override
    public String toString() {
        return "Info:" + info + "warning:" + warning + "error:" + error;
    }

    @Override
    public int hashCode() {
        return 56;
    }
}
