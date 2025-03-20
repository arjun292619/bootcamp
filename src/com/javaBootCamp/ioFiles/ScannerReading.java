package com.javaBootCamp.ioFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerReading {
    public static void main(String[] args) {
        String docPath = "files/declarationOfIndependence.txt";
        String fixedFilePath = "files/fixedWidth.txt";
        System.out.println("=".repeat(25) + "Buffered Reader" + "=".repeat(25));

//        Using scanner to read the fixed width file
        try (Scanner sc = new Scanner(Path.of(fixedFilePath))) {
            var results = sc.findAll("(.{15})(.{3})(.{12})(.{8})(.{2}).*")
                    .map(m -> m.group(3).trim())
                    .skip(1)
                    .distinct()
                    .sorted()
                    .toArray(String[]::new);
            System.out.println(Arrays.toString(results));
        } catch (IOException e) {
            e.printStackTrace();
        }


        //        Using scanner to read a file
        System.out.println("=".repeat(25) + "Buffered Reader" + "=".repeat(25));
        try (Scanner scanner = new Scanner(new File(docPath))) {
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
            System.out.println(scanner.delimiter());
//            Using scanner tokens to display and print as a stream
            scanner.useDelimiter("$");
            System.out.println(scanner.delimiter());
//            scanner.tokens().forEach(System.out::println);
            System.out.println("=".repeat(25) + "Buffered Reader" + "=".repeat(25));
            scanner
                    .findAll("[A-Za-z]{10,}")
                    .map(MatchResult::group)
                    .distinct()
                    .sorted()
                    .forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
