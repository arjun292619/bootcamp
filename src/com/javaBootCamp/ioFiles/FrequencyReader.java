package com.javaBootCamp.ioFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FrequencyReader {
    public static void main(String[] args) {
        int count = 0;
        String articlepath = "files/grandCanyon.txt";
        String bigBenpath = "files/bigben.txt";
        System.out.println("\n" + "-".repeat(40));
        try (BufferedReader br = new BufferedReader(new FileReader(bigBenpath))) {
//            System.out.printf(" %,d lines in the file %n", br.lines().count());
            Pattern pattern = Pattern.compile("\\p{javaWhitespace}+");

//            Pattern pattern1 = Pattern.compile("(Canyon)");
//            br.lines().forEach(System.out::println);

//            br.lines()
//                    .map(line->line.split(pattern.toString()))
//                            .forEach(arr-> System.out.println(Arrays.toString(arr)));

//            Long wordCount = br.lines()
//                    .flatMap(line -> Arrays.stream(line.split(pattern.toString())))
////                    .flatMap(pattern::splitAsStream)
//                    .count();

//            Long wordCount = br.lines()
//                    .mapToLong(line -> line.split(pattern.toString()).length)
//                    .sum();
//            System.out.printf("%,d words in the file", wordCount);

//            print the list of all the words greater than length 4
//            var result = br.lines()
//                    .flatMap(pattern::splitAsStream)
//                    .map(word -> word.replaceAll("\\p{Punct}", ""))
//                    .filter(word -> word.length() > 4)
//                    .map(String::toLowerCase)
//                    .sorted()
//                    .toList();
//            System.out.println(result.toString());

            List<String> excludedWords = List.of("grand", "canyon", "which", "along", "retrieved");

            var result = br.lines()
                    .flatMap(pattern::splitAsStream)
                    .map(word -> word.replaceAll("\\p{Punct}", ""))
                    .filter(word -> word.length() > 4)
                    .map(String::toLowerCase)
                    .filter(w -> !excludedWords.contains(w))
                    .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

            result.entrySet()
                    .stream()
                    .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                    .limit(10)
                    .forEach(entry -> {
                        System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n" + "-".repeat(40));
        try {
            String bigBen = Files.readString(Path.of(bigBenpath));
            bigBen = bigBen.replaceAll("\\p{javaWhitespace}", "");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
