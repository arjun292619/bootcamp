package com.javaBootCamp.superclass_section15;

public class PersonAlt {
    private String name;
    private int age;
    private char gender;
    private long ssn;

    public PersonAlt(String name, int age, char gender, long ssn) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ssn = ssn;
    }

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "PersonAlt{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ssn=" + ssn +
                '}';
    }
}
