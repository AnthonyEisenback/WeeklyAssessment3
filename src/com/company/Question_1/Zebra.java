package com.company.Question_1;

public class Zebra extends Horse {
    Horse horse = new Horse();

    int eyeCount;
    int legs;
    String pattern;
    String tailLength;

    public Zebra(String color, int ears, int legs, String tail, int eyeCount, int legs1, String tailLength) {
        super(color, ears, legs, tail);
        this.eyeCount = eyeCount;
        this.legs = legs1;
        this.tailLength = tailLength;

    }


    public int getEyeCount() {
        return eyeCount;
    }

    public void setEyeCount(int eyeCount) {
        this.eyeCount = eyeCount;
    }

    @Override
    public int getLegs() {
        return legs;
    }

    @Override
    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getTailLength() {
        return tailLength;
    }

    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;

    }

    public Zebra() {

    }
}
