package com.javaBootCamp.primitives_section2;

import javax.print.attribute.standard.MediaSize;
import java.sql.SQLOutput;
import java.util.Arrays;

public class StringPools {
    public static void main(String[] args) {
        String sentence1 = "Lorem ipsum odor amet";
        String sentence2 = "consectetuer adipiscing elit";
        String sentence3 = "Feugiat non taciti luctus dapibus ligula ullamcorper leo";
        String sentence4 = new String("Lorem ipsum odor amet");
        String sentence5 = "Lorem ipsum odor amet";
        String concatSentence = sentence1.concat(sentence2) + ". ".concat(sentence3);
        System.out.println(concatSentence);
        System.out.println(sentence1 == sentence4);
        System.out.println(sentence1 == sentence5);
//        sentence4 = sentence4.intern();
        System.out.println(sentence1 == sentence4);
        System.out.println(sentence5 == sentence4);
        String sentence6 = "Peter\t\"s Hat fell in the mud";
        String sentence7 = "Happy\u263A Sad\u2639 Angry\uD83D";
        System.out.println(sentence6);
        System.out.println(sentence7);
//        String Length
        System.out.println("sentence 7 length: " + sentence7.length());
        System.out.println("empty string length: " + "".length());
        System.out.println("string literal length: " + "consectetuer adipiscing elit".length());
        System.out.println("string literal length: " + "consectetuer adipiscing elit     ".length());

//        String comparison
        System.out.println(sentence1.equals(sentence5));
        System.out.println(sentence1.equals(sentence3));
        System.out.println(sentence1.equals(sentence4));

        String word1 = "loremipsum";
        String word1Capitalized = "LOREMIPSUM";
        System.out.println(word1.equals(word1Capitalized));
        System.out.println(word1.equalsIgnoreCase(word1Capitalized));
//        String comparing for sorting
        String word2 = "abcd";
        String word2Capitalized = "ABCD";
        String lettera = "a";
        String letterA = "A";
        String letterB = "b";
        System.out.println(lettera.compareTo(lettera));
        System.out.println(lettera.compareTo(letterA));
        System.out.println(letterB.compareTo(lettera));
        System.out.println(word2Capitalized.compareTo(word2));
        System.out.println(word2.compareTo(word2Capitalized));
//        fetch using an index
        System.out.println(word2.charAt(0));
        System.out.println(word2.charAt(1));
        System.out.println(word2.charAt(2));
        System.out.println(word2.charAt(3));

//        changing the case of the string
        String loweredWord2 = word2Capitalized.toLowerCase();
        System.out.println(word2.toUpperCase());
        System.out.println(loweredWord2);

//        check if the string is empty
        boolean isEmpty1 = sentence1.isEmpty();
        System.out.println(isEmpty1);
        System.out.println("".equals(sentence3));
        System.out.println("".equals(null));
        String myString = null;
        System.out.println("".equals(myString));
//        System.out.println(myString.isEmpty());

        //convert various data type to string representations
        int number = 24;
        long longValue = 34469923267L;
        boolean isFlag = false;
        float floatVal = 3.1456f;
        double doubleVal = 3.5609765757685685d;
        String intString = String.valueOf(number);
        String longString = String.valueOf(longValue);
        String flagString = String.valueOf(isFlag);
        String floatString = String.valueOf(floatVal);
        String doubleString = String.valueOf(doubleVal);
        System.out.println("intString: " + intString);
        System.out.println("longString: " + longString);
        System.out.println("flagString: " + flagString);
        System.out.println("floatString: " + floatString);
        System.out.println("doubleString: " + doubleString);
        String piValue = "" + 3.142;
        System.out.println(piValue);
//        searching for a value in a string
        String originalString = "Lorem ipsum odor amet";
        int loremindex = originalString.indexOf("do");
        int index = originalString.indexOf('m');
        System.out.println(loremindex);
        System.out.println(index);
        boolean isPresent = originalString.contains("ame");
        System.out.println(isPresent);
        boolean isMatch = originalString.matches(".*em*.");
        System.out.println(isMatch);
//        string trimming
        System.out.println("\n\tLorem ipsum odor amet\t   \n".trim());
        System.out.println("\n\tLorem ipsum odor amet\t   ");
//        extracting substring
        String subStr = originalString.substring(6);
        System.out.println(subStr);
        String subStr1 = originalString.substring(6, 11);
        System.out.println(subStr1);
//        replace a string
        String replacedString1 = originalString.replace('m', '*');
        System.out.println(replacedString1);
        String replacedString2 = originalString.replace("ipsum", "consecutor");
        System.out.println(replacedString2);
/*        String replacedString3 = originalString.replaceAll("Lor","$");
        System.out.println(replacedString3);*/

//        splitting a string into array
        String joinedString = "apples,oranges,bananas,grapes";
        String[] fruits = joinedString.split(",");
        System.out.println(Arrays.toString(fruits));
        String[] loremArr = originalString.split("");
        System.out.println(Arrays.toString(loremArr));
//         joining strings
        String joined1 = String.join(" ", "Lorem", "ipsum", "odor", "Amet");
        System.out.println(joined1);
        String joined2 = String.join("", loremArr);
        String joined3 = String.join("+", fruits);
        System.out.println(joined2);
        System.out.println(joined3);

//        formatted String
        String hurricane = "Milton";
        int strength = 5;
        long population = 3567928857574L;
        String city = "Tampa";
        double damage = 15678335454.4546445454d;
        String formattedString1 = String.format("Hurricane %s is category %02d and it is estimated that %d people are evacuated from %s and estimated damage to property to be %.2f.", hurricane, strength, population, city, damage);
        System.out.println(formattedString1);
        String paddedStr = String.format("The  number %d is padded with %d zeros to look like this: %08d", 2345, 8, 2345);
        System.out.println(paddedStr);
        String name = "John";
        int age = 36;
        String formattedMsg1 = String.format("%2$s is %1$d years old", age, name);
        System.out.println(formattedMsg1);


//        creating mutable strings
        StringBuilder mutableStr1 = new StringBuilder("Penatibus");
        mutableStr1.append(" praesent");
        System.out.println(mutableStr1.toString());
        mutableStr1.insert(9, " cursus");
        System.out.println(mutableStr1.toString());
        mutableStr1.append(" elementum");
        mutableStr1.reverse();
        System.out.println(mutableStr1.toString());
        mutableStr1.deleteCharAt(2);
        mutableStr1.setLength(5);
        System.out.println(mutableStr1.toString());

//        textblocks
        String htmlCode = """
                <html>
                    <body>
                        <p>Sample Text block</p>
                    </body>
                </html>
                """;
        System.out.println(htmlCode);

        String commute = "train";
        String tb = """
                %s is %d year old
                    and takes a
                        %s to go to work""";

        String formattedTb = String.format(tb, name, age, commute);
        System.out.println(formattedTb);

        //parsing string to primitive data type
        String intNum = "456";
        int intVal = Integer.parseInt(intNum);
        System.out.println(intVal);
        String floatStr = "3.145";
        float floatValue = Float.parseFloat(floatStr);
        System.out.println(floatValue);
        String dblString = "345.67895646454";
        double dblValue = Double.parseDouble(dblString);
        System.out.println(dblValue);

//        to character array
        char[] charArray = sentence1.toCharArray();
        System.out.println(Arrays.toString(charArray));

    }
}
