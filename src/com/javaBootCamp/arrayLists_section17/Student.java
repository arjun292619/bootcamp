package com.javaBootCamp.arrayLists_section17;

public class Student implements Comparable<Student> {
    private String name;
    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    private int marks;

    public Student(String name, long id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{name: %s, id: %d, marks: %d}".formatted(name, id, marks);
    }

    @Override
    public int compareTo(Student student) {
//        return Integer.compare(this.marks, student.marks);
        int nameComparision = this.name.compareTo(student.name);
        if (nameComparision == 0) {
            return Long.compare(this.id, student.id);
        }
        return nameComparision;
    }
}
