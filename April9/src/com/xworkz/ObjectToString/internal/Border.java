package com.xworkz.ObjectToString.internal;

import com.sun.org.apache.xerces.internal.xs.StringList;

public class Border {

    private String color;
    private int lines;
    private String style;

    public Border(String color,int lines,String style){
        this.color=color;
        this.lines=lines;
        this.style=style;

    }

    @Override
    public String toString(){
        return "Color:"+color+"Lines:"+lines+"Style:"+style;
    }

    @Override
    public int hashCode() {
        return 78;
    }
}


