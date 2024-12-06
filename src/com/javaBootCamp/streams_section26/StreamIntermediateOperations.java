package com.javaBootCamp.streams_section26;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOperations {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfNumbers = numbers.stream().reduce(0, Integer::sum);

        System.out.println("using int stream sum");
        int sumNums = numbers.stream().mapToInt(num -> num).sum();
        System.out.println(sumNums);
        System.out.println("-".repeat(30));

        System.out.println("using int stream for even sum");
        int evenSums = numbers.stream().filter(num -> num % 2 == 0).mapToInt(num -> num).sum();
        System.out.println(evenSums);
        System.out.println("-".repeat(30));

        List<String> departmentList = new ArrayList<>(List.of("accounting", "hr", "supply", "logistics", "it", "retail", "inventory", "sales"));
        System.out.println(sumOfNumbers);
        System.out.println("-".repeat(30));

        List<Person> persons = new ArrayList<>(List.of(
                new Person("Tony", "tony@email.com", List.of("123", "234", "456"), 1567893),
                new Person("Rogers", "rogers@email.com", List.of("234", "457", "688", "222", "998"), 456774),
                new Person("James", "james@email.com", List.of("472", "414", "489", "732"), 256729),
                new Person("Natasha", "natasha@email.com", List.of("353", "234"), 456754),
                new Person("Elizabeth", "liz@email.com", List.of("824", "639", "956", "888", "669", "359"), 656189)
        ));

        Double totalncome = persons.stream().map(Person::income).reduce(0D, Double::sum);
        System.out.println("Total Income: " + totalncome);
        System.out.println("-".repeat(30));
        OptionalDouble maxIncome = persons.stream().mapToDouble(Person::income).max();
        System.out.println("Max Income: " + maxIncome.getAsDouble());
        System.out.println("-".repeat(30));

        long countOfDept = departmentList.stream().count();
        Stream<List<String>> phoneCounts = persons.stream().map(Person::phoneNumbers);
//        phoneCounts.forEach(System.out::println);
        var contactSize = phoneCounts.map(List::size);
        contactSize.forEach(System.out::println);
        System.out.println("Total Departments: " + countOfDept);
        System.out.println("-".repeat(30));

//        mapping operation
        var deptCode = departmentList.stream().map(dept -> (String.valueOf(dept.charAt(0)) + String.valueOf(dept.charAt(dept.length() - 1))).toUpperCase());
        deptCode.forEach(System.out::println);
        System.out.println("-".repeat(30));

//        filter operation
        List<Person> filteredList = persons.stream().filter(person -> person.name().contains("o")).toList();
        System.out.println(filteredList);
        System.out.println("-".repeat(30));

//        limit method
        List<Integer> filteredIntStream = Stream.generate(new Random()::nextInt).filter(val -> val > 0 && val < 99).limit(15).toList();
        System.out.println(filteredIntStream);
        System.out.println("-".repeat(30));

//        skip method
        List<Integer> skippedIntList = Stream.iterate(1, val -> (val + 5) * 10).skip(3).limit(5).toList();
        System.out.println(skippedIntList);
        System.out.println("-".repeat(30));

        List<String> sDepts = departmentList.stream().filter(dept -> dept.startsWith("s")).collect(Collectors.toList());
        System.out.println(sDepts);
        System.out.println("-".repeat(30));
    }
}
