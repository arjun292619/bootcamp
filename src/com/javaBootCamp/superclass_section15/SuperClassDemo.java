package com.javaBootCamp.superclass_section15;

public class SuperClassDemo {
    public static void main(String[] args) {
        Object tonyObj = new PersonRec("Tony");
        PersonRec james = new PersonRec("James");
        Class<? extends PersonRec> jamesClass = james.getClass();

        System.out.println(jamesClass);
        System.out.println(jamesClass.getName());
        System.out.println(jamesClass.getPackageName());
        System.out.println(jamesClass.getSimpleName());

//        equality and hash code
        System.out.println("James == tony: " + tonyObj.equals(james));

        PersonRec personRec1 = new PersonRec("Steve", 45, 'M', 4563420876L);
        PersonRec personRec2 = new PersonRec("Steve", 45, 'M', 4563420876L);
        System.out.println("person1 == person2: " + personRec1.equals(personRec2));
        System.out.println(personRec1.hashCode());
        System.out.println(personRec2.hashCode());

        PersonAlt p1 = new PersonAlt("Steve", 45, 'M', 4563420876L);
        PersonAlt p2 = new PersonAlt("Steve", 45, 'M', 4563420876L);
        System.out.println("p1 == p2: " + p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        Person p3 = new Person("Steve", 45, 'M', 4563420876L);
        Person p4 = new Person("Steve", 45, 'M', 4563420876L);
        System.out.println("p3 == p4: " + p3.equals(p4));
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());

        System.out.println("Without implementing toString: " + p1);
        System.out.println("implementing toString: " + p3);


    }
}
