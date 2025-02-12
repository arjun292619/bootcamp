package com.javaBootCamp.nutsNBolts.regExp;

public class RegexExercises {
    public static void main(String[] args) {
        String sentence1 = "Hello World This is a beautiful day.";
        String sentence1_2 = "Hello World";

        System.out.println(sentence1.matches("Hello World*"));
        System.out.println(sentence1_2.matches("Hello World"));
        System.out.println(sentence1_2.contains("Hello World"));

        System.out.println();
        System.out.println("Challenge 2");
        System.out.println("_".repeat(50));

//        String pattern2 = "[A-Z][a-z\\s]*[.]?";
        String pattern2 = "[A-Z][a-z\\s]+[.]?";
        String[] challenge2 = {"The bike is red", "I am a new student", "hello World", "How are you?", "Look its a butterfly!"};
        for (String s : challenge2) {
            boolean result = s.matches(pattern2);
            System.out.println(result + " : " + s);
        }
        System.out.println();
        System.out.println("Challenge 3");
        System.out.println("_".repeat(50));
//        String pattern3 = "[A-Z][a-z\\s]*[.!?]$";
//        String pattern3 = "[A-Z].*[.!?]$";
        String pattern3 = "^[A-Z]\\p{all}*[.!?]$";
        String[] challenge3 = {"The bike is red, and has flat tires.", "I am a new student", "hello World", "How are you, Mary?", "Look it's a butterfly!"};
        for (String s : challenge3) {
            boolean result = s.matches(pattern3);
            System.out.println(result + " : " + s);
        }
    }
}
