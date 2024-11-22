package com.javaBootCamp.hashmap_section20;

import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> mapper = new HashMap<>();
        mapper.put("a", 100);
        mapper.put("b", 200);
        mapper.put("c", 300);
        mapper.put("d", 400);

        processMap(mapper);

        Map<String, Integer> immutableMapper = Map.of("a", 1, "b", 2, "c", 3);
        processMap(immutableMapper);

        Map<String, Integer> immutableMapper1 = Map.ofEntries(Map.entry("abc", 2), Map.entry("def", 4), Map.entry("ghi", 6), Map.entry("jkl", 8), Map.entry("mno", 10));
        processMap(immutableMapper1);

    }

    public static void processMap(Map<String, Integer> mapper) {
        mapper.put("z", 1000);
        for (Map.Entry<String, Integer> entry : mapper.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
