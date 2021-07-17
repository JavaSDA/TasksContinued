package com.company;

public class Employee extends Person {

    // Define the attributes of an employee
    private String companyId;
    private String companyName;

    // Since the only constructor in the Person class,
    // demands parameters, then the constructor in the
    // Employee class, must accept those parameters as well.
    public Employee(String name, int age, String companyId, String companyName) {
        super(name, age); // Call the parent class's constructor and pass the necessary parameters.
        this.companyId = companyId;
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
