package com.xworkz.ObjectToString.internal;

public class Doc {

        private String draft;
        private String shared;
        private String locked;

        public Doc(String draft, String shared, String locked) {
            this.draft = draft;
            this.shared = shared;
            this.locked = locked;
        }

        @Override
        public String toString() {
            return "Draft:" + draft + " Shared:" + shared + " Locked:" + locked;
        }
    }


