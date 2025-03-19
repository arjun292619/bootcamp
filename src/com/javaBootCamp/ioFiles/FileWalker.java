package com.javaBootCamp.ioFiles;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class FileWalker {
    public static void main(String[] args) {
        Path startingPath = Path.of(".");
        FileVisitor<Path> statsVisitor = new StatsVisitor();
        try {
            Files.walkFileTree(startingPath, statsVisitor);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static class StatsVisitor extends SimpleFileVisitor<Path> {
        private Path initialPath = null;
        private final Map<Path, Long> folderSizes = new LinkedHashMap<>();
        private int initialCount;

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            Objects.requireNonNull(file);
            Objects.requireNonNull(attrs);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            Objects.requireNonNull(dir);
            Objects.requireNonNull(attrs);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            Objects.requireNonNull(dir);
//            if (exc != null)
//                throw exc;
            return FileVisitResult.CONTINUE;
        }
    }

//    private static class StatsVisitor extends SimpleFileVisitor<Path> {
//
//        private int level;
//
//        @Override
//        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//            Objects.requireNonNull(file);
//            Objects.requireNonNull(attrs);
//            System.out.println("\t".repeat(level+1) + file.getFileName());
//            return FileVisitResult.CONTINUE;
//        }
//
//        @Override
//        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
//            Objects.requireNonNull(dir);
//            Objects.requireNonNull(attrs);
//            level++;
//            System.out.println("\t".repeat(level) + dir.getFileName());
//            return FileVisitResult.CONTINUE;
//        }
//
//        @Override
//        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
//            Objects.requireNonNull(dir);
////            if (exc != null)
////                throw exc;
//            level--;
//            return FileVisitResult.CONTINUE;
//        }
//    }
}
