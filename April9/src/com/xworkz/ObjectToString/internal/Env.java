package com.xworkz.ObjectToString.internal;

public class Env {
        private String dev;
        private String staging;
        private String prod;

        public Env(String dev, String staging, String prod) {
            this.dev = dev;
            this.staging = staging;
            this.prod = prod;
        }

        @Override
        public String toString() {
            return "Dev:" + dev + " Staging:" + staging + " Prod:" + prod;
        }

    @Override
    public int hashCode() {
        return 54;
    }
}


