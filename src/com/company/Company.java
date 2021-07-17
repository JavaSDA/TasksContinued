package com.company;

public class Company {

    // Define the attributes of a company
    private Employee[] employees; // Array of Employee objects
    private String companyName;

    // Add constructor
    public Company(String companyName, Employee[] employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    // Getters and Setters
    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // Create a method to find the average age of employees in
    // a company.
    public float getAverageAge() {
        // find the sum of the ages
        // divide the sum by the number of people/ages.
        // average = sum of values / number of values

        float sum = 0;

        for (int i = 0; i < this.employees.length; i++) {
            sum += this.employees[i].getAge(); // use the getAge() method to retrieve the age of an employee
        }

        return sum / this.employees.length;
    }

    public String getRandomEmployee() {
        int randomIndex = (int)(Math.random() * 10); // get a random index
        if (randomIndex >= employees.length) { // if the random index is greater or equal to the length of the array
            return getRandomEmployee(); // then generate a new random index
        }
        return this.employees[randomIndex].getName();
    }

}
