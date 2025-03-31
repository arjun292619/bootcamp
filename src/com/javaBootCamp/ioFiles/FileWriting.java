package com.javaBootCamp.ioFiles;

import com.javaBootCamp.ioFiles.student.Course;
import com.javaBootCamp.ioFiles.student.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FileWriting {
    public static void main(String[] args) {
        String header = """
                Student Id,Country Code,Enrolled Year,Age,Gender,\
                Experienced,Course,Code,Engagement Month,Engagement Year,\
                Engagement Type""";
        Course jmc = new Course("JMC", "Java Masterclass");
        Course pymc = new Course("PYC", "Python Masterclass");
        Course rmc = new Course("RMC", "React Masterclass");

        List<Student> students = Stream
                .generate(() -> Student.getRandomStudent(jmc, pymc, rmc))
                .limit(5)
                .toList();
        System.out.println(students);

        System.out.println(header);
        students.forEach(student -> student.getEngagementRecords().forEach(System.out::println));

        Path studentPath = Path.of("student.csv");

//        Basic Write file Example where Files.write opens and closes
//        try {
//            Files.writeString(studentPath, header);
//            for (Student student : students) {
//                Files.write(studentPath, student.getEngagementRecords(), StandardOpenOption.APPEND);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

// Add it to a List and use Files.write once to complete writing
//        try {
//            List<String> data = new ArrayList<>();
//            data.add(header);
//            for (Student student : students) {
//                data.addAll(student.getEngagementRecords());
//            }
//            Files.write(studentPath, data);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try (BufferedWriter bwriter  = Files.newBufferedWriter(Path.of("students2.csv"))){
            bwriter.write(header);
            bwriter.newLine();
            for (Student student: students){
                for (String record: student.getEngagementRecords()){
                    bwriter.write(record);
                    bwriter.newLine();
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        try (FileWriter fw = new FileWriter("students3.csv")){
            fw.write(header);
            for (Student student: students){
                for (String record: student.getEngagementRecords()){
                    fw.write(record);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter("students4.csv")){
            printWriter.write(header);
            for (Student student: students){
                for (String record: student.getEngagementRecords()){
                    printWriter.println(record);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }


    }


}
