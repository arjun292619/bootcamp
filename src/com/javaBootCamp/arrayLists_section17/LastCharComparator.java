package com.javaBootCamp.arrayLists_section17;

import java.util.Comparator;

public class LastCharComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        char c1 = s1.charAt(s1.length() - 1);
        char c2 = s2.charAt(s2.length() - 1);
        return Character.compare(c1, c2);
    }
}
