package com.javaBootCamp.streams_section26;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectionDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Person> persons = new ArrayList<>(List.of(
                new Person("Tony", "tony@email.com", List.of("123", "234", "456"), 1567893),
                new Person("Rogers", "rogers@email.com", List.of("234", "457", "688", "222", "998"), 456774),
                new Person("James", "james@email.com", List.of("472", "414", "489", "732"), 256729),
                new Person("Natasha", "natasha@email.com", List.of("353", "234"), 456754),
                new Person("Elizabeth", "liz@email.com", List.of("824", "639", "956", "888", "669", "359"), 656189)
        ));

        List<String> departmentList = new ArrayList<>(List.of("accounting", "hr", "supply", "logistics", "it", "retail", "inventory", "sales"));

        List<String> rDepts = departmentList.stream().filter(dept -> dept.contains("r")).collect(Collectors.toList());

        System.out.println(rDepts);
        System.out.println("-".repeat(30));

        Set<Person> wealthy = persons.stream().filter(person -> person.income() > 500000).collect(Collectors.toSet());
        System.out.println(wealthy);
        System.out.println("-".repeat(30));

        Map<String, Person> wealthyMapper = persons.stream().filter(person -> person.income() > 500000).collect(Collectors.toMap(Person::name, person -> person));
        System.out.println(wealthyMapper);
        System.out.println("-".repeat(30));

    }
}
