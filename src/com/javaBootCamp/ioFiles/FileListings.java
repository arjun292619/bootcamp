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
        System.out.println("-".repeat(30));
        try (Stream<Path> paths = Files.list(currentPath)) {
            paths
                    .map(FileListings::listDir)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
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
