package com.javaBootCamp.ioFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Instant;

public class PathListings {
    public static void main(String[] args) {
        Path testPath = Path.of("files/testing.txt");
        Path nestedPath = Path.of("this/is/severa;/folders/deep/testing.txt");
//        printPathInfo(testPath);
        logStatement(testPath);
        logStatement(nestedPath);
        printAttributeInfo(testPath);
    }

    private static void printPathInfo(Path path) {
        System.out.println("Path: " + path);
        System.out.println("filename: " + path.getFileName());
        System.out.println("parent: " + path.getParent());
        Path absolutePath = path.toAbsolutePath();
        System.out.println("Absolute path: " + absolutePath);
        System.out.println("Absolute path root: " + absolutePath.getRoot());
        System.out.println("Root:" + path.getRoot());
        System.out.println("isAbsolute: " + path.isAbsolute());

//        int i = 1;
//        Iterator<Path> pathIterator = path.toAbsolutePath().iterator();
//        while (pathIterator.hasNext()) {
//            System.out.println(".".repeat(i++) + " " + pathIterator.next());
//        }

        for (int i = 0; i < absolutePath.getNameCount(); i++) {
            System.out.println(".".repeat(i + 1) + " " + absolutePath.getName(i));
        }
        System.out.println("-".repeat(40));
    }

    private static void logStatement(Path path) {
        Path parent = path.getParent();
        try {
            if (!Files.exists(parent)) {
//                Files.createDirectory(parent);
                Files.createDirectories(parent);
            }
            Files.writeString(path, Instant.now() + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur \n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void printAttributeInfo(Path path) {
        try {
            var attrs = Files.readAttributes(path, "*");
            attrs.entrySet().forEach(System.out::println);
            System.out.println(Files.probeContentType(path));
        } catch (IOException e) {
            System.out.println("Problem getting attributes");
            e.printStackTrace();
        }
    }
}
