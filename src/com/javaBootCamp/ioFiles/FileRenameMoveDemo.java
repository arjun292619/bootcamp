package com.javaBootCamp.ioFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileRenameMoveDemo {
    public static void main(String[] args) {
//        File oldFile = new File("testfile.txt");
//        File newFile = new File("renamedTestfile.txt");
//
//        if (oldFile.exists()) {
//            oldFile.renameTo(newFile);
//            System.out.println("File renamed successfully");
//        } else {
//            System.out.println("File does not exist");
//        }
//
//        Path oldPath = oldFile.toPath();
//        Path newPath = newFile.toPath();

//        Path oldPath = Path.of("testfile.txt");
//        Path newPath = Path.of("files/testfile.txt");

//        try {
//            Files.createDirectories(newPath.subpath(0, newPath.getNameCount() - 1));
//            Files.move(oldPath, newPath);
////            System.out.println("Path renamed successfully");
//            System.out.println(oldPath + "moved and renamed successfully" + newPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Path fileDir = Path.of("files");
//        Path resourcesDir = Path.of("resources");
//        try {
//            Files.move(fileDir, resourcesDir);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Path fileDir = Path.of("files");
        Path resourcesDir = Path.of("resources");
        try {
            Files.copy(fileDir, resourcesDir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
