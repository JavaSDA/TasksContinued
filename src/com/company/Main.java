package com.company;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // First Task: 30 mins.


        // Inheritance

        // Create a class called Person. They should have: // superclass
        // - name, age. (as attributes).

        // Create a class called Employee. This class should inherit // The Employee class will be the child class to the
        // person class. // public class Employee extends Person {
        // the Person class. and should have the extra field of
        // - company id, company name.

        // Create a class called Company. This class should take in employees as
        // an array attribute, as well as the name of the company.
        // Add a method to get the average age of all the employees in a company.
        // Add a method that returns a random employee name from the employees in a company.

        // In your main method, Populate 3 company's employees attribute and
        // use the methods to find and output the average age of the employees in each
        // company and also on a separate line randomly generate the name of one of each company's employees.

//        Employee employee = new Employee();
//        employee.setName("David");
//        employee.setAge(17);
//        System.out.println((int)(Math.random() * 10));
        String micro = "Microsoft";
        String goog = "Google";
        String amzn = "Amazon";

        // Populate the arrays with employees
        Employee[] microsoftEmployees = {
                new Employee("Josh", 20, "U15", micro),
                new Employee("Danny", 18, "U19", micro),
                new Employee("Brenda", 25, "U18", micro)
        };
        Employee[] googleEmployees = {
                new Employee("Harry", 26, "U15", goog),
                new Employee("George", 45, "U19", goog),
                new Employee("Davina", 33, "U18", goog)
        };
        Employee[] amazonEmployees = {
                new Employee("Janet", 41, "U15", amzn),
                new Employee("Bridgette", 38, "U19", amzn),
                new Employee("Lena", 23, "U18", amzn)
        };

        // Create the company objects
        Company microsoft = new Company(micro, microsoftEmployees);
        Company google = new Company(goog, googleEmployees);
        Company amazon = new Company(amzn, amazonEmployees);

        // Get the average age of each of the companies using the method
        // defined in the Company class.
//        System.out.println("The average age in Microsoft is " + microsoft.getAverageAge());
//        System.out.println("The average age in Google is " + google.getAverageAge());
//        System.out.println("The average age in Amazon is " + amazon.getAverageAge());

//        System.out.println("A random employee in Microsoft is " + microsoft.getRandomEmployee());
//        System.out.println("A random employee in Google is " + google.getRandomEmployee());
//        System.out.println("A random employee in Amazon is " + amazon.getRandomEmployee());


        // 15mins.
        // Simple interest calculator
        // The formula for simple interest is (P*R*T)/100. The time is in years.
        // - Allow the user to enter the principal, rate and time
        // - interactively print out the simple interest.

        // Initialize the scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the values we need
        System.out.print("Enter the principal: ");
        float principal = scanner.nextFloat();

        System.out.print("Enter the rate: ");
        float rate = scanner.nextFloat();

        System.out.print("Enter the time: ");
        float time = scanner.nextFloat();

        // Perform the calculation.
        float interest = (principal * rate * time) / 100;

        // Log the output to the console.
        System.out.println("The interest is: " + interest);
    }

    // Assignment
    // Create a class called Animal.
    // - legs, eyes, color.
    // Create a class called Bird as a child class to Animal
    // - wings, ability to fly(this is a method), ability to sing.
    // Create a class called Apes as a child class to Animal
    // - hands, ability to walk(this is a method), ability to grab objects.


}
