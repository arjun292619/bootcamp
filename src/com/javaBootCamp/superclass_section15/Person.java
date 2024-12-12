package com.javaBootCamp.superclass_section15;

public record Person(String name, String email, long phone) {
    public Person(String name) {
        this(name, null, 0);
    }

    public Person(String name, String email, long phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

}
