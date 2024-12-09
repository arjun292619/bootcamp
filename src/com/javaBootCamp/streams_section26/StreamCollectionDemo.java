package com.javaBootCamp.streams_section26;

import java.util.*;
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

        List<Product> products = getProducts();

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

        var pocList = persons.stream().filter(person -> person.phoneNumbers().size() > 3).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(pocList);
        System.out.println("-".repeat(30));

        var maxProduct = products.stream().collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Product::price)), optionaProduct -> optionaProduct.isPresent() ? optionaProduct.get().product() : "None"));
        System.out.println(maxProduct);
        System.out.println("-".repeat(30));

        var minProduct = products.stream().collect(Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Product::price)), optionaProduct -> optionaProduct.isPresent() ? optionaProduct.get().product() : "None"));
        System.out.println(minProduct);
        System.out.println("-".repeat(30));

        var groupedProducts = products.stream().collect(Collectors.groupingBy(Product::brand));
        System.out.println(groupedProducts);

        var partitionedProducts = products.stream().collect(Collectors.partitioningBy(product -> product.price() > 2000));
        System.out.println(partitionedProducts);
    }

    private static List<Product> getProducts() {
        return List.of(
                new Product("Apple", "Apple Iphone", 1299),
                new Product("Apple", "Apple macbook", 3499),
                new Product("Samsung", "Samsung galaxy", 1199),
                new Product("Sony", "Sony PS5", 699),
                new Product("Microsoft", "Xbox XS", 599),
                new Product("Samsung", "Samsung TV", 2299),
                new Product("Dyson", "Dyson Vaccum", 799),
                new Product("Sony", "Sony alpha Camera", 3399)
        );
    }
}
