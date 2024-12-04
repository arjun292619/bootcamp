package com.javaBootCamp.streams_section26;

import java.util.ArrayList;
import java.util.List;
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
    }
}
