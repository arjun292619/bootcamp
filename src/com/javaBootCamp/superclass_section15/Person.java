package com.javaBootCamp.superclass_section15;

public record Person(String name, int age, char gender, long ssn) {
    public Person(String name) {
        this(name, 0, 'M',0);
    }

    public Person(String name, int age, char gender, long ssn) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ssn = ssn;
    }
}
