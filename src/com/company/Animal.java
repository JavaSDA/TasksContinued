package com.company;

public class Animal {

    // Define the properties of an animal
    private int noOfLegs;
    private int noOfEyes;
    private String color;

    // define a constructor that allows you to
    // set object properties at object creation
    public Animal(int noOfLegs, int noOfEyes, String color) {
        this.noOfLegs = noOfLegs;
        this.noOfEyes = noOfEyes;
        this.color = color;
    }

    // getters and setters.
    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public int getNoOfEyes() {
        return noOfEyes;
    }

    public void setNoOfEyes(int noOfEyes) {
        this.noOfEyes = noOfEyes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
