package com.javaBootCamp.ioFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.stream.Stream;

public class FileListings {
    public static void main(String[] args) {
        System.out.println("-".repeat(30));
        Path currentPath = Path.of("");
        System.out.println("absolute path of cwd: " + currentPath.toAbsolutePath());

//        Using List to list the files and print the contents
        System.out.println("-".repeat(20) + "using List" + "-".repeat(20));

        try (Stream<Path> paths = Files.list(currentPath)) {
            paths
                    .map(FileListings::listDir)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("-".repeat(50));

//        Using List to list the files and print the contents
        System.out.println("-".repeat(20) + "using Walk" + "-".repeat(20));
        try (var paths = Files.walk(currentPath, 2)) {
            paths
                    .filter(Files::isRegularFile)
                    .map(FileListings::listDir)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-".repeat(50));

//        Using List to list the files and print the contents
        System.out.println("-".repeat(20) + "Using Find" + "-".repeat(20));
        try (var paths = Files.find(currentPath, Integer.MAX_VALUE, (p, attr) -> attr.isRegularFile() && attr.size() > 800)) {
            paths
                    .map(FileListings::listDir)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-".repeat(50));

//        Using List to list the files and print the contents
        System.out.println("=".repeat(20) + "Using Directory Stream" + "=".repeat(20));
        Path subPath = currentPath.resolve(".idea");
        try (var pathsStream = Files.newDirectoryStream(subPath, "*.xml")) {
            pathsStream
                    .forEach(d -> System.out.println(FileListings.listDir(d)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String listDir(Path path) {
        try {
            boolean isDir = Files.isDirectory(path);
            var lModTime = Files.getLastModifiedTime(path);
            LocalDateTime localDateTime = LocalDateTime.ofInstant(lModTime.toInstant(), ZoneId.systemDefault());
            return "%tD %tT %-5s %12s %s".formatted(localDateTime, localDateTime, (isDir ? "<DIR>" : ""), (isDir ? "" : Files.size(path)), path);
        } catch (IOException e) {
            System.out.println("Something went wrong");
            return path.toString();
        }
    }
}
