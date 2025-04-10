package com.xworkz.ObjectToString.internal;

public class Alert {

    private String error;
    private String warning;
    private String success;

    public Alert(String error,String warning,String success){
        this.error=error;
        this.warning=warning;
        this.success=success;

    }

    @Override
    public String toString(){
        return "Error:"+error+"Warning:"+warning+"Success:"+success;
    }

    @Override
    public int hashCode() {
        return 108;
    }
}
