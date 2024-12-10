package com.javaBootCamp.optonal_section27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamsApiNullCheck {
    public static void main(String[] args) {
//        List<String> capitals = new ArrayList<>(List.of("Washinton DC", null, "Toronto", "Tokyo", "London", null, "Singapore", null, "Paris"));
        List<String> capitals = Arrays.asList("Washinton DC", null, "Toronto", "Tokyo", "London", null, "Singapore", null, "Paris");
//        var mappedList= capitals.stream().map(String::toUpperCase).toList();
        var mappedList = capitals.stream().filter(Objects::nonNull).map(String::toUpperCase).toList();
        System.out.println(mappedList);
    }
}
