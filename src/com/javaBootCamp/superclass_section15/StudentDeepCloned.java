package com.javaBootCamp.superclass_section15;

public class StudentDeepCloned implements Cloneable {
    private String name;
    private CourseDeepCloned course;

    public StudentDeepCloned(String name, CourseDeepCloned course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseDeepCloned getCourse() {
        return course;
    }

    public void setCourse(CourseDeepCloned course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public StudentDeepCloned clone() {
        try {
            StudentDeepCloned clone = (StudentDeepCloned) super.clone();
            clone.setCourse(clone.getCourse().clone());
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
