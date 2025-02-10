package com.javaBootCamp.nutsNBolts.bigdecimal.regExp;

import java.util.Arrays;
import java.util.Scanner;

public class RegExDemo {
    public static void main(String[] args) {
        String song = """
                Double, double toil and trouble;
                Fire burn and caldron bubble.
                Fillet of a fenny snake,
                In the caldron boil and bake;
                Eye of newt and toe of frog,
                Wool of bat and tongue of dog,
                Adder's fork and blind-worm's sting,
                Lizard's leg and howlet's wing,
                For a charm of powerful trouble,
                Like a hell-broth boil and bubble.
                
                Double, double toil and trouble;
                Fire burn and caldron bubble.
                Cool it with a baboon's blood,
                Then the charm is firm and good.
                """;
        String[] lines = song.split("\\R");
        System.out.println("This song has " + lines.length + " lines");
        String[] words = song.split("\\s");
        System.out.println("This song has " + words.length + " words");
        System.out.println(song.replaceAll("[a-zA-z]*ble", "[GRUB]"));
        System.out.println("-".repeat(30));
        Scanner scanner = new Scanner(song);
        System.out.println(scanner.delimiter());
        scanner.useDelimiter("\\R");
//        while (scanner.hasNext()) {
//            System.out.println(scanner.next());
//        }
//        scanner.tokens().map(line -> line.split("\\s").length).forEach(System.out::println);
        scanner.tokens().flatMap(line -> Arrays.stream(line.split("\\s+"))).filter(s -> s.matches("[a-zA-Z]+ble.?")).forEach(System.out::println);
        scanner.close();

//        -----------------------------------------
        System.out.println("-".repeat(30));
        String testString = "Anyone can learn abc's,123's, and any regular expressions";
        String replacement = "(-)";
//        String[] patterns = {"abc", "123", "A"};
//        String[] patterns = {"[abc]", "[123]", "[A]"};
//        String[] patterns = {"ab|bc", "[123]", "[A]"};
//        String[] patterns = {"[a-z]", "[1-9]", "[A-Z]"};
//        String[] patterns = {"[a-z]+", "[1-9]", "[A-Z]"};
//        String[] patterns = {"[a-zA-Z]*", "[1-9]+", "[A-Z]"};
        String[] patterns = {"[a-zA-Z]*$", "[a-z]{3}", "[1-9]+", "[aA]ny\\b"};

        for (String pattern : patterns) {
            String output = testString.replaceFirst(pattern, replacement);
            System.out.println(output);
        }

//        -----------------------------------------
        System.out.println("-".repeat(30));
        String word1 = "%s %s";
        System.out.println(word1.replaceFirst(word1, "Learn Regex Patterns"));
        String word = RegExDemo.format(word1, "Learn", "Regex", "Patterns");
        System.out.println(word);
    }

    private static String format(String regex, String... list) {
        int index = 0;
        while (regex.matches(".*%s.*")) {
            regex = regex.replaceFirst("%s", list[index++]);
        }
        return regex;
    }
}
