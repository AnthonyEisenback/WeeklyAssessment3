package com.company.Question_1;

public class Horse {
    Main main = new Main();


    public Horse() {
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEars() {
        return ears;
    }

    public void setEars(int ears) {
        this.ears = ears;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }



    String color;
    int ears;
    int legs;
    String tail;

    public Horse(String color, int ears, int legs, String tail) {
        this.color = color;
        this.ears = ears;
        this.legs = legs;
        this.tail = tail;
    }


}
