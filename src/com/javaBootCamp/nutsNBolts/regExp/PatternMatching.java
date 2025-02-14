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
        System.out.println("get substring of the result from matcher: " + matcher1.group());
        System.out.println("-".repeat(36));

        String htmlSnippet = """
                <h1> My big Heading</h1>
                <h2> sub-heading of size h2</h3>
                <H3> small-heading of size h3</H3>
                <p>This is a paragraph about something</p>
                <p>This is another paragraph about something about something more</p>
                <h3> This a summary</h3>
                """;
        Pattern htmlPattern = Pattern.compile("<[hH](\\d)>(.*)</[hH]\\d>");
        Matcher htmlMatcher = htmlPattern.matcher(htmlSnippet);

        while (htmlMatcher.find()) {
            System.out.println("group:- " + htmlMatcher.group());
        }

        htmlMatcher.reset();
        System.out.println("-".repeat(36));
        System.out.println("Demo of grouping and Capturing");
        while (htmlMatcher.find()) {
            System.out.println("sub strings from group " + htmlMatcher.group(1) + ":- " + htmlMatcher.group(2));
        }

        htmlMatcher.reset();
        System.out.println("-".repeat(36));
        System.out.println("Print matches with lambda expression version");
        htmlMatcher.results().forEach(matchResult -> System.out.println(matchResult.group(1) + " : " + matchResult.group(2)));

        htmlMatcher.reset();
        System.out.println("-".repeat(36));
        System.out.println("Replace regex string using pattern matcher");
//        String replacement = "Updated Heading h1";
//        String updatedSnippet = htmlMatcher.replaceFirst(replacement);
//        replacing by appending to the current string
        String updatedSnippet = htmlMatcher.replaceFirst(s -> "<em>" + htmlMatcher.group(2) + "</em>");
        System.out.println("updated Snippet after replacement: \n" + updatedSnippet);

        htmlMatcher.reset();
        System.out.println("-".repeat(36));
        System.out.println("Replace all regex string using pattern matcher");
        String replacedString = htmlMatcher.replaceAll("<em>$2 </em>");
        System.out.println("after replacement: \n" + replacedString);
    }
}
