package com.javaBootCamp.superclass_section15;

public record PersonRec(String name, int age, char gender, long ssn) {
    public PersonRec(String name) {
        this(name, 0, 'M',0);
    }

    public PersonRec(String name, int age, char gender, long ssn) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ssn = ssn;
    }
}
