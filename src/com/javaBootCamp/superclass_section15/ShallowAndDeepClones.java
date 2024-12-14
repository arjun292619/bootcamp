package com.javaBootCamp.superclass_section15;

public class ShallowAndDeepClones {
    public static void main(String[] args) {
        Course math = new Course("Basic Math", "M01");
        Student betty = new Student("Betty", math);
        Student bettyDupe = betty.clone();
        System.out.println(betty == bettyDupe);
        System.out.println(betty.getCourse() == bettyDupe.getCourse());

        CourseDeepCloned math1 = new CourseDeepCloned("Basic Math", "M01");
        CourseDeepCloned music = new CourseDeepCloned("Piano", "Msc02");
        StudentDeepCloned archie = new StudentDeepCloned("Archie", math1);
        StudentDeepCloned archieDupe = archie.clone();
        System.out.println(archieDupe == archie);
        System.out.println(archie.getCourse() == archieDupe.getCourse());
        System.out.println(archieDupe);
        archieDupe.setCourse(music);
        System.out.println(archie);
        System.out.println(archieDupe);
    }
}
