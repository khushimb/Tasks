package com.xworkz.ObjectToString.internal;

    public class DropDown {
        private String open;
        private String closed;
        private String hover;

        public DropDown(String open, String closed, String hover) {
            this.open = open;
            this.closed = closed;
            this.hover = hover;
        }

        @Override
        public String toString() {
            return "Open:" + open + " Closed:" + closed + " Hover:" + hover;
        }
    }


