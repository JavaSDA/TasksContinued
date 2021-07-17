package com.company;

public class Person {

    // Define attributes of a person
    private String name;
    private int age;

    // Constructor
    // Instantiation is the process of creating a new object from a class.
    // Person human = new Person();
    // Person nonHuman = new Person();
    // Create a constructor to accept parameters at object creation
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public Person() {
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
