package com.xworkz.ObjectToString.intern;

public class Pen {

        private String brand;
        private String ink;
        private int price;
        public Pen(String brand,String ink,int price){
            this.brand=brand;
            this.ink=ink;
            this.price=price;
        }

        @Override
        public String toString() {
            return "brand : "+brand+" ink : "+ink+" price : "+price;
        }

        @Override
        public int hashCode() {
            return 125;
        }
        @Override
        public boolean equals(Object obj) {
            if (obj != null){
                System.out.println("obj is not null");
                if (obj instanceof Pen){
                    Pen pen = this;
                    Pen pen1 =(Pen) obj;
                    if (pen.ink.equals(pen1.ink)){
                        return true;
                    }
                }
            }
            return false;
        }
    }


