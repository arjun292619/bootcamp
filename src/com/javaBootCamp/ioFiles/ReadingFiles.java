package com.javaBootCamp.ioFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingFiles {
    public static void main(String[] args) {
        String docPath = "files/declarationOfIndependence.txt";

        //        Using Buffered Reader reader
        System.out.println("=".repeat(25) + "Buffered Reader" + "=".repeat(25));
        try (BufferedReader br = new BufferedReader(new FileReader(docPath) {
        })) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Using File reader
        System.out.println("=".repeat(25) + "File reader" + "=".repeat(25));
        try (FileReader fr = new FileReader(docPath)) {
            char[] block = new char[1000];
            int data;
            while ((data = fr.read(block)) != -1) {
//                char chVal = (char) data;
                String content = new String(block, 0, data);
                System.out.printf("--->[%d chars] %s%n", data, content);
//                System.out.println(data + ": " + chVal);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Using read all lines
        System.out.println("=".repeat(25) + "Files.readAllLines" + "=".repeat(25));
        Path filePath = Path.of("file.txt");
        Path testPath = Path.of("files/testing.txt");
        try {
            var result = Files.readAllLines(testPath);
            result.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
