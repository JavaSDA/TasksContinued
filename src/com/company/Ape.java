package com.company;

// extend or inherit the Animal class
public class Ape extends Animal {

    // Define the attributes of an ape
    private int noOfHands;

    // Define Ape constructor that takes in parameters for object creation
    public Ape(int noOfLegs, int noOfEyes, String color, int noOfHands) {
        super(noOfLegs, noOfEyes, color);
        this.noOfHands = noOfHands;
    }

    // methods
    public void walk(String place) {
        System.out.println("Ape is walking to " + place);
    }

    public void pickObjects(String item) {
        System.out.println("Ape is picking up " + item);
    }

    // getters and setters
    public int getNoOfHands() {
        return noOfHands;
    }

    public void setNoOfHands(int noOfHands) {
        this.noOfHands = noOfHands;
    }
}
