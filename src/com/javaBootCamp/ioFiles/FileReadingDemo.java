package com.javaBootCamp.ioFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadingDemo {
    public static void main(String[] args) {
        useFile("testfile.txt");
//        useFile("testfile2.txt");
        usePath("pathfile.txt");
    }

    private static void useFile(String filename) {
        File file = new File(filename);
        boolean fileExists = file.exists();

        System.out.printf("Files '%s' %s%n", filename, fileExists ? "exists" : "does not exist");

        if (fileExists) {
            System.out.println("Deleting the file " + filename);
            fileExists = !file.delete();
        }

        if (!fileExists) {
            try {
                file.createNewFile();
                System.out.println("Created a new file " + filename);
                if (file.canWrite()) {
                    System.out.println("Would write to a file here");
                }
            } catch (IOException e) {
//                throw new RuntimeException(e);
                System.out.println("Something went wrong here");
            }
        }
    }

    private static void usePath(String filename) {
        Path path = Path.of(filename);
        boolean fileExists = Files.exists(path);
        System.out.printf("Files '%s' %s%n", filename, fileExists ? "exists" : "does not exist");

        if (fileExists) {
            System.out.println("Deleting the file " + filename);
            try {
                Files.delete(path);
                fileExists = false;
            } catch (IOException e) {
//                throw new RuntimeException(e);
                e.printStackTrace();
            }
        }

        if (!fileExists) {
            try {
                Files.createFile(path);
                System.out.println("Created a new file " + filename);
                if (Files.isWritable(path)) {
                    Files.writeString(path, """
                            Writing some sample data
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
                            Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. 
                            Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
                            """);
                }
                System.out.println("-".repeat(36));
                System.out.println("Reading the contents of the file written");
                Files.readAllLines(path).forEach(System.out::println);
            } catch (IOException e) {
//                throw new RuntimeException(e);
                System.out.println("Something went wrong here");
            }
        }
    }
}
