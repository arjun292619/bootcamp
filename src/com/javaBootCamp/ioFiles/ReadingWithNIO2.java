package com.javaBootCamp.ioFiles;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReadingWithNIO2 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("file.encoding"));
        System.out.println(Charset.defaultCharset());
        Path fixedFilePath = Path.of("fixedWidth.txt");
        try {
            System.out.println(new String(Files.readAllBytes(fixedFilePath)));
            System.out.println("-".repeat(30));
            System.out.println(new String(Files.readString(fixedFilePath)));
            Pattern pattern = Pattern.compile("(.{15})(.{3})(.{12})(.{8})(.{2}).*");
            Set<String> values = new TreeSet<>();
            Files.readAllLines(fixedFilePath).stream().skip(1).forEach(s -> {
                Matcher matcher = pattern.matcher(s);
                if (matcher.matches()) {
                    values.add(matcher.group(3).trim());
                }
            });
            System.out.println(values);

            try (var stringStream = Files.lines(fixedFilePath)) {
                var results = stringStream.skip(1)
                        .map(pattern::matcher)
                        .filter(Matcher::matches)
                        .map(m -> m.group(3).trim())
                        .distinct()
                        .sorted()
                        .toArray(String[]::new);
                System.out.println(Arrays.toString(results));
            }
            System.out.println("-".repeat(30));
            try (var stringStr = Files.lines(fixedFilePath)) {
                var results1 = stringStr.skip(1)
                        .map(pattern::matcher)
                        .filter(Matcher::matches)
                        .collect(Collectors.groupingBy(m -> m.group(3), Collectors.counting()));
                results1.entrySet().forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
