package com.javaBootCamp.superclass_section15;

public class SuperClassDemo {
    public static void main(String[] args) {
        Object tonyObj = new Person("Tony");
        Person james = new Person("James");
        Class<? extends Person> jamesClass = james.getClass();

        System.out.println(jamesClass);
        System.out.println(jamesClass.getName());
        System.out.println(jamesClass.getPackageName());
        System.out.println(jamesClass.getSimpleName());
    }
}
