package com.javaBootCamp.nutsNBolts.regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
    public static void main(String[] args) {
        String line1 = "I like b.M.w. motorcycles!";
        boolean matched = Pattern.matches("[A-Z][a-z\\s]*[.!?]", line1);
        System.out.printf("%b: %s%n", matched, line1);
        System.out.println("-".repeat(36));
        Pattern pattern1 = Pattern.compile("[A-Z].*?[.!]");
        Matcher matcher1 = pattern1.matcher(line1);
        System.out.println("Matcher matches method");
        System.out.printf("%b : %s%n", matcher1.matches(), line1);
        System.out.println("line length: " + line1.length());
        System.out.println("matcher ending index: " + matcher1.end());
        System.out.println("-".repeat(36));
        System.out.println("Matcher lookingAt method");
        System.out.printf("%b : %s%n", matcher1.lookingAt(), line1);
        System.out.println("matcher ending index: " + matcher1.end());
        System.out.println("search matched on result: " + line1.substring(0, matcher1.end()));
        System.out.println("-".repeat(36));
        System.out.println("Matcher find method");
        matcher1.reset();
        System.out.printf("%b : %s%n", matcher1.find(), line1);
        System.out.println("matcher ending index: " + matcher1.end());
        System.out.println("search matched on result: " + line1.substring(matcher1.start(), matcher1.end()));
    }
}
