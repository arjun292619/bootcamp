package com.javaBootCamp.streams_section26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreationDemo {
    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>(List.of("accounting", "hr", "supply", "logistics", "it"));
        Stream<String> depStream = departmentList.stream();
//        depStream.forEach(department -> System.out.println(department));
        depStream.forEach(System.out::println);
        System.out.println("-".repeat(30));
        Stream<String> parallelStream = departmentList.parallelStream();
        parallelStream.forEach(System.out::println);
        System.out.println("-".repeat(30));
        departmentList.stream().parallel().forEach(System.out::println);

        String[] cities = {"Chicago", "Melbourne", "Paris", "London", "Tokyo", "Singapore", "Kuwait", "Portland", "Seattle", "Dallas", "Houston"};
//        Convert an array to stream
        System.out.println("-".repeat(30));
        Stream<String> cityStream = Arrays.stream(cities);
        cityStream.forEach(System.out::println);

//        create and empty stream
        Stream<String> emptyStream = Stream.empty();

//        generate infinite stream data
        System.out.println("-".repeat(30));
        Stream.generate(new Random()::nextInt).limit(25).forEach(System.out::println);
        System.out.println("-".repeat(30));

        //        generate infinite stream data with iterate
        Stream.iterate(1, n -> n * 2).limit(15).forEach(System.out::println);

    }
}
