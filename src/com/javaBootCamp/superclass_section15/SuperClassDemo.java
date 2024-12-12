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

//        equality and hash code
        System.out.println("James == tony: " + tonyObj.equals(james));

        Person person1 = new Person("Steve", 45, 'M', 4563420876L);
        Person person2 = new Person("Steve", 45, 'M', 4563420876L);
        System.out.println("person1 == person2: " + person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        PersonAlt p1 = new PersonAlt("Steve", 45, 'M', 4563420876L);
        PersonAlt p2 = new PersonAlt("Steve", 45, 'M', 4563420876L);
        System.out.println("p1 == p2: " + p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());


    }
}
