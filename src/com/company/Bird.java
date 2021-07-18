package com.company;

// extend or inherit from the animal class.
public class Bird extends Animal {
    // Define attributes or properties of a bird.
    private int noOfWings;

    // Define Bird constructor that takes in parameters for object creation
    public Bird(int noOfLegs, int noOfEyes, String color, int noOfWings) {
        super(noOfLegs, noOfEyes, color);
        this.noOfWings = noOfWings;
    }

    public void fly() {
        if (noOfWings != 2) {
            System.out.println("Bird cannot fly");
        } else {
            System.out.println("Bird is flying");
        }
    }

    public void sing() {
        System.out.println("Bird is singing");
    }

    // getter and setter
    public int getNoOfWings() {
        return noOfWings;
    }

    public void setNoOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    }
}
