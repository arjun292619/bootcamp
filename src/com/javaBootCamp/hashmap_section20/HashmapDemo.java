package com.javaBootCamp.hashmap_section20;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
    public static void main(String[] args) {
//        Initilize Map
        Map<String, String> countriesMap = new HashMap<>();
        countriesMap.put("India", "New Delhi");
        countriesMap.put("UK", "London");
        countriesMap.put("USA", "London");
        countriesMap.put("China", "Beijing");
        countriesMap.put("Japan", "Tokyo");
        countriesMap.put("Germany", "Berlin");
        countriesMap.put(null, null);
// print the map
        System.out.println(countriesMap);

//        get the values from map
        System.out.println(countriesMap.size());
        System.out.println(countriesMap.get("USA"));
        countriesMap.remove(null);
        System.out.println(countriesMap.size());
        System.out.println();

    }
}
