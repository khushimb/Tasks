package com.xworkz.ObjectToString.internal;

public class Filter {
    private String active;
    private String inactive;
    private String disabled;

    public Filter(String active, String inactive, String disabled) {
        this.active = active;
        this.inactive = inactive;
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "Active:" + active + " Inactive:" + inactive + " Disabled:" + disabled;
    }

    @Override
    public int hashCode() {
        return 43;
    }
}
